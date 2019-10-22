package com.alchemy.admin.retrofitapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.alchemy.admin.retrofitapp.helper.ApiClient;
import com.alchemy.admin.retrofitapp.interfaces.RequestInterface;
import com.alchemy.admin.retrofitapp.model.Login;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    EditText editTextUsername, editTextPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        editTextUsername = findViewById(R.id.et_email);
        editTextPassword = findViewById(R.id.et_password);
        buttonLogin = findViewById(R.id.btn_login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog = new ProgressDialog(LoginActivity.this);
                progressDialog.setMessage("Please wait......");
                String email = editTextUsername.getText().toString();
                String pwd = editTextPassword.getText().toString();

                if (email.isEmpty() || pwd.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please Enter Email & Password", Toast.LENGTH_LONG).show();
                } else {
                    progressDialog.show();
                    final RequestInterface requestInterface = ApiClient.getClient().create(RequestInterface.class);
                    Call<Login> call = requestInterface.getLogin("2", "9Jyz3SCFUv94nWUmVcHKkjssHfaIovvDONqvV7Y2", email, pwd, "users", "POS");
                    Log.wtf("URL Called", call.request().url() + "");
                    call.enqueue(new Callback<Login>() {
                        @Override
                        public void onResponse(@Nullable Call<Login> call, @Nullable Response<Login> response) {
                            Login login = response.body();
                            if (response.code() == 200) {
                                assert login != null;
                                if (login.isSuccess()) {
                                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                                    Toast.makeText(LoginActivity.this, "Success", Toast.LENGTH_LONG).show();
                                }
                            } else {
                                Toast.makeText(LoginActivity.this, "Wrong", Toast.LENGTH_LONG).show();
                            }

                            MyPreference.getPreferenceManager().putString(Constants.KEY_ACCESS_TOKEN, response.headers().get("access-token"));
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        }

                        @Override
                        public void onFailure(@Nullable Call<Login> call, @Nullable Throwable t) {
                            Log.w(TAG, "onFailure: " + t.getLocalizedMessage());
                            t.printStackTrace();
                            Toast.makeText(LoginActivity.this, "Response error", Toast.LENGTH_LONG).show();
                            if (progressDialog.isShowing()) {
                                progressDialog.dismiss();
                            }
                        }

                    });
                }
            }
        });
    }

}

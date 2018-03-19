package com.example.keval.e_moss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.keval.e_moss.Utils.CommonUtils;

public class SignIn extends AppCompatActivity implements View.OnClickListener {

    Button btSignInSignUp, btSignInSignIn;
    EditText etSignInUserName, etSignInPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btSignInSignUp = (Button) findViewById(R.id.btSignInSignUp);
        btSignInSignIn = (Button) findViewById(R.id.btSignInSignIn);
        etSignInUserName = (EditText) findViewById(R.id.etSignInUserName);
        etSignInPassword = (EditText) findViewById(R.id.etSignInPassword);

        btSignInSignUp.setOnClickListener(this);
        btSignInSignIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btSignInSignUp:

                startActivity(new Intent(SignIn.this, SignUp.class));
                break;
            case R.id.btSignInSignIn:

                if (etSignInUserName.getText().toString().trim() == null || etSignInUserName.getText().toString().trim().equalsIgnoreCase(""))
                    Toast.makeText(this, "Enter UserName", Toast.LENGTH_SHORT).show();
                else if (etSignInPassword.getText().toString().trim() == null || etSignInPassword.getText().toString().trim().equalsIgnoreCase(""))
                    Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
                else if (!CommonUtils.isLegalPassword(etSignInPassword.getText().toString().trim()))
                    Toast.makeText(this, "Password is not supported", Toast.LENGTH_SHORT).show();
                else
                    startActivity(new Intent(SignIn.this, DashBoard.class));
                break;
        }
    }

    @Override
    public void onBackPressed() {
//        CommonUtil.closeKeyboard(this);
        finish();
        super.onBackPressed();
    }
}

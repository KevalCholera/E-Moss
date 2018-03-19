package com.example.keval.e_moss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.keval.e_moss.Utils.CommonUtils;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    Button btSignUpSaveNext;
    ImageView ivSignUpBack, ivSignUpAvailableEmail, ivSignUpUnAvailableEmail, ivSignUpAvailablePass,
            ivSignUpUnAvailablePass, ivSignUpAvailableAlternateEmail, ivSignUpUnAvailableAlternateEmail;
    EditText etSignUpFirstName, etSignUpLastName, etSignUpContact, etSignUpEmail, etSignUpConfirmPassword,
            etSignUpPassword, etSignUpAlternateEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btSignUpSaveNext = (Button) findViewById(R.id.btSignUpSaveNext);
        ivSignUpBack = (ImageView) findViewById(R.id.ivSignUpBack);
        etSignUpFirstName = (EditText) findViewById(R.id.etSignUpFirstName);
        etSignUpLastName = (EditText) findViewById(R.id.etSignUpLastName);
        etSignUpContact = (EditText) findViewById(R.id.etSignUpContact);
        etSignUpEmail = (EditText) findViewById(R.id.etSignUpEmail);
        etSignUpConfirmPassword = (EditText) findViewById(R.id.etSignUpConfirmPassword);
        etSignUpPassword = (EditText) findViewById(R.id.etSignUpPassword);
        etSignUpAlternateEmail = (EditText) findViewById(R.id.etSignUpAlternateEmail);

        btSignUpSaveNext.setOnClickListener(this);
        ivSignUpBack.setOnClickListener(this);

    }

    public void submitCondition() {
        if (etSignUpFirstName.getText().toString() == null || etSignUpFirstName.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter First Name", Toast.LENGTH_SHORT).show();
        else if (etSignUpLastName.getText().toString() == null || etSignUpLastName.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter Last Name", Toast.LENGTH_SHORT).show();
        else if (etSignUpContact.getText().toString() == null || etSignUpContact.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter Contact Number", Toast.LENGTH_SHORT).show();
        else if (etSignUpContact.getText().toString().length() < 10)
            Toast.makeText(this, "Enter Correct Contact Number", Toast.LENGTH_SHORT).show();
        else if (etSignUpEmail.getText().toString() == null || etSignUpEmail.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter Email Id", Toast.LENGTH_SHORT).show();
        else if (!CommonUtils.isValidEmail(etSignUpEmail.getText().toString().trim()))
            Toast.makeText(this, "Enter Correct Email Id", Toast.LENGTH_SHORT).show();
        else if (etSignUpPassword.getText().toString() == null || etSignUpPassword.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        else if (!CommonUtils.isLegalPassword(etSignUpPassword.getText().toString().trim()))
            Toast.makeText(this, "Enter Correct Password", Toast.LENGTH_SHORT).show();
        else if (etSignUpConfirmPassword.getText().toString() == null || etSignUpConfirmPassword.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter Confirm Password", Toast.LENGTH_SHORT).show();
        else if (!etSignUpConfirmPassword.getText().toString().trim().equalsIgnoreCase(etSignUpPassword.getText().toString().trim()))
            Toast.makeText(this, "Confirm Password is not Match", Toast.LENGTH_SHORT).show();
        else if (etSignUpAlternateEmail.getText().toString() == null || etSignUpAlternateEmail.getText().toString().trim().equalsIgnoreCase(""))
            Toast.makeText(this, "Enter Alternate Email Id", Toast.LENGTH_SHORT).show();
        else if (!CommonUtils.isValidEmail(etSignUpAlternateEmail.getText().toString().trim()))
            Toast.makeText(this, "Enter Correct Alternate Email Id", Toast.LENGTH_SHORT).show();
        else if (etSignUpAlternateEmail.getText().toString().trim().equalsIgnoreCase(etSignUpEmail.getText().toString().trim()))
            Toast.makeText(this, "Primary and Secondary Email Id can't be same", Toast.LENGTH_SHORT).show();
        else
            startActivity(new Intent(this, DashBoard.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                CommonUtils.closeKeyboard(this);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        CommonUtils.closeKeyboard(this);
        finish();
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btSignUpSaveNext:
                submitCondition();
                break;
            case R.id.ivSignUpBack:
                finish();
                CommonUtils.closeKeyboard(this);
                break;
        }
    }
}
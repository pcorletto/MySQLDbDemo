package com.example.android.mysqldbdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class RegistrationActivity extends ActionBarActivity {

    private EditText ET_NAME, ET_USER_NAME, ET_USER_PASS;
    private String name, user_name, user_pass;
    private Button userReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        ET_NAME = (EditText) findViewById(R.id.name);
        ET_USER_NAME = (EditText) findViewById(R.id.new_user_name);
        ET_USER_PASS = (EditText) findViewById(R.id.new_user_pass);
        userReg = (Button) findViewById(R.id.userReg);

        userReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = ET_NAME.getText().toString();
                user_name = ET_USER_NAME.getText().toString();
                user_pass = ET_USER_PASS.getText().toString();

                String method = "register";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(method, name, user_name, user_pass);
                finish();

            }
        });

    }


}

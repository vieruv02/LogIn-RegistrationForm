package com.example.vladislav.loginmysql;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Register extends Activity{

    EditText ET_NAME, ET_USERNAME, ET_USER_PASS;
    String name, user_name, user_pass;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ET_NAME = (EditText) findViewById(R.id.name);
        ET_USERNAME = (EditText) findViewById(R.id.new_user_name);
        ET_USER_PASS = (EditText) findViewById(R.id.new_user_pass);

    }

    public void userReg(View view){
        name=ET_NAME.getText().toString();
        user_name = ET_USERNAME.getText().toString();
        user_pass = ET_USER_PASS.getText().toString();

        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, name, user_name, user_pass);

        //after we finish the registration, we....
        finish();


    }

}

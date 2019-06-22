package com.example.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void getdetails(View view){
        Intent intent=new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }

    public void getList(View view){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

package com.example.remindme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
Button button;
Button cansel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username =(TextView)findViewById(R.id.textView);
        TextView password = (TextView)findViewById(R.id.textView2);



        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("admin") && password.getText().toString().equals("12345")) {

                    Intent intent = new Intent(Login.this, Home.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Login.this, "User name of password is not match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
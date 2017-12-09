package com.example.angga.spnjl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    Button up;
    TextView in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        in = (TextView) findViewById(R.id.textView2);
        up = (Button) findViewById(R.id.button2);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignUp.this,SignIn.class);
                startActivity(a);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignUp.this,SignIn.class);
                startActivity(a);
            }
        });
    }
}

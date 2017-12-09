package com.example.angga.spnjl2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    Button in;
    TextView up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        in = (Button)findViewById(R.id.button2);
        up = (TextView)findViewById(R.id.textView2);
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignIn.this,MenuProfile.class);
                startActivity(a);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(SignIn.this,SignUp.class);
                startActivity(a);
            }
        });
    }
}

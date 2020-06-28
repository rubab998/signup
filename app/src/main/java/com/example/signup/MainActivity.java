package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 private TextView tw;
 private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private Button b;
    private Button b1;
    private EditText ed;
    private EditText ed1;
    private EditText ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tw=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        t4=(TextView) findViewById(R.id.textView4);
        t5=(TextView) findViewById(R.id.textView5);
        b=(Button) findViewById(R.id.button);
        b1=(Button) findViewById(R.id.button1);
        ed=(EditText) findViewById(R.id.editText);
        ed1=(EditText) findViewById(R.id.editText1);
        ed2=(EditText) findViewById(R.id.editText2);



        configureapplyButton();

    }
    private void configureapplyButton()
    {
        Button applybutton = (Button) findViewById(R.id.button1);
        applybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });

    }

}

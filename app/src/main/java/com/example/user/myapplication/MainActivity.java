package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private Button submit;
    private EditText input;
    int [] answer = new int[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.tv_result);
        submit = (Button)findViewById(R.id.bts_submit);
        input = (EditText)findViewById(R.id.et_input);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputNum = input.getText().toString();
                if(inputNum.length() !=4){
                    Toast.makeText(MainActivity.this, "The length of input number must be 4",Toast.LENGTH_LONG).show();
                    return;
                }
                input.setText("");
                result.setText(inputNum);
            }
        });
    }




    }






package com.example.prework_hellocole;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    final String DEFAULT_MESSAGE = "Hello from Cole!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout relativeLayout = findViewById(R.id.relativeLayout);
        Button btn_tvColor = findViewById(R.id.btn_tvColor);
        Button btn_bgColor = findViewById(R.id.btn_bgColor);
        Button btn_changeText = findViewById(R.id.btn_changeText);
        final TextView tv_Hello = findViewById(R.id.tv_hello);
        final EditText et_input = findViewById(R.id.et_input);

        btn_tvColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Hello.setTextColor(getResources().getColor(R.color.white));
            }
        });
        btn_bgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.bgBlack));
            }
        });
        btn_changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newString = et_input.getText().toString();
                if(newString.length() != 0)
                    tv_Hello.setText(newString);
                else
                    tv_Hello.setText(DEFAULT_MESSAGE);
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Hello.setText(DEFAULT_MESSAGE);
                tv_Hello.setTextColor(getResources().getColor(R.color.bgBlack));
                relativeLayout.setBackgroundColor(getResources().getColor(R.color.bgLavender));
            }
        });
    }


}

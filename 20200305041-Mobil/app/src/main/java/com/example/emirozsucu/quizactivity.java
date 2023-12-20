package com.example.emirozsucu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class quizactivity extends AppCompatActivity {

    public Button menubtn;

    public Button quiz1btn;

    public Button quiz2btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizactivity);
        menubtn=findViewById(R.id.menubutton);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mbnt=new Intent(quizactivity.this, MainActivity.class);
                startActivity(mbnt);
            }
        });

        quiz1btn = findViewById(R.id.quiz1button);
        quiz1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent str = new Intent(quizactivity.this, quiz1.class);
                startActivity(str);
            }
        });

        quiz2btn = findViewById(R.id.quiz2button);
        quiz2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent str = new Intent(quizactivity.this, quiz2.class);
                startActivity(str);
            }
        });
    }
}
package com.example.emirozsucu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aboutactivty extends AppCompatActivity {

    public Button btnmn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivty);
        btnmn=findViewById(R.id.menubutton2);
        btnmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menu=new Intent(aboutactivty.this,MainActivity.class);
                startActivity(menu);
            }
        });

    }
}
package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView t,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        t = findViewById(R.id.name);
        t2 = findViewById(R.id.surname);
        t3 = findViewById(R.id.age);
        t4 = findViewById(R.id.qualification);
        t5 = findViewById(R.id.skill);
        t6 = findViewById(R.id.experience);

        Intent n= getIntent();

        String name= n.getStringExtra("user");
        String surname= n.getStringExtra("user1");
        String age= n.getStringExtra("user2");
        String qualification= n.getStringExtra("user3");
        String skill= n.getStringExtra("user4");
        String experience= n.getStringExtra("user5");

        t.setText(""+name);
        t2.setText(""+surname);
        t3.setText(""+age);
        t4.setText(""+qualification);
        t5.setText(""+skill);
        t6.setText(""+experience);

    }
}
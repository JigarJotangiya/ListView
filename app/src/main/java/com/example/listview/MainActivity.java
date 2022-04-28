package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1,n2,n3,n4,n5,n6;
    Button j2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);

        j2 = findViewById(R.id.j2);
        j2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {

        String name = n1.getText().toString();
        String surname = n2.getText().toString();
        String age = n3.getText().toString();
        String qualification = n4.getText().toString();
        String skill = n5.getText().toString();
        String experience = n6.getText().toString();

        Intent i = new Intent(getApplicationContext(),SecondActivity.class);

        i.putExtra("user",name);
        i.putExtra("user1",surname);
        i.putExtra("user2",age);
        i.putExtra("user3",qualification);
        i.putExtra("user4",skill);
        i.putExtra("user5",experience);

        startActivity(i);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}


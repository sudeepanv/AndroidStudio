package com.example.kyu;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;
import android.os.Bundle;

public class UserDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        String name = getIntent().getStringExtra("name");
        String pk = getIntent().getStringExtra("pky");
        String reg = getIntent().getStringExtra("no");
        String dob = getIntent().getStringExtra("yr");
        TextView name1 = findViewById(R.id.name1);
        TextView no1 = findViewById(R.id.no1);
        TextView pk1 = findViewById(R.id.pk1);
        TextView dob1 = findViewById(R.id.dob1);
        name1.setText(name);
        no1.setText(reg);
        pk1.setText(pk);
        dob1.setText(dob);
        Log.d("NextActivity", "InfoData1: " + name);
        Log.d("NextActivity", "InfoData2: " + pk);
        Log.d("NextActivity", "InfoData3: " + reg);


    }
}
package com.example.kyu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class UserInfo extends AppCompatActivity {

    EditText name;
    EditText regno;
    EditText presentkyu;
    EditText dob;
    Button saveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);

        name = findViewById(R.id.name);
        regno = findViewById(R.id.reg);
        presentkyu = findViewById(R.id.presentkyu);
        dob = findViewById(R.id.dob);
        saveButton = findViewById(R.id.saveButton);
//        String nm = name.getText().toString();
//        String rg= regno.getText().toString();
//        String py = presentkyu.getText().toString();
//        String db = dob.getText().toString();

        saveButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String nm = name.getText().toString();
                String rg= regno.getText().toString();
                String py = presentkyu.getText().toString();
                String db = dob.getText().toString();
                Intent intent = new Intent(UserInfo.this, UserDetail.class);
                intent.putExtra("name", nm);
                intent.putExtra("no", rg);
                intent.putExtra("pky", py);
                intent.putExtra("yr", db);
                startActivity(intent);
            }

        });

    }


}

//        }


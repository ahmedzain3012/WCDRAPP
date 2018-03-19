package com.example.azain.wcdrapp.wcdrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nIdNumber = findViewById(R.id.nid_number);
        final EditText salaryNo = findViewById(R.id.salary_no);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (nIdNumber.getText().toString().equals("2238551234") && salaryNo.getText().toString().equals("3784")) {
                    Toast.makeText(MainActivity.this,"Done " +nIdNumber.getText().toString() +" - "+ salaryNo.getText().toString(), Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, CustomerActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(MainActivity.this, "error "+nIdNumber.getText().toString() +" - "+ salaryNo.getText().toString(), Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}

package com.example.azain.wcdrapp.wcdrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list);
        final ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(10001, 301, "احمد زين","Ahmed Zain"));
        customers.add(new Customer(10002, 302, "احمد سمير","Ahmed Samir"));
        customers.add(new Customer(10003, 303, "خبير عثمان","Khabeer Othman"));

        ArrayAdapter<Customer> itemsAdapter = new CustomerAdapter(this,customers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Customer customer = customers.get(position);
                Intent i = new Intent(CustomerActivity.this, CDRActivity.class);
                startActivity(i);
            }
        });


    }
}

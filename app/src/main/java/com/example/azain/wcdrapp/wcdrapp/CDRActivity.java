package com.example.azain.wcdrapp.wcdrapp;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class CDRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list);
//        CDR(String pressNameAR, String pressNameEN, int issueNo, Date issueDate, int custQty, int rtnQty)
        ArrayList<CDR> cdrs = new ArrayList<CDR>();


        cdrs.add(new CDR("الرياض", "Riyadh", 12345,"2018-03-05",5,3));
        cdrs.add(new CDR("الجزيرة", "Jazyraa", 6543,"2018-04-15",3,2));
        cdrs.add(new CDR("عكاظ", "Okaz", 9876,"2018-01-20",4,4));

        ArrayAdapter<CDR> itemsAdapter = new CDRAdapter(CDRActivity.this,cdrs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


    }
}

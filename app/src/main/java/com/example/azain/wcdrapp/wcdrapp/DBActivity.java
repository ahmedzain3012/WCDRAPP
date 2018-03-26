package com.example.azain.wcdrapp.wcdrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
        TextView dataVal = (TextView) findViewById(R.id.data);
        try {
            ConnectOra db = new ConnectOra();
            ResultSet rs = db.getResult();
            ArrayList<String> list = new ArrayList<String>();
            while(rs.next()) {
                list.add(rs.getString(1));
            }
            for (String data : list){
                dataVal.setText(data);

            }
           // setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, list));

            //ListView lv = getListView();

//            lv.setTextFilterEnabled(true);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

}

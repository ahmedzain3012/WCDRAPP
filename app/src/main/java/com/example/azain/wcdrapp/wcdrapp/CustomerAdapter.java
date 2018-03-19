package com.example.azain.wcdrapp.wcdrapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by A.Zain on 3/19/2018.
 */

public class CustomerAdapter extends ArrayAdapter<Customer> {
    public CustomerAdapter(Activity context, ArrayList<Customer> customers) {
        super(context, 0,customers);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Customer currentCustomer = getItem(position);

        TextView custCode = (TextView) listItemView.findViewById(R.id.cust_code);
        custCode.setText(((Integer) currentCustomer.getCustCode()).toString());

        TextView arName =(TextView) listItemView.findViewById(R.id.name_ar);
        arName.setText(currentCustomer.getNameAR());

        TextView enName = (TextView) listItemView.findViewById(R.id.name_en);
        enName.setText(currentCustomer.getNameEN());


        return  listItemView;

    }
}

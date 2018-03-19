package com.example.azain.wcdrapp.wcdrapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;


/**
 * Created by A.Zain on 3/19/2018.
 */

public class CDRAdapter extends ArrayAdapter<CDR> {
    public CDRAdapter(Activity context, ArrayList<CDR> cdrs) {
        super(context, 0,cdrs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item2,parent,false);
        }
        CDR currentCDR = getItem(position);

        TextView pressNameAR = (TextView) listItemView.findViewById(R.id.press_name_ar);
        pressNameAR.setText(currentCDR.getPressNameAR());

        TextView pressNameEN =(TextView) listItemView.findViewById(R.id.press_name_en);
        pressNameEN.setText(currentCDR.getPressNameEN());

        TextView issueNo =(TextView) listItemView.findViewById(R.id.issue_no);
        issueNo.setText(((Integer) currentCDR.getIssueNo()).toString());

        TextView issueDate =(TextView) listItemView.findViewById(R.id.issue_date);
        issueDate.setText(currentCDR.getIssueDate());

        TextView custQty = (TextView) listItemView.findViewById(R.id.cust_qty);
        custQty.setText(((Integer) currentCDR.getCustQty()).toString());

        TextView rtnQty = (TextView) listItemView.findViewById(R.id.rtn_qty);
        rtnQty.setText(((Integer) currentCDR.getRtnQty()).toString());

        return  listItemView;

    }
}

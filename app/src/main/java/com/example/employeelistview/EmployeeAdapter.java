package com.example.employeelistview;


import android.content.Context;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


// making an arraylist of the input

public class EmployeeAdapter extends ArrayAdapter<Employee> {

    // making an arraylist of the input
    public EmployeeAdapter(Context context, List employees) {
        super(context, 0, employees);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {

            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item_employee, parent, false);
        }

        Employee employee = getItem(position);


        TextView fn = view.findViewById(R.id.txtv_fn);
        fn.setText(employee.getFirstName());


        TextView ln = view.findViewById(R.id.txtv_ln);
        ln.setText("Last Name: " + employee.getLastName());

        TextView bd = view.findViewById(R.id.txtv_bd);
        bd.setText("Birth Day: " + employee.getBirthDay());

        TextView ms = view.findViewById(R.id.txtv_ms);
        ms.setText("Marital Status: " + employee.getMaritalStatus());


        TextView ad = view.findViewById(R.id.txtv_ad);
        ad.setText("Address: " + employee.getAddress());

        TextView mn = view.findViewById(R.id.txtv_mn);
        mn.setText("Mobile Number: " + employee.getMobileNumber());


        return view;
    }
}

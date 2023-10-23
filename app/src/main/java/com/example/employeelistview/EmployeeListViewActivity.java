package com.example.employeelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
// This model executes the design for each employee in the list
public class EmployeeListViewActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list_view);

        listView = findViewById(R.id.lv_employee);

        EmployeeAdapter adapter = new EmployeeAdapter(this, DataManager.employees);


        listView.setAdapter(adapter);
    }
}
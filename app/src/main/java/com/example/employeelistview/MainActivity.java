package com.example.employeelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstNameInput, lastNameInput, birthDayInput, maritalStatusInput, addressInput, mobileNumberInput;


    DataManager dataManager = new DataManager();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        firstNameInput = findViewById(R.id.first_name);
        lastNameInput = findViewById(R.id.last_name);
        birthDayInput = findViewById(R.id.birth_day);
        maritalStatusInput = findViewById(R.id.marital_status);
        addressInput = findViewById(R.id.address);
        mobileNumberInput = findViewById(R.id.mobile_number);


        Button registerButton = findViewById(R.id.register_btn);
        Button listButton = findViewById(R.id.list_btn);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameInput.getText().toString();
                String lastName = lastNameInput.getText().toString();
                String birthDay = birthDayInput.getText().toString();
                String maritalStatus = maritalStatusInput.getText().toString();
                String address = addressInput.getText().toString();
                String mobileNumber = mobileNumberInput.getText().toString();

                if (dataManager.validateEmployee(firstName, lastName)) {
                    Toast.makeText(MainActivity.this, "Employee is already registered.", Toast.LENGTH_SHORT).show();

                } else {
                    Employee E = dataManager.createEmployee(firstName, lastName, birthDay, maritalStatus, address, mobileNumber);
                    Toast.makeText(MainActivity.this, "Employee Registered", Toast.LENGTH_SHORT).show();
                }

                firstNameInput.setText("");
                lastNameInput.setText("");
                birthDayInput.setText("");
                maritalStatusInput.setText("");
                addressInput.setText("");
                mobileNumberInput.setText("");
            }
        });

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, EmployeeListView.class);
                startActivity(intent);

            }

        });

    }
}

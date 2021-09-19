package com.example.fyp_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity4 extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        getSupportActionBar().hide();
        //assg variable
        spinner=findViewById(R.id.spinner);

        //initializing array list
        ArrayList<String> parkingList= new ArrayList<>();
// Add parking name
        parkingList.add("Select parking");
        parkingList.add("Luckyone");
        parkingList.add("Dolmen Mall");
        parkingList.add("sardar Market");
        //set adapter
        spinner.setAdapter(new ArrayAdapter<>(Activity4.this, android.R.layout.simple_spinner_dropdown_item,parkingList));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if (position ==0){
                    //toast message
                    Toast.makeText(getApplicationContext(),"please select parking",Toast.LENGTH_SHORT).show();
                    //set empty text


                }
                else {
                    // get selected value
                    String sParking= adapterView.getItemAtPosition(position).toString();
                    //set selected value on text view
                    Intent Activity2intent =new Intent(Activity4.this,Activity2.class);
                    startActivity(Activity2intent);
                    finish();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });

    }
}
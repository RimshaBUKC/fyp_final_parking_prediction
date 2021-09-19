package com.example.fyp_final;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;
import android.icu.text.Transliterator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.Calendar;

public class Activity2<view> extends AppCompatActivity {
    //initializing variable
    Spinner spinner;
TextView textView;
    RadioGroup rg;
    RadioButton rb;
    Button button;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().hide();
        //time text view
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat format =new SimpleDateFormat("HH:mm:ss");
        String time = format.format(calendar.getTime());
        TextView text_view_time= findViewById(R.id.text_view_time);
        text_view_time.setText(time);
        //button
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swap_up swap_up=new swap_up();
                swap_up.show(getSupportFragmentManager(),swap_up.getTag());
            }
        });
        //radiobutton
        rg=(RadioGroup)findViewById(R.id.radiogroup1);




        }


    public void checkbutton(View view) {
        int radiobuttonid=rg.getCheckedRadioButtonId();
        rb= (RadioButton) findViewById(radiobuttonid);
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }

}




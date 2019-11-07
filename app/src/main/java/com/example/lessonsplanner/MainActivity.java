package com.example.lessonsplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TextView emptyTime1;
    TextView emptyTime2;
    TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emptyTime1 = findViewById(R.id.empty_time1);
        emptyTime2 = findViewById(R.id.empty_time2);
    }

    public void pickTime1(View view) {
        timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                if (minutes <= 9){
                    emptyTime1.setText(hourOfDay + ":0" + minutes);
                }else {
                    emptyTime1.setText(hourOfDay + ":" + minutes);
                }
            }
        }, 0, 0, true);
        timePickerDialog.show();
    }

    public void pickTime2(View view) {
        timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hourOfDay, int minutes) {
                if (minutes <= 9){
                    emptyTime2.setText(hourOfDay + ":0" + minutes);
                }else {
                    emptyTime2.setText(hourOfDay + ":" + minutes);
                }
            }
        }, 0, 0, true);
        timePickerDialog.show();
    }


}

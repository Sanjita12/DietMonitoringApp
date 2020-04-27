package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SleepMonitoringActivity extends AppCompatActivity {

    EditText sleep;
    Button getsleep;
    TextView showTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_monitoring);
        this.setTitle("Sleep Monitoring");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        sleep = (EditText)findViewById(R.id.enter_sleeping_hours);
        showTip = (TextView) findViewById(R.id.show_tip);
        getsleep = (Button)findViewById(R.id.check_sleep);

        getsleep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float glassesInt = Float.parseFloat(sleep.getText().toString());
                if(glassesInt >= 7){
                    showTip.setText("Good Job!!");
                }
                else{
                    showTip.setText("You need to sleep :" + (int)(7 - glassesInt)+ " hours more");
                }
                showTip.setVisibility(View.VISIBLE);

                try {
                    InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}

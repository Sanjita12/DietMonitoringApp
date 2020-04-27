package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FootSteps extends AppCompatActivity {

    EditText distance;
    Button getfootsteps;
    TextView showfootsteps;
    TextView showTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foot_steps);
        this.setTitle("Foot Steps");
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        distance = (EditText)findViewById(R.id.enter_distance);
        showfootsteps = (TextView) findViewById(R.id.show_footsteps);
        showTip = (TextView) findViewById(R.id.show_tip);
        getfootsteps = (Button)findViewById(R.id.calculate_foot_steps);

        getfootsteps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float distance_in_km = Float.parseFloat(distance.getText().toString());
                float footsteps = distance_in_km*1400;
                String footsteps_text = String.valueOf(footsteps);
                showfootsteps.setText("Your Foot Steps count is  : " + footsteps_text);
                showfootsteps.setVisibility(View.VISIBLE);
                if(distance_in_km >= 7.142){
                    showTip.setText("Good Job!!");
                }
                else{
                    showTip.setText("You traveled :" + (int)(7.142 - distance_in_km)+ " km less, try to walk " + (int)((7.142 - distance_in_km) * 1400)+ " footspteps more");
                }
//                showTip.setText("The average Foot steps of a healthy/day is  : " + String.valueOf(5000));
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

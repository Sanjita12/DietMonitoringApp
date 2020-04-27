package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMICalculator extends AppCompatActivity {


    EditText weight;
    EditText height;
    Button getBmi;
    TextView showBmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);

        this.setTitle("BMI Calculator");

        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        weight = (EditText)findViewById(R.id.enter_weight);
        height = (EditText)findViewById(R.id.enter_height);
        getBmi = (Button)findViewById(R.id.calculate_bmi_button);
        showBmi = (TextView) findViewById(R.id.show_bmi_text);

        getBmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float weight_in_kg = Float.parseFloat(weight.getText().toString());
                float height_in_mtr = Float.parseFloat(height.getText().toString());
                float bmi = weight_in_kg/(height_in_mtr*height_in_mtr);
                String bmi_text = String.valueOf(bmi);
                showBmi.setText("Your BMI is  : " + bmi_text);
                showBmi.setVisibility(View.VISIBLE);

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

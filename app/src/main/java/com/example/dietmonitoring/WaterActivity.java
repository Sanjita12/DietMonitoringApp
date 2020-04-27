package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WaterActivity extends AppCompatActivity {

    EditText glasses;
    Button getglasses;
    TextView showTip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        this.setTitle("Water Intake");
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        glasses = (EditText)findViewById(R.id.enter_glasses);
        showTip = (TextView) findViewById(R.id.show_tip);
        getglasses = (Button)findViewById(R.id.check_intake);

        getglasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float glassesInt = Float.parseFloat(glasses.getText().toString());
                if(glassesInt >= 12){
                    showTip.setText("Good Job!!");
                }
                else{
                    showTip.setText("You need to drink " + (int)(12 - glassesInt)+ " glasses of water more today");
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

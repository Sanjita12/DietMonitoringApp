package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    Button bmibtn;
    Button footstepsbtn;
    Button waterbtn;
    Button healthconsultant;
    Button sleepmonitoring;
    Button dietmonitoring;
    Button logout;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setTitle("Diet Monitoring");
        mAuth = FirebaseAuth.getInstance();

        bmibtn = (Button)findViewById(R.id.home_bmi_calculator);
        bmibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, BMICalculator.class));
            }
        });
        footstepsbtn = (Button)findViewById(R.id.home_foot_steps);
        footstepsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, FootSteps.class));
            }
        });
        waterbtn = (Button)findViewById(R.id.home_water);
        waterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, WaterActivity.class));
            }
        });

        healthconsultant = (Button)findViewById(R.id.home_health_consultant);
        healthconsultant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, HealthConsultantActivity.class));
            }
        });

        sleepmonitoring = (Button)findViewById(R.id.sleep_monitoring);
        sleepmonitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, SleepMonitoringActivity.class));
            }
        });

        dietmonitoring = (Button)findViewById(R.id.home_diet_monitor);
        dietmonitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, DietMonitoring.class));
            }
        });
        logout = (Button)findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(HomeActivity.this,MainActivity.class));
                finish();
            }
        });
    }
}

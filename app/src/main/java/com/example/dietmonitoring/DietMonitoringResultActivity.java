package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DietMonitoringResultActivity extends AppCompatActivity {

    TextView Carb_total;
    TextView Fat_total;
    TextView Protein_total;
    TextView Iron_total;
    TextView Calcium_total;

    TextView Carb_left;
    TextView Fat_left;
    TextView Protein_left;
    TextView Iron_left;
    TextView Calcium_left;

    TextView Recommendation;
    TextView Carbohydrates_Recommendation;
    TextView Proteins_Recommendation;
    TextView Fats_Recommendation;
    TextView Calcium_Recommendation;
    TextView Iron_Recommendation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_monitoring_result);

        this.setTitle("Diet Monitoring");
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent intent = getIntent();
        String carb = intent.getStringExtra("carbohydrates");

        String fat = intent.getStringExtra("fat");

        String protein = intent.getStringExtra("protein");

        String iron = intent.getStringExtra("iron");

        String calcium = intent.getStringExtra("calcium");


        Carb_total = (TextView) findViewById(R.id.Carbohydrates_count_1);
        Carb_total.setText(String.valueOf((int)Float.parseFloat(carb)));
        Carb_left = (TextView) findViewById(R.id.Carbohydrates_count_2);
        Carb_left.setText((1000 - (int)Float.parseFloat(carb) <=0)? String.valueOf(0) : String.valueOf(600-(int)Float.parseFloat(carb) ) );

        Fat_total = (TextView) findViewById(R.id.Fats_count_1);
        Fat_total.setText(String.valueOf((int)Float.parseFloat(fat)));
        Fat_left = (TextView) findViewById(R.id.Fats_count_2);
        Fat_left.setText((1000 - (int)Float.parseFloat(fat) <=0)? String.valueOf(0) : String.valueOf(600-(int)Float.parseFloat(fat)));

        Protein_total = (TextView) findViewById(R.id.Proteins_count_1);
        Protein_total.setText(String.valueOf((int)Float.parseFloat(protein)));
        Protein_left = (TextView) findViewById(R.id.Proteins_count_2);
        Protein_left.setText((1000 - (int)Float.parseFloat(protein) <=0)? String.valueOf(0) : String.valueOf(600-(int)Float.parseFloat(protein)));

        Iron_total = (TextView) findViewById(R.id.Iron_count_1);
        Iron_total.setText(String.valueOf((int)Float.parseFloat(iron)));
        Iron_left = (TextView) findViewById(R.id.Iron_count_2);
        Iron_left.setText((1000 - (int)Float.parseFloat(iron) <=0)? String.valueOf(0) : String.valueOf(600-(int)Float.parseFloat(iron)));

        Calcium_total = (TextView) findViewById(R.id.Calcium_count_1);
        Calcium_total.setText(String.valueOf((int)Float.parseFloat(calcium)));
        Calcium_left = (TextView) findViewById(R.id.Calcium_count_2);
        Calcium_left.setText((1000 - (int)Float.parseFloat(calcium) <=0)? String.valueOf(0) : String.valueOf(600-(int)Float.parseFloat(calcium)));

        Recommendation = (TextView) findViewById(R.id.recommendation);
        Carbohydrates_Recommendation = (TextView) findViewById(R.id.Carbohydrate_Recommendation);
        Proteins_Recommendation= (TextView) findViewById(R.id.Protein_Recommendation);
        Fats_Recommendation= (TextView) findViewById(R.id.Fat_Recommendation);
        Calcium_Recommendation= (TextView) findViewById(R.id.Calcium_Recommendation);
        Iron_Recommendation= (TextView) findViewById(R.id.Iron_Recommendation);

        if(1000 - (int)Float.parseFloat(carb) > 0){
            Recommendation.setVisibility(View.VISIBLE);
            Carbohydrates_Recommendation.setVisibility(View.VISIBLE);
        }
        if(1000 - (int)Float.parseFloat(fat) > 0){
            Recommendation.setVisibility(View.VISIBLE);
            Fats_Recommendation.setVisibility(View.VISIBLE);
        }
        if(1000 - (int)Float.parseFloat(protein) > 0){
            Recommendation.setVisibility(View.VISIBLE);
            Proteins_Recommendation.setVisibility(View.VISIBLE);
        }
        if(1000 - (int)Float.parseFloat(iron) > 0){
            Recommendation.setVisibility(View.VISIBLE);
            Iron_Recommendation.setVisibility(View.VISIBLE);
        }
        if(1000 - (int)Float.parseFloat(calcium) > 0){
            Recommendation.setVisibility(View.VISIBLE);
            Calcium_Recommendation.setVisibility(View.VISIBLE);
        }
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

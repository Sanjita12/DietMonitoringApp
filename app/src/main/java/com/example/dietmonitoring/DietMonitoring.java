package com.example.dietmonitoring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DietMonitoring extends AppCompatActivity {

    Spinner spin11;
    Spinner spin12;
    Spinner spin21;
    Spinner spin22;
    Spinner spin31;
    Spinner spin32;

    EditText count11;
    EditText count12;
    EditText count21;
    EditText count22;
    EditText count31;
    EditText count32;

    Button next;


    List<String> breakfast_list_carbohydrates = new ArrayList<String>();
    List<String> breakfast_list_protein = new ArrayList<String>();
    List<String> breakfast_list_fat = new ArrayList<String>();
    List<String> breakfast_list_iron = new ArrayList<String>();
    List<String> breakfast_list_calcium = new ArrayList<String>();

    List<String> lunch_list_carbohydrates = new ArrayList<String>();
    List<String> lunch_list_protein = new ArrayList<String>();
    List<String> lunch_list_fat = new ArrayList<String>();
    List<String> lunch_list_iron = new ArrayList<String>();
    List<String> lunch_list_calcium = new ArrayList<String>();

    List<String> dinner_list_carbohydrates = new ArrayList<String>();
    List<String> dinner_list_protein = new ArrayList<String>();
    List<String> dinner_list_fat = new ArrayList<String>();
    List<String> dinner_list_iron = new ArrayList<String>();
    List<String> dinner_list_calcium = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_monitoring);

        this.setTitle("Diet Monitoring");
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        spin11 = (Spinner)findViewById(R.id.breakfast_spinner_1);
        spin12 = (Spinner)findViewById(R.id.breakfast_spinner_2);
        spin21 = (Spinner)findViewById(R.id.lunch_spinner_1);
        spin22 = (Spinner)findViewById(R.id.lunch_spinner_2);
        spin31 = (Spinner)findViewById(R.id.dinner_spinner_1);
        spin32 = (Spinner)findViewById(R.id.dinner_spinner_2);

        count11 = (EditText)findViewById(R.id.breakfast_spinner_1_quantity);
        count12 = (EditText)findViewById(R.id.breakfast_spinner_2_quantity);
        count21 = (EditText)findViewById(R.id.lunch_spinner_1_quantity);
        count22 = (EditText)findViewById(R.id.lunch_spinner_2_quantity);
        count31 = (EditText)findViewById(R.id.dinner_spinner_1_quantity);
        count32 = (EditText)findViewById(R.id.dinner_spinner_2_quantity);

        next = (Button)findViewById(R.id.nextbutton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("SAY","HELLO");
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
                int ind11 = spin11.getSelectedItemPosition();
                int ind12 = spin12.getSelectedItemPosition();
                int ind21 = spin21.getSelectedItemPosition();
                int ind22 = spin22.getSelectedItemPosition();
                int ind31 = spin31.getSelectedItemPosition();
                int ind32 = spin32.getSelectedItemPosition();
                float carbohydrates = 0;
                float protein = 0;
                float fat = 0;
                float iron = 0;
                float calcium = 0;
                if(ind11 != 0){
                    carbohydrates += Float.parseFloat(breakfast_list_carbohydrates.get(ind11)) * Float.parseFloat(count11.getText().toString());
                    protein += Float.parseFloat(breakfast_list_protein.get(ind11))* Float.parseFloat(count11.getText().toString());
                    fat += Float.parseFloat(breakfast_list_fat.get(ind11))* Float.parseFloat(count11.getText().toString());
                    iron += Float.parseFloat(breakfast_list_iron.get(ind11))* Float.parseFloat(count11.getText().toString());
                    calcium += Float.parseFloat(breakfast_list_calcium.get(ind11))* Float.parseFloat(count11.getText().toString());
                }
                if(ind12 != 0){
                    carbohydrates += Float.parseFloat(breakfast_list_carbohydrates.get(ind12))* Float.parseFloat(count12.getText().toString());
                    protein += Float.parseFloat(breakfast_list_protein.get(ind12))* Float.parseFloat(count12.getText().toString());
                    fat += Float.parseFloat(breakfast_list_fat.get(ind12))* Float.parseFloat(count12.getText().toString());
                    iron += Float.parseFloat(breakfast_list_iron.get(ind12))* Float.parseFloat(count12.getText().toString());
                    calcium += Float.parseFloat(breakfast_list_calcium.get(ind12))* Float.parseFloat(count12.getText().toString());
                }
                if(ind21 != 0){
                    carbohydrates += Float.parseFloat(lunch_list_carbohydrates.get(ind21))* Float.parseFloat(count21.getText().toString());
                    protein += Float.parseFloat(lunch_list_protein.get(ind21))* Float.parseFloat(count21.getText().toString());
                    fat += Float.parseFloat(lunch_list_fat.get(ind21))* Float.parseFloat(count21.getText().toString());
                    iron += Float.parseFloat(lunch_list_iron.get(ind21))* Float.parseFloat(count21.getText().toString());
                    calcium += Float.parseFloat(lunch_list_calcium.get(ind21))* Float.parseFloat(count21.getText().toString());
                }
                if(ind22 != 0){
                    carbohydrates += Float.parseFloat(lunch_list_carbohydrates.get(ind22))* Float.parseFloat(count22.getText().toString());
                    protein += Float.parseFloat(lunch_list_protein.get(ind22))* Float.parseFloat(count22.getText().toString());
                    fat += Float.parseFloat(lunch_list_fat.get(ind22))* Float.parseFloat(count22.getText().toString());
                    iron += Float.parseFloat(lunch_list_iron.get(ind22))* Float.parseFloat(count22.getText().toString());
                    calcium += Float.parseFloat(lunch_list_calcium.get(ind22))* Float.parseFloat(count22.getText().toString());
                }
                if(ind31 != 0){
                    carbohydrates += Float.parseFloat(dinner_list_carbohydrates.get(ind31))* Float.parseFloat(count31.getText().toString());
                    protein += Float.parseFloat(dinner_list_protein.get(ind31))* Float.parseFloat(count31.getText().toString());
                    fat += Float.parseFloat(dinner_list_fat.get(ind31))* Float.parseFloat(count31.getText().toString());
                    iron += Float.parseFloat(dinner_list_iron.get(ind31))* Float.parseFloat(count31.getText().toString());
                    calcium += Float.parseFloat(dinner_list_calcium.get(ind31))* Float.parseFloat(count31.getText().toString());
                }
                if(ind32 != 0){
                    carbohydrates += Float.parseFloat(dinner_list_carbohydrates.get(ind32))* Float.parseFloat(count32.getText().toString());
                    protein += Float.parseFloat(dinner_list_protein.get(ind32))* Float.parseFloat(count32.getText().toString());
                    fat += Float.parseFloat(dinner_list_fat.get(ind32))* Float.parseFloat(count32.getText().toString());
                    iron += Float.parseFloat(dinner_list_iron.get(ind32))* Float.parseFloat(count32.getText().toString());
                    calcium += Float.parseFloat(dinner_list_calcium.get(ind32))* Float.parseFloat(count32.getText().toString());
                }
                Intent intent = new Intent(DietMonitoring.this, DietMonitoringResultActivity.class);
                intent.putExtra("carbohydrates", String.valueOf(carbohydrates));
                intent.putExtra("protein", String.valueOf(protein));
                intent.putExtra("fat", String.valueOf(fat));
                intent.putExtra("iron", String.valueOf(iron));
                intent.putExtra("calcium", String.valueOf(calcium));
                startActivity(intent);

            }
        });

        List<String> breakfast_list = new ArrayList<String>();
        breakfast_list.add("Select Food Item");
        breakfast_list.add("Bread (1 slice)");
        breakfast_list.add("Milk (1 cup)");
        breakfast_list.add("Egg");
        breakfast_list.add("Apple");
        List<String> lunch_list = new ArrayList<String>();
        lunch_list.add("Select Food Item");
        lunch_list.add("Rice (1 cup)");
        lunch_list.add("Pulses (1 cup)");
        lunch_list.add("Green Vegetable");
        lunch_list.add("salad (1 cup)");
        List<String> dinner_list = new ArrayList<String>();
        dinner_list.add("Select Food Item");
        dinner_list.add("Pizza (1 piece)");
        dinner_list.add("Salad (1 cup");
        dinner_list.add("Coke (100ml)");
        dinner_list.add("Meat (100gm)");

//-----------------------------------------------------


        breakfast_list_carbohydrates.add("Select Food Item");
        breakfast_list_carbohydrates.add("15");
        breakfast_list_carbohydrates.add("12");
        breakfast_list_carbohydrates.add("28");
        breakfast_list_carbohydrates.add("19");

        breakfast_list_protein.add("Select Food Item");
        breakfast_list_protein.add("3");
        breakfast_list_protein.add("8");
        breakfast_list_protein.add("9 ");
        breakfast_list_protein.add("0");

        breakfast_list_fat.add("Select Food Item");
        breakfast_list_fat.add("1");
        breakfast_list_fat.add("8");
        breakfast_list_fat.add("1");
        breakfast_list_fat.add("0");

        breakfast_list_iron.add("Select Food Item");
        breakfast_list_iron.add("0.5");
        breakfast_list_iron.add("0");
        breakfast_list_iron.add(" 0.8");
        breakfast_list_iron.add("0.1");

        breakfast_list_calcium.add("Select Food Item");
        breakfast_list_calcium.add("0.2");
        breakfast_list_calcium.add("3");
        breakfast_list_calcium.add("0");
        breakfast_list_calcium.add("0.1");

//        ----------------------------------------------

        //-----------------------------------------------------


        lunch_list_carbohydrates.add("Select Food Item");
        lunch_list_carbohydrates.add("45");
        lunch_list_carbohydrates.add("122");
        lunch_list_carbohydrates.add("0");
        lunch_list_carbohydrates.add("38");

        lunch_list_protein.add("Select Food Item");
        lunch_list_protein.add("4");
        lunch_list_protein.add("38");
        lunch_list_protein.add("6 ");
        lunch_list_protein.add("0");

        lunch_list_fat.add("Select Food Item");
        lunch_list_fat.add("0");
        lunch_list_fat.add("24");
        lunch_list_fat.add("5");
        lunch_list_fat.add("0");

        lunch_list_iron.add("Select Food Item");
        lunch_list_iron.add("0.4");
        lunch_list_iron.add("7");
        lunch_list_iron.add(" 0.5");
        lunch_list_iron.add("0.2");

        lunch_list_calcium.add("Select Food Item");
        lunch_list_calcium.add("0.1");
        lunch_list_calcium.add("2");
        lunch_list_calcium.add("0.3");
        lunch_list_calcium.add("0.1");

        //     ----------------------------------------------
        //-----------------------------------------------------


        dinner_list_carbohydrates.add("Select Food Item");
        dinner_list_carbohydrates.add("46");
        dinner_list_carbohydrates.add("38");
        dinner_list_carbohydrates.add("10.6");
        dinner_list_carbohydrates.add("0");

        dinner_list_protein.add("Select Food Item");
        dinner_list_protein.add("17");
        dinner_list_protein.add("0");
        dinner_list_protein.add("0 ");
        dinner_list_protein.add("26");

        dinner_list_fat.add("Select Food Item");
        dinner_list_fat.add("12");
        dinner_list_fat.add("0");
        dinner_list_fat.add("0");
        dinner_list_fat.add("3.5");

        dinner_list_iron.add("Select Food Item");
        dinner_list_iron.add("1.4");
        dinner_list_iron.add("0.2");
        dinner_list_iron.add(" 0.1");
        dinner_list_iron.add("0.6");

        dinner_list_calcium.add("Select Food Item");
        dinner_list_calcium.add("2.5");
        dinner_list_calcium.add("0.1");
        dinner_list_calcium.add("0");
        dinner_list_calcium.add("0.1");

//        ----------------------------------------------
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, breakfast_list);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin11.setAdapter(dataAdapter1);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, lunch_list);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin21.setAdapter(dataAdapter2);
        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dinner_list);
        dataAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin31.setAdapter(dataAdapter3);
        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, breakfast_list);
        dataAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin12.setAdapter(dataAdapter4);
        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, lunch_list);
        dataAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin22.setAdapter(dataAdapter5);
        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dinner_list);
        dataAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin32.setAdapter(dataAdapter6);

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

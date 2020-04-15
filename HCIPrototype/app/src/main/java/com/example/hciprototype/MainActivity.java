package com.example.hciprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    SettingsData settingsData = new SettingsData();
    int firstLaunch;
    Button settingsButton,accountButton;
Spinner rainAlert,stormAlert,snowAlert,minAlert,maxAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingsButton = findViewById(R.id.settings_button);
        accountButton = findViewById(R.id.account_button);
        rainAlert = findViewById(R.id.rain_spinner);
        stormAlert = findViewById(R.id.storm_spinner);
        snowAlert = findViewById(R.id.snow_spinner);
        minAlert = findViewById(R.id.min_spinner);
        maxAlert = findViewById(R.id.max_spinner);
        ArrayAdapter<CharSequence> adapterPercent = ArrayAdapter.createFromResource(this,
                R.array.alert_array, android.R.layout.simple_spinner_item);
        adapterPercent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        rainAlert.setAdapter(adapterPercent);
        stormAlert.setAdapter(adapterPercent);
        snowAlert.setAdapter(adapterPercent);
        ArrayAdapter<CharSequence> adapterMin = ArrayAdapter.createFromResource(this,
                R.array.min_array, android.R.layout.simple_spinner_item);
        adapterMin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        minAlert.setAdapter(adapterMin);
        ArrayAdapter<CharSequence> adapterMax = ArrayAdapter.createFromResource(this,
                R.array.max_array, android.R.layout.simple_spinner_item);
        adapterMax.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maxAlert.setAdapter(adapterMax);
         firstLaunch = settingsData.getFirstLaunch();
        if(firstLaunch == 1){ //Checks if this is the first time launch since install/reset and launches first time set-up if it is.
            Intent firstSettingsIntent = new Intent(MainActivity.this, SettingsQuestionsActivity.class);
            startActivity(firstSettingsIntent);
        }else{

        }
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//when button is clicked, settings activity is opened
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(settingsIntent);
            }
        });
        accountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//when button is clicked account activity is opened
                Intent accountIntent = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(accountIntent);
            }
        });
    }
}

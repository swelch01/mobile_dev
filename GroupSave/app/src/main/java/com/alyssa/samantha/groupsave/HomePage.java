package com.alyssa.samantha.groupsave;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button button_profile = (Button) findViewById(R.id.button_profile);
        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToProfile();
            }
        });


        Button button_see_events = (Button) findViewById(R.id.button_see_events);
        button_see_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSeeEvents();
            }
        });

        Button button_create_event = (Button) findViewById(R.id.button_create_event);
        button_create_event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCreateEvents();
            }
        });

        Button button_map = (Button) findViewById(R.id.button_map);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMap();
            }
        });



    }
    private void goToProfile(){
        Intent intentProfile = new Intent(this, Profile.class);
        startActivity(intentProfile);
    }
    private void goToSeeEvents(){
        Intent intentSeeEvents = new Intent(this, SeeEvents.class);
        startActivity(intentSeeEvents);
    }
    private void goToCreateEvents(){
        Intent intentCreateEvents = new Intent(this, CreateEvent.class);
        startActivity(intentCreateEvents);
    }
    private void goToMap(){
        Intent intentMap = new Intent(this, MapsActivity.class);
        startActivity(intentMap);
    }





}

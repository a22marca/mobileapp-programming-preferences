package com.example.project;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    private TextView textView;
    private SharedPreferences sharedPreferenceRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sharedPreferenceRef = getPreferences(MODE_PRIVATE);
        sharedPreferenceRef  = getSharedPreferences("SharedPreferenceName", MODE_PRIVATE);
        textView = findViewById(R.id.textView);


        Button buttonSecondActivity = findViewById(R.id.buttonToSecondActivity);
        intent = new Intent(MainActivity.this, SecondActivity.class);
        buttonSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }

    public void onResume() {
        super.onResume();
        textView.setText(sharedPreferenceRef.getString("SharedPreferenceString","Empty"));
    }

}

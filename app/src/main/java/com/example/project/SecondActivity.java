package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private SharedPreferences sharedPreferenceRef;
    private SharedPreferences.Editor sharedPreferenceEditor;

    private  EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreferenceRef = getPreferences(MODE_PRIVATE);
        sharedPreferenceRef = getSharedPreferences("SharedPreferenceName",MODE_PRIVATE);
        sharedPreferenceEditor = sharedPreferenceRef.edit();
        editText = findViewById(R.id.editText);

    }

    public void onResume() {
        super.onResume();
        editText.setText(sharedPreferenceRef.getString("SharedPreferenceString","Empty"));
    }
}
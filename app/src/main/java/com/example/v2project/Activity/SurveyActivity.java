package com.example.v2project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.v2project.R;

public class SurveyActivity extends AppCompatActivity {

    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        button = findViewById(R.id.buttonSurveyId);
        radioGroup = findViewById(R.id.radio_group);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(selectedId);
                Intent intent = new Intent(SurveyActivity.this,SurveyActivity2.class);
                startActivity(intent);

            }
        });
    }
}
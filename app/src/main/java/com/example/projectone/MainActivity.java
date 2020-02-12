package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void CalculateGPA(View view){
        TextView text=(TextView) findViewById(R.id.results);// print results
        EditText class1 = (EditText) findViewById(R.id.FirstCourse);
        EditText class2 = (EditText) findViewById(R.id.SecondCourse);
        EditText class3 = (EditText) findViewById(R.id.ThirdCourse);
        EditText class4 = (EditText) findViewById(R.id.FourthCourse);
        EditText class5 = (EditText) findViewById(R.id.FifthCourse);

        if (class1.getText().toString().isEmpty() || class2.getText().toString().isEmpty() || class3.getText().toString().isEmpty() || class4.getText().toString().isEmpty()
                || class5.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Enter All Your Grades", Toast.LENGTH_SHORT).show();
        }
        else {
            double c1 = Double.parseDouble(class1.getText().toString());
            double c2 = Double.parseDouble(class2.getText().toString());
            double c3 = Double.parseDouble(class3.getText().toString());
            double c4 = Double.parseDouble(class4.getText().toString());
            double c5 = Double.parseDouble(class5.getText().toString());

            LinearLayout x = (LinearLayout) findViewById(R.id.background);


            //Double GPA = ((c1 + c2 + c3 + c4 + c5) / 5.0);
            double GPA = 0;
            GPA = (c1 + c2 + c3 + c4 + c5)/5;

            if (GPA < 60.0){
                x.setBackgroundColor(Color.parseColor("#ff0000"));
            }
            else if(GPA >= 61.0 && GPA <= 79.0){
                x.setBackgroundColor(Color.parseColor("#ffff00"));
            }
            else {
                x.setBackgroundColor(Color.parseColor("#00ff00"));
            }


            text.setText("GPA is " + GPA);// view in the text
            //Clear all the fields
            class1.setText("");
            class2.setText("");
            class3.setText("");
            class4.setText("");
            class5.setText("");


        }





    }


}

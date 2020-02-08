package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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
            Double c1 = Double.valueOf(class1.getText().toString());
            Double c2 = Double.valueOf(class1.getText().toString());
            Double c3 = Double.valueOf(class1.getText().toString());
            Double c4 = Double.valueOf(class1.getText().toString());
            Double c5 = Double.valueOf(class1.getText().toString());

            Double GPA = ((c1 + c2 + c3 + c4 + c5) / 5.0);

            text.setText("GPA is " + GPA);// view in the text
        }





    }


}

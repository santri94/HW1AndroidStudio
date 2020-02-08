package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view) {
        //count++;//increment the count
        TextView text=(TextView) findViewById(R.id.msg);// resorce location
        text.setText("Hello Santi");// view in the text
    }
}

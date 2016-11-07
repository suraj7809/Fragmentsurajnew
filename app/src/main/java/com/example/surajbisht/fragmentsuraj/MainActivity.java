package com.example.surajbisht.fragmentsuraj;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et2= (EditText) findViewById(R.id.et2);
        //commit check
    }
    @Override
    protected void onStart() {
        super.onStart();
        et2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.);
    }
public void login()
{

}
}


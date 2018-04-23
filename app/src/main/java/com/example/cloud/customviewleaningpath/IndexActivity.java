package com.example.cloud.customviewleaningpath;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void btn01(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void btn02(View view) {
        startActivity(new Intent(this,PartFiveActivity.class));
    }
}

package com.infotech.sassysaloon.ui.GetStartedActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.infotech.sassysaloon.MainActivity;
import com.infotech.sassysaloon.R;

public class GetStartedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        startActivity(new Intent(this, MainActivity.class));
    }
}
package com.example.clickablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private TextView tvTargetNim;
    private TextView tvTargetNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        tvTargetNim = findViewById(R.id.tv_taget_nim);
        tvTargetNama = findViewById(R.id.tv_target_nama);

        tvTargetNim.setText(getIntent().getStringExtra("nim"));
        tvTargetNama.setText(getIntent().getStringExtra("nama"));
    }
}
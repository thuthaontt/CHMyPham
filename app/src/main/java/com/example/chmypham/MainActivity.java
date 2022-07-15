package com.example.chmypham;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chmypham.Activity.DangNhapActivity;
import com.example.chmypham.Activity.ManHinhChinhActivity;
import com.example.chmypham.Activity.TrangChuActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(getApplicationContext(), ManHinhChinhActivity
                .class));
        finish();
    }
}
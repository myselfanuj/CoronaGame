package com.anujsingh.coronagame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    PlaneAnim pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pa = new PlaneAnim(this);
        setContentView(pa);
    }
}
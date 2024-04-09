package com.example.livedataapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        // first start
        textView.setText("You Clicked Me: "+ mainViewModel.getInitialCounter()+ " times");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("You Clicked Me: "+ mainViewModel.getCounter() +" times");
            }
        });
    }
}
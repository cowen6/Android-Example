package com.example.androidexampleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidexampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e = binding.editText;
                TextView t = binding.outputLabel;
                t.setText(e.getText().toString());
            }
        });
    }
}
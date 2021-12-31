package com.example.piceditor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.piceditor.databinding.ActivityMainBinding;
import com.example.piceditor.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {
 ActivityResultBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getActionBar().hide();
        binding.imageView4.setImageURI(getIntent().getData());
    }
}
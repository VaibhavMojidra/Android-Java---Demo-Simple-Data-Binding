package com.vaibhavmojidra.databindingjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.vaibhavmojidra.databindingjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private boolean isShown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        isShown=true;
        binding.controlButton.setOnClickListener(v -> {
            if(isShown){
                isShown=false;
                binding.progressBar.setVisibility(View.INVISIBLE);
                binding.controlButton.setText("Show");
            }else{
                isShown=true;
                binding.progressBar.setVisibility(View.VISIBLE);
                binding.controlButton.setText("Hide");
            }
        });
    }
}
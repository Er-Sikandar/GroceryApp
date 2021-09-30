package com.sikandar.groceryapp.ui.verifyotp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.sikandar.groceryapp.R;
import com.sikandar.groceryapp.databinding.ActivityVerifyOtpBinding;

public class VerifyOtpActivity extends AppCompatActivity {
private ActivityVerifyOtpBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_verify_otp);



    }
}
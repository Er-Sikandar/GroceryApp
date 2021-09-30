package com.sikandar.groceryapp.baseui;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sikandar.groceryapp.utils.Progress;

import java.util.Objects;

public class BaseActivity extends AppCompatActivity {
    private Progress pDialog;


    public void switchActivity(Class<?> destinationActivity) {
        startActivity(new Intent(this, destinationActivity));
    }
    public void switchActivity(Class<?> destinationActivity, Bundle bundle) {
        Intent intent = new Intent(this, destinationActivity);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void showProgressDialog(String message) {
        if (pDialog == null)
            pDialog = new Progress(this);
        pDialog.setCancelable(false);
        Objects.requireNonNull(pDialog.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        if (pDialog != null && !pDialog.isShowing())
            pDialog.show();
    }

    public void dismissProgressDialog() {
        if (pDialog != null && pDialog.isShowing())
            pDialog.dismiss();
    }
}

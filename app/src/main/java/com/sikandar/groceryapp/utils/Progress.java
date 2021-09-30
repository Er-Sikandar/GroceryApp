package com.sikandar.groceryapp.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.sikandar.groceryapp.R;

public class Progress extends ProgressDialog {

    public Progress(Context context) {
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        ImageView imageView=findViewById(R.id.imageView);
        Glide.with(getContext()).load(R.drawable.app_logo).into(imageView);

    }
    @Override
    public void show() {
        super.show();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dismiss() {
        super.dismiss();
    }
}
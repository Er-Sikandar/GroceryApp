package com.sikandar.groceryapp.ui.splash;

import android.os.Bundle;
import android.os.Handler;

import com.sikandar.groceryapp.R;
import com.sikandar.groceryapp.baseui.BaseActivity;
import com.sikandar.groceryapp.ui.dashboard.FirstDashBoard;
import com.sikandar.groceryapp.ui.login.LoginActivity;
import com.sikandar.groceryapp.ui.verifyotp.VerifyOtpActivity;
import com.sikandar.groceryapp.utils.Const;

public class SplashSreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_sreen);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    switchActivity(VerifyOtpActivity.class);
                    finish();
                }
            }, Const.SplashTime);

    }
    private boolean isLoginUser() {
        /*if (Prefs.getString(getApplicationContext(), Const.TOKEN, "").isEmpty()) {
            return false;
        } else {
            return true;
        }*/
return true;
    }
}
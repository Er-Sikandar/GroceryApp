package com.sikandar.groceryapp.ui.dashboard;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import android.bluetooth.BluetoothClass;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.sikandar.groceryapp.R;
import com.sikandar.groceryapp.baseui.BaseActivity;
import com.sikandar.groceryapp.databinding.ActivityFirstDashBoardBinding;
import com.sikandar.groceryapp.databinding.HeaderLayoutBinding;
import com.sikandar.groceryapp.ui.profile.ProfileActivity;
import com.sikandar.groceryapp.utils.Const;

public class FirstDashBoard extends BaseActivity {
    private static final int TIME_INTERVAL = 2000;
    private long mBackPressed;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFirstDashBoardBinding mBinding = DataBindingUtil.setContentView(this, R.layout.activity_first_dash_board);
        FirstDashboardViewModel firstDashboardViewModel = new ViewModelProvider(this).get(FirstDashboardViewModel.class);
        mBinding.setViewModel(firstDashboardViewModel);
        toolbar = mBinding.toolbar;
        drawerLayout = mBinding.drawerLayout;
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        toggle.syncState();
        showProgressDialog(Const.PLEASE_WAIT);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dismissProgressDialog();
            }
        }, 1000);
        HeaderLayoutBinding headerBinding = HeaderLayoutBinding.bind(mBinding.navigation.getHeaderView(0));
headerBinding.rrUser.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        switchActivity(ProfileActivity.class);
    }
});



        observeData(mBinding, firstDashboardViewModel);
    }

    private void observeData(ActivityFirstDashBoardBinding binding, FirstDashboardViewModel viewModel) {

        viewModel.getOnclick().observe(this, s -> {
            switchActivity(ProfileActivity.class);
        });


    }
    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            Toast.makeText(getBaseContext(), R.string.exit_press_back_twice_message, Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }
}
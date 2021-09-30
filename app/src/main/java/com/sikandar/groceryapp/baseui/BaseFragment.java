package com.sikandar.groceryapp.baseui;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.sikandar.groceryapp.utils.Const;

public class BaseFragment extends Fragment {
    public void switchActivity(Class<?> destinationActivity) {
        startActivity(new Intent(getContext(), destinationActivity));
    }
    public void switchActivity(Class<?> destinationActivity, Bundle bundle) {
        Intent intent = new Intent(getContext(), destinationActivity);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void showProgressDialog() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).showProgressDialog(Const.PLEASE_WAIT);
        }
    }


    public void dismissProgressDialog() {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).dismissProgressDialog();
        }
    }
}

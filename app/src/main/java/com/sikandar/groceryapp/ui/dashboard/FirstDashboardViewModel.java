package com.sikandar.groceryapp.ui.dashboard;

import android.app.Application;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class FirstDashboardViewModel extends AndroidViewModel {
    private MutableLiveData<String> onclick = new MutableLiveData<>();

    public MutableLiveData<String> getOnclick() {
        return onclick;
    }

    public void setOnclick(MutableLiveData<String> onclick) {
        this.onclick = onclick;
    }

    public FirstDashboardViewModel(@NonNull Application application) {
        super(application);
    }
public void submitClick(View view){
        FirstDashboardModel firstDashboardModel=new FirstDashboardModel(onclick.getValue());
        onclick.setValue(String.valueOf(firstDashboardModel));
}


}

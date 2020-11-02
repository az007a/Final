package edu.csce4623.ailinzhang.myapplication.ui.IncomeAndExpenses;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IncomeAndExpensesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IncomeAndExpensesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
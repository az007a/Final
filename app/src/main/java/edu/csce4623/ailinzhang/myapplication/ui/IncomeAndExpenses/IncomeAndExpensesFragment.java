package edu.csce4623.ailinzhang.myapplication.ui.IncomeAndExpenses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import edu.csce4623.ailinzhang.myapplication.R;

public class IncomeAndExpensesFragment extends Fragment {

    private IncomeAndExpensesViewModel incomeAndExpensesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        incomeAndExpensesViewModel =
                ViewModelProviders.of(this).get(IncomeAndExpensesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_income, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        incomeAndExpensesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
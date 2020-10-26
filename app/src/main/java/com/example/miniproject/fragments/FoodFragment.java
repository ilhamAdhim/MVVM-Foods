package com.example.miniproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.Observer;
import android.view.ViewGroup;

import android.util.Log;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.miniproject.R;
import com.example.miniproject.databinding.FragmentFoodBinding;
import com.example.miniproject.models.Food;
import com.example.miniproject.viewmodels.QuantityViewModels;

public class FoodFragment extends Fragment {
    public QuantityViewModels mViewModels;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentFoodBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_food, container, false);
        mViewModels = new ViewModelProvider(this).get(QuantityViewModels.class);
        binding.setQuantityViewModel(mViewModels);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}

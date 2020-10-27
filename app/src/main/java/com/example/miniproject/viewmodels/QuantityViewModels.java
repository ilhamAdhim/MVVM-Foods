package com.example.miniproject.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.miniproject.models.Food;

import java.util.ArrayList;
import java.util.List;

public class QuantityViewModels extends ViewModel {
    private MutableLiveData<Food> foodMutableLiveData = new MutableLiveData<>();

    public LiveData<Food> getQuantity() { return foodMutableLiveData; }

    Food foods = new Food(0,0);

    public void addBeefSteak(){
        foods.setQuantityBeefSteak(foods.getQuantityBeefSteak()+1);
        foodMutableLiveData.setValue(foods);
        Log.d("Stock Beef Steak : ", String.valueOf(foods.getQuantityBeefSteak()));
    }

    public void addChickenChop(){
        foods.setQuantityChickenChop(foods.getQuantityChickenChop()+1);
        foodMutableLiveData.setValue(foods);
        Log.d("Stock Chicken chop : ", String.valueOf(foods.getQuantityChickenChop()));
    }

    public void removeBeefSteak(){
        if(foods.getQuantityBeefSteak() > 0) foods.setQuantityBeefSteak(foods.getQuantityBeefSteak()-1);
        foodMutableLiveData.setValue(foods);
        Log.d("Stock Beef Steak : ", String.valueOf(foods.getQuantityBeefSteak()));
    }

    public void removeChickenChop(){
        if(foods.getQuantityChickenChop() > 0) foods.setQuantityChickenChop(foods.getQuantityChickenChop()-1);
        foodMutableLiveData.setValue(foods);
        Log.d("Stock Beef Steak : ", String.valueOf(foods.getQuantityChickenChop()));
    }

    public void resetQuantity(){
        foods.setQuantityBeefSteak(0);
        foods.setQuantityChickenChop(0);
        foodMutableLiveData.setValue(foods);
        Log.d("Reset, Chicken chop:", String.valueOf(foods.getQuantityChickenChop()));
        Log.d("Beef Steak:", String.valueOf(foods.getQuantityBeefSteak()));
    }
}

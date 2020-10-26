package com.example.miniproject.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.miniproject.models.Food;

import java.util.ArrayList;
import java.util.List;

public class QuantityViewModels extends ViewModel {
    private MutableLiveData<List<Food>> foodMutableLiveData = new MutableLiveData<>();
    public LiveData<List<Food>> getQuantity() { return foodMutableLiveData; }

    public List<Food> Foods = new ArrayList<>();

    Food chickenChop;
    Food beefSteak;

    public void addBeefSteak(){
        if(Foods.isEmpty()){
            beefSteak = new Food("Beef Steak",0);
            Foods.add(beefSteak);
        }
        beefSteak.setQuantity(beefSteak.getQuantity()+1);
        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + beefSteak.getName() + " amount : ", String.valueOf(Foods.get(0).getQuantity()));
    }

    public void addChickenChop(){
        if(Foods.isEmpty()){
            chickenChop = new Food("Chicken Chop",0);
            Foods.add(chickenChop);
        }

        chickenChop.setQuantity(chickenChop.getQuantity()+1);
        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + chickenChop.getName() + " amount : ", String.valueOf(Foods.get(1).getQuantity()));
    }

    public void removeBeefSteak(){
        if(Foods.isEmpty()){
            chickenChop = new Food("Chicken Chop",0);
            Foods.add(chickenChop);
        }
        if(beefSteak.getQuantity() > 0) beefSteak.setQuantity(beefSteak.getQuantity()-1);
        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + beefSteak.getName() + " amount : ", String.valueOf(Foods.get(0).getQuantity()));
    }

    public void removeChickenChop(){
        if(chickenChop.getQuantity() > 0) chickenChop.setQuantity(chickenChop.getQuantity()-1);
        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + chickenChop.getName() + " amount : ", String.valueOf(Foods.get(1).getQuantity()));
    }

    public void resetQuantity(){
        for (Food food : Foods) {
            food.setQuantity(0);
        }
        foodMutableLiveData.setValue(Foods);
        Log.d("Foods has reset, Away:", String.valueOf(beefSteak.getQuantity()));
        Log.d("Home:", String.valueOf(chickenChop.getQuantity()));
    }
}

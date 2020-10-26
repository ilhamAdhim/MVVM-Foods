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

    public void addBeefSteak(int amount){
        if(!Foods.contains(beefSteak)){
            Foods.add(new Food("Beef Steak",0));
        }
        beefSteak.setQuantity(beefSteak.getQuantity()+1);

        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + beefSteak.getName() + " amount : ", String.valueOf(beefSteak.getQuantity()));
    }

    public void addChickenChop(){
        if(!Foods.contains(chickenChop)){
            Foods.add(new Food("Chicken Chop",0));
        }
        chickenChop.setQuantity(chickenChop.getQuantity()+1);

        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + chickenChop.getName() + " amount : ", String.valueOf(chickenChop.getQuantity()));
    }

    public void removeBeefSteak(int amount){
        if(!Foods.contains(beefSteak)){
            Foods.add(new Food("Beef Steak",0));
        }
        beefSteak.setQuantity(beefSteak.getQuantity()-1);

        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + beefSteak.getName() + " amount : ", String.valueOf(beefSteak.getQuantity()));
    }

    public void removeChickenChop(int amount){
        if(!Foods.contains(chickenChop)){
            Foods.add(new Food("Chicken Chop",0));
        }
        chickenChop.setQuantity(chickenChop.getQuantity()-1);

        foodMutableLiveData.setValue(Foods);
        Log.d("Food " + chickenChop.getName() + " amount : ", String.valueOf(chickenChop.getQuantity()));
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

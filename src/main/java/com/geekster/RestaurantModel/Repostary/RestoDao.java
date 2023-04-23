package com.geekster.RestaurantModel.Repostary;

import com.geekster.RestaurantModel.Model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestoDao {

    private List<Restaurant> restoList;

    public RestoDao(){
        restoList=new ArrayList<>();
        restoList.add(new Restaurant("RestoFiveStar", "Pune", "1", "ChikenThali", "20"));
    }

    public List<Restaurant> allResto() {
        return restoList;
    }

    public Restaurant getRestoById(String id) {
        List<Restaurant> restoListRightNow = allResto();

        for(Restaurant resto : restoListRightNow){

            if(resto.getId().equals(id)){

                return resto;
            }
        }
        return null;
    }

    public boolean saveResto(Restaurant restaurant) {
        restoList.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant restaurant) {
        restoList.remove(restaurant);
        return true;
    }

    public String update(String id, Restaurant restaurant) {
        Restaurant restaurant1= getRestoById(id);
        if (id != null){
            restaurant1.setName(restaurant.getName());
            restaurant1.setAddress(restaurant.getAddress());
            restaurant1.setId(restaurant.getId());
            restaurant1.setSpecialty(restaurant.getSpecialty());
            restaurant1.setTotalStaff(restaurant.getTotalStaff());

            return "Resto with id"+restaurant.getId()+" updated Successfully...!!!";
        }
        return " Cannot find Resto with id"+restaurant.getId();
    }
}

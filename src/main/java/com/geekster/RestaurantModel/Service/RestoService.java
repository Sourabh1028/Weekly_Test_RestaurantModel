package com.geekster.RestaurantModel.Service;

import com.geekster.RestaurantModel.Model.Restaurant;
import com.geekster.RestaurantModel.Repostary.RestoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestoService {

    @Autowired
    RestoDao restoDao;

    public Restaurant getRestoById(String id) {
        return restoDao.getRestoById(id);
    }

    public List<Restaurant> getAllRestaurant() {

        return restoDao.allResto();
    }

    public String addResto(Restaurant restaurant) {
        boolean insertionStatus = restoDao.saveResto(restaurant);
        if(insertionStatus){
            return "Resto added Successfully !!!";
        }
        else{
            return "Failed... to add !!!";
        }
    }

    public String deleteRestoById(String id) {
        List<Restaurant> restoListRightNow = restoDao.allResto();
        if(id !=null){

            for(Restaurant resto : restoListRightNow) {

                if (resto.getId().equals(id)) {
                    restoDao.remove(resto);
                    return "Resto with "+id+" was deleted !!!";
                }
            }
        }
        return "Resto with"+id+"was not EXIST !!!";
    }

    public String updateResto(String id, Restaurant restaurant) {
        return restoDao.update(id, restaurant);
    }
}

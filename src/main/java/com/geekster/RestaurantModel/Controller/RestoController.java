package com.geekster.RestaurantModel.Controller;

import com.geekster.RestaurantModel.Model.Restaurant;
import com.geekster.RestaurantModel.Service.RestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestoController {
    @Autowired
    RestoService restoService;

    @GetMapping(value = "/getAllResto")
    public List<Restaurant> getAllResto(){
        return restoService.getAllRestaurant();
    }

    @GetMapping(value = "/getById/{id}")
    public Restaurant getRestoById(@PathVariable String id){

        return restoService.getRestoById(id);
    }

    @PostMapping(value = "/addResto")
    public String addResto(@RequestBody Restaurant restaurant){
        return restoService.addResto(restaurant);
    }

    @DeleteMapping(value = "/removeRestoById/{id}")
    public String deleteById(@PathVariable String id){
        return restoService.deleteRestoById(id);
    }

    @PutMapping(value = "/updateResto/{id}")
    public String updaterestoById(@PathVariable String id, @RequestBody Restaurant restaurant){
        return restoService.updateResto(id, restaurant);
    }

}

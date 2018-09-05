package org.alyab;

import java.util.Scanner;

public class Finder {

    Restaurant[] restaurants;


    public Finder(Restaurant[] restaurants) {
        this.restaurants = restaurants;

    }



    public Restaurant findRestaurant(String menuName) {
        Restaurant result = null;
        for (int i = 0; i < this.restaurants.length; i++) {
            Restaurant res = this.restaurants[i];

            if (res.isSell(menuName )) {
                result = res;
                break;
            }
        }
        return result;

    }

    public Restaurant[] findRestaurants(String menuName) {
        Restaurant[] result = new Restaurant[this.restaurants.length];

        for (int i = 0; i <this.restaurants.length ; i++) {

            Restaurant res = this.restaurants[i];
            if(res.isSell(menuName)){
                result[i] = res;
            }

        }
        return result;
    }
}
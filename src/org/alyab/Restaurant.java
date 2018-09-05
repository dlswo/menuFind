package org.alyab;

import java.util.Arrays;

public class Restaurant {

    String title;
    String[] menus;

    public Restaurant(String title, String[] menus) {
        this.title = title;
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "title='" + title + '\'' +
                ", menus=" + Arrays.toString(menus) +
                '}';
    }

    public boolean isSell(String menuName){

        for (String menu: this.menus) {
            if(menu.equals(menuName)){
                return true;
            }
        }
        return false;
    }
}
package com.example.kiosk.LV4LV5;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuItems;
    private final String category;

    public Menu(String category, List<MenuItem> menuItems){
        this.category = category;
        this.menuItems = menuItems;
    }

    public String getCategory(){
        return category;
    }
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
}

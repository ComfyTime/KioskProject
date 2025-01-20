package com.example.kiosk.LV4LV5;

public class MenuItem {
    //필드
    private final String name; //name
    private final double price; //price
    private final String desc; //description

    //생성자
    public MenuItem(String name, double price, String desc){
        this.name=name;
        this.price=price;
        this.desc=desc;

    }
    //메서드

    //getter setter
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getDesc(){
        return desc;
    }
}

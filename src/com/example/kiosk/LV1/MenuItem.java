package com.example.kiosk.LV1;

public class MenuItem {
    //필드
    private String name; //name
    private double price; //price
    private String desc; //description

    //생성자
    public MenuItem(String name, double price, String desc){
        this.name=name;
        this.price=price;
        this.desc=desc;

    }
    //메서드
    //getter setter
    //출력
    String strPrice=String.valueOf(price); // String 배열에 넣기 위한 형변환
    public String getMenuItem(int i){
        String[] Item={this.name,this.strPrice,this.desc};
        return Item[i];
    }
}

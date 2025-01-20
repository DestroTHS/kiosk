package com.example.kiosk.level5;

public class MenuItem {
    //private 을 통해 필드에 직접 접근하지 못하도록 설정
    private String name; //매뉴 이름
    private double price; //메뉴 가격
    private String description; //메뉴 설명

    //Getter 메서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    //생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // | + W + price + | 추가
    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}

package com.example.kiosk.level2;

public class MenuItem {
    //필드 선언
    String name; // 메뉴 이름
    double price; // 메뉴 가격
    String description; // 메뉴 설명

    // MenuItem 객체를 초기화하는 생성자 추가
    public MenuItem(String name, double price, String description) {
        this.name = name;              // 메뉴 이름 필드 초기화
        this.price = price;            // 메뉴 가격 필드 초기화
        this.description = description; // 메뉴 설명 필드 초기화
    }

    // | + W + price + | 추가
    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}

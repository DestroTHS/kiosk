package com.example.kiosk.level5;

import com.example.kiosk.level4.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 'Burgers' 메뉴 생성
        Menu burgersMenu = new Menu("Burgers");
        // 버거 메뉴 항목 추가
        burgersMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 'Drinks' 메뉴 생성
        Menu drinksMenu = new Menu("Drinks");
        // 음료 메뉴 항목 추가
        drinksMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("Coke", 1.5, "콜라"));
        drinksMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("Soda", 1.5, "사이다"));
        drinksMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("Zero Coke", 1.5, "제로 콜라"));

        // 'Desserts' 메뉴 생성
        Menu dessertsMenu = new Menu("Desserts");
        // 디저트 메뉴 항목 추가
        dessertsMenu.addMenuItem(new com.example.kiosk.level4.MenuItem("Chocolate Cake", 6.5, "초콜릿 케이크"));
        dessertsMenu.addMenuItem(new MenuItem("Cheese Cake", 7.0, "치즈 케이크"));

        // 메뉴 리스트 생성 및 각 메뉴 추가
        List<Menu> menus = new ArrayList<>();
        menus.add(burgersMenu); // 버거 메뉴 추가
        menus.add(drinksMenu); // 음료 메뉴 추가
        menus.add(dessertsMenu); // 디저트 메뉴 추가

        // Kiosk 객체 생성 및 메뉴 리스트 전달
        Kiosk kiosk = new Kiosk(menus);
        // 키오스크 프로그램 실행
        kiosk.start();
    }
}

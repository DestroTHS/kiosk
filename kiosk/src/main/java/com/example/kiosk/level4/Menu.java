package com.example.kiosk.level4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 메뉴의 이름을 저장하는 필드
    String MenuType;

    // 메뉴에 포함된 MenuItem 객체를 저장하는 리스트
    List<MenuItem> menuItems;

    // Menu 객체 초기화 생성자
    Menu(String MenuType) {
        this.MenuType = MenuType; // 메뉴 이름 초기화
        this.menuItems = new ArrayList<>(); // 메뉴 아이템 리스트 초기화
    }

    // 메뉴 아이템 리스트 반환 메서드
    List<MenuItem> menuItems() {
        return menuItems;
    }

    // 새로운 메뉴 아이템을 리스트에 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 현재 메뉴의 이름과 포함된 메뉴 아이템을 출력하는 메서드
    public void MenuType() {
        System.out.println("[ " + MenuType.toUpperCase() + " MENU ]");

        // 메뉴 아이템 출력
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).toString());
        }
        System.out.println("0. 뒤로가기");
    }

    // 메뉴 이름을 문자열로 반환
    @Override
    public String toString() {
        return MenuType;
    }
}


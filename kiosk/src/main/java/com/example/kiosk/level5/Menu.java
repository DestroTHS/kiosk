package com.example.kiosk.level5;

import com.example.kiosk.level4.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 메뉴의 이름을 저장하는 필드 (캡슐화를 위해 private 설정)
    private String MenuType;

    // 메뉴에 포함된 MenuItem 객체 리스트 (캡슐화를 위해 private 설정)
    private List<MenuItem> menuItems;

    // Menu 객체 초기화 메서드
    public Menu(String MenuType) {
        this.MenuType = MenuType; // 메뉴 이름 초기화
        this.menuItems = new ArrayList<>(); // 메뉴 아이템 리스트 초기화
    }

    // Getter 메서드: 메뉴 이름 반환
    public String getMenuType() {
        return MenuType;
    }

    // Getter 메서드: 메뉴 아이템 리스트 반환
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // 메뉴 아이템 추가 메서드
    public void addMenuItem(MenuItem menuItem) {
        // 새로운 메뉴 아이템을 리스트에 추가
        this.menuItems.add(menuItem);
    }

    // 현재 메뉴의 이름과 포함된 메뉴 아이템을 출력하는 메서드
    public void MenuType() {
        // 메뉴 카테고리 출력
        System.out.println("[ " + MenuType.toUpperCase() + " MENU ]");

        // 메뉴 아이템 리스트 출력
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


package com.example.kiosk.level3;

import java.util.List;
import java.util.Scanner;

class Kiosk {
    //MenuItem을 관리하는 리스트가 필드로 존재
    List<MenuItem> menuItems;

    //List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    //main 함수에서 관리하던 입력과 반복문 로직을 start 함수로
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[SHAKESHACK MENU]");
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).toString());
            }
            System.out.println("0. 종료 | 종료");

            System.out.print("선택: ");
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (input > 0 && input <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(input - 1);
                System.out.println("선택한 메뉴 : " + selectedItem.toString());
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}

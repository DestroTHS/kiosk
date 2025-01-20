package com.example.kiosk.level4;

import java.util.List;
import java.util.Scanner;

class Kiosk {
    // 메뉴 리스트를 저장하는 필드
    List<Menu> menus;

    // Kiosk 객체 초기화 및 메뉴 리스트를 전달받는 생성자 추가
    Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // 프로그램 시작 메서드
    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메인메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                // 메뉴타입 출력
                System.out.println((i + 1) + ". " + menus.get(i).toString());
            }
            System.out.println("0. 종료 | 종료");

            // 사용자 입력 요청
            System.out.print("선택: ");
            int input = sc.nextInt(); // 사용자로부터 숫자 입력받기

            // 사용자가 입력한 값이 0이면 프로그램 종료
            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 유효값 검사
            if (input > 0 && input <= menus.size()) {
                // 선택한 메뉴 카테고리를 가져옴
                Menu selectedMenu = menus.get(input - 1);
                // 선택한 메뉴의 아이템 리스트 출력
                menuItemList(selectedMenu, sc);
            } else {
                // 유효하지 않은 입력 처리
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    // 선택한 메뉴타입의 아이템 리스트 출력 및 선택 처리 메서드
    public void menuItemList(Menu menu, Scanner sc) {
        while (true) {
            // 선택한 메뉴의 이름과 아이템 출력
            menu.MenuType();

            System.out.print("선택: ");
            int input = sc.nextInt();

            // 입력이 0인 경우 메인 메뉴로 돌아감
            if (input == 0) {
                System.out.println("[ MAIN MENU ]로 돌아갑니다.");
                break;
            }

            // 메뉴 아이템 리스트 가져오기
            List<MenuItem> items = menu.menuItems();

            // 유효값 검사
            if (input > 0 && input <= items.size()) {
                // 선택한 메뉴 아이템 출력
                System.out.println("선택한 메뉴: " + items.get(input - 1).toString());
            } else {
                // 유효하지 않은 입력 처리
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
            System.out.println();
            break; // 현재 반복문 종료 (메인 메뉴로 복귀)
        }
    }
}

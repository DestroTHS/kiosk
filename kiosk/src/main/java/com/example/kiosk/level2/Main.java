package com.example.kiosk.level2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 메뉴 항목을 저장할 List를 선언하고 초기화
        List<MenuItem> menuItems = new ArrayList<>();

        // MenuItem 객체를 List 에 추가
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // 사용자 입력을 받기 위한 Scanner
        Scanner sc = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            System.out.println("[SHAKESHACK MENU]");
            // List의 각 항목(MenuItem)을 순회하며 출력
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.println((i + 1) + ". " + menuItems.get(i).toString());
            }
            System.out.println("0. 종료 | 종료");

            // 사용자 입력 요청
            System.out.print("선택: ");
            // 사용자로부터 정수 입력 받기
            int input = sc.nextInt();

            // 사용자가 입력한 값이 0이면 프로그램 종료
            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // 반복문 종료
            }

            // 유효한 메뉴 번호 입력 시 선택된 메뉴 출력
            if (input > 0 && input <= menuItems.size()) {
                // 입력 번호에 해당하는 MenuItem 가져오기
                MenuItem selectedItem = menuItems.get(input - 1);
                System.out.println("선택한 메뉴 : " + selectedItem.toString()); // 선택한 메뉴 출력
            } else { // 위의 경우가 아니면
                // 유효하지 않은 번호 입력 시 오류 메시지 출력
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}

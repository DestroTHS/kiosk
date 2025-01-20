package com.example.kiosk.level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메뉴 출력
            System.out.println("[SHAKESHACK MENU]");
            System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료          | 종료");
            // 사용자에게 메뉴번호를 입력받기
            int input = sc.nextInt();

            // 사용자가 입력한 값이 0일 경우 프로그램 종료
            if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 사용자의 입력값에 따라 메뉴 항목 출력
            switch (input) {
                case 1: // 입력값이 1일 경우
                    System.out.println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    break;
                case 2: // 입력값이 2일 경우
                    System.out.println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    break;
                case 3: // 입력값이 3일 경우
                    System.out.println("3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    break;
                case 4: // 입력값이 4일 경우
                    System.out.println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    break;
            }
        }
    }
}
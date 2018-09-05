package org.alyab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Restaurant[] arr = {
                new Restaurant("한솥", new String[]{"치킨마요, 도련님, 고기고기"}),
                new Restaurant("미정국수", new String[]{"멸치국수, 비빔국수, 제육덮밥"}),
                new Restaurant("종로분식", new String[]{"떡볶이, 튀김, 쫄면"}),
                new Restaurant("유진식당", new String[]{"냉면, 녹두전, 설렁탕"}),
                new Restaurant("안래홍", new String[]{"짜장면, 짬뽕, 볶음밥"})
        };

        Finder input = new Finder(arr);
        FinderUI finderUI = new FinderUI(input);

        finderUI.getMenuUI();


//        // 메뉴 이름을 입력 받는다.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("메뉴를 입력해주세요.: ");
//        String name = scanner.nextLine();
//
//        // Restaurant[] arr에서 해당 메뉴를 찾고, 식당 이름과 메뉴를 출력한다.
//
    }
}
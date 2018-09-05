package org.alyab;


import java.util.Arrays;
import java.util.Scanner;

public class FinderUI {

    Finder finder ;


    public FinderUI(Finder finder) {
        this.finder = finder;
    }

    public void getMenuUI() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴를 입력해주세요.: ");
        String menuName = scanner.nextLine();
        Restaurant result = finder.findRestaurant(menuName);
        System.out.println("음식점 이름 : " + result +"\n음식점 메뉴 : ");
    }
}

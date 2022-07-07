package com.tak.hello;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("성을 제외한 이름을 입력하세요 : ");
        String lastName = sc.next();

        System.out.print("이름을 제외한 성을 입력하세요 : ");
        String firstName = sc.next();

        System.out.println("안녕하세요. " + firstName + lastName + "씨.");
    }
}

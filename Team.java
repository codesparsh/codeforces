package com.sparshi;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int sum=0;
        while (n > 0) {

            for (int i = 0; i < 3; i++) {
                 sum+=sc.nextInt();
            }
            if(sum>1){c++;}
            n--;
            sum=0;
        }
        System.out.println(c);
    }
}
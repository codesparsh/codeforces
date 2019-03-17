package com.sparshi;

import java.util.Arrays;
import java.util.Scanner;

public class divisors_of_two_integers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int arr[]=new int[x];
        for (int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=x-1;i>0;i--){
            if(arr[i]==arr[i-1]||arr[x-1]%arr[i]!=0){
                System.out.println(arr[x-1]+" "+arr[i]);
                break;
            }

        }
    }
}

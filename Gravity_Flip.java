package com.sparshi;

import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int j=0;j<n;j++)
        {
        System.out.print(arr[j]+" ");
    }
    }
}

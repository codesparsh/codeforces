package com.sparshi;

import java.util.Scanner;

public class vanya_and_fence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int h=sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>h)
            {
                sum+=2;
            }
            else{
                sum+=1;
            }
        }
        System.out.println(sum);
    }

}

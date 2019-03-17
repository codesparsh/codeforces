package com.sparshi;

import java.util.Scanner;

public class Beautiful_Matrix {
    public  static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int r=0,c=0;
        int arr[][]= new int[5][5];
        for (int i=0;i<5;i++){
              for (int j=0;j<5;j++){
                  arr[i][j]=sc.nextInt();
                if (arr[i][j]==1){
                    r=i+1;
                    c=j+1;
                }
              }
        }
        System.out.println(Math.abs(r-3)+Math.abs(c-3));


    }

}

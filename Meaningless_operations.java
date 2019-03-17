package com.sparshi;

import java.util.Scanner;

public class Meaningless_operations {
            static boolean poweroftwo(int x)
            {
                return (int)(Math.ceil((Math.log(x) / Math.log(2)))) ==
                        (int)(Math.floor(((Math.log(x) / Math.log(2)))));
            }
            public static void main(String[] args)
            {
                Scanner sc= new Scanner(System.in);
                int arr[] = {0,1,1,1,5,1,21,1,85,73,341,89,1365, 1, 5461, 4681, 21845, 1, 87381, 1, 349525, 299593, 1398101, 178481, 5592405, 1082401};
                int t= sc.nextInt();
                while(t>0)
                {
                    int a=sc.nextInt();
                    if(poweroftwo(a+1) )
                    {
                        int y= (int)(Math.log(a+1) / Math.log(2));
                        System.out.println(arr[y]);

                    }
                    else
                    {
                        int p=(int)(Math.log(a) / Math.log(2))+1;
                        System.out.println((int)Math.pow(2,p)-1);

                    }
                    t--;
                }
            }
        }


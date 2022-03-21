package com.java;
import java.util.*;
  import java.util.Scanner;

public class NumberPyramid {

  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

       int n= sc.nextInt();
       //outer loop
       for(int i=1; i<=n; i++){
       //spaces
         for( int j=1; j<=n-i; j++){
           System.out.print( " ");
         }
         //number>>print row no. =row no. times
         for(int j=1;j<=i; j++){
           System.out.print(i +" ");
         }
         System.out.println( );
       }

  }

}

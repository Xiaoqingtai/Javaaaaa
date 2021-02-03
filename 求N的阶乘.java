package com.company;
import java.util.Scanner;
public class Main {public static void main(String []args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int i = 1;
    int sum = 1;
    while(i<=n){
        sum = sum*i;
        i++;
    }
    System.out.println(sum);
}
}
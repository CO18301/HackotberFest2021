package com.company;

public class StrongNumber {

    public static String isStrongNumber(int num) {
        String given = String.valueOf(num);
        int sum = 0;
        for(int i=0; i<given.length(); i++){
            sum += fact(Character.digit(given.charAt(i),10));
        }
        if(sum == num){
            return "STRONG!!!!";
        }
        return "Not Strong !!";
    }

    public static int fact(int a){
        int factorial = 1;
        for(int i=1; i<=a; i++){
            factorial *= i;
        }
        return factorial;
    }
}

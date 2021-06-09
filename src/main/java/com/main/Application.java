package com.main;

public class Application {
    public static void main(String[] args) {
        printPattern4(5);
    }
    private static void printPattern4(int n) {
        for (int i = n; i >= 1; --i) {
            System.out.println();
            printNChars(i-1, '-');
            printNoStrartToEnd((n-(n-i)), n);
        }
    }
    private static void printNChars(int n, char ch) {
        while(n > 0){
            System.out.print(ch);
            --n;
        }
    }
    private static void printNoStrartToEnd(int start, int end) {
        while(start <= end){
            System.out.print(start);
            ++start;
        }
    }

}

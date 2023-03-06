import java.io.*;
import java.util.*;


public static void main(String[] args) {
    int a = 0;
    int b = 0;
    System.out.println("Type two numbers");
    Scanner scan = new Scanner(System.in);
    try {
        a = scan.nextInt();
        b = scan.nextInt();
    } catch (Exception ex) {
        System.err.println("Type number!");
    }
}
package com.bridgelaz;

import java.util.Arrays;
import java.util.Scanner;

public class NonReapeatingElementsInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size Of Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the Elements In An Array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean visited[] = new boolean[size];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                visited[i] = true;
                visited[i + 1] = true;
            }
        }
        System.out.println("Non Reapeating Elements in an Array : ");
        for (int i = 0; i < arr.length; i++) {
            if (visited[i] != true) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
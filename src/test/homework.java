package test;

import java.util.Arrays;

import test.homework;

public class homework {
    public static void main(String[] args) {
        System.out.println("Bubble sort (analyze and implement bubble sort)\n");
        int[] arr = {4, 1, 2, 7, 3, 8, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.print(Arrays.toString(arr));


        System.out.println("Create Logical Structures (As big as possible) from your life and print them in main function.\n");

        Human h1 = new Human();
        h1.setFullname("Artur", "Babloyan");
        h1.setGender("male");
        h1.setAge(24);
        h1.setFirstName("Armen");
        System.out.println(h1.getFirstName());
        System.out.println(h1.getGender());
        System.out.println(h1.getFullname());
        System.out.println(h1.getAge());


    }
}

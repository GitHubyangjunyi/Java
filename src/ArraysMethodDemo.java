import java.util.Scanner;
import java.util.Arrays;

public class ArraysMethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = { 7, 5, 3, 12, 9, 17, 14, 15, 16, 13 };
        System.out.println("No Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
        Arrays.sort(arr);//使用sort方法进行排序
        System.out.println("Sorted:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
        System.out.println("Input number to search:");
        int key = scanner.nextInt();
        int find = -1;
        if ((find = Arrays.binarySearch(arr, key)) > -1) {
            System.out.println("Get the index:" + find);
        } else {
            System.out.println("Number doesn't exist!");
        }
        scanner.close();
        ////////////////////////////////////////
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        Arrays.fill(arr1, 5);
        Arrays.fill(arr2, 5);
        Arrays.fill(arr3, 10);
        System.out.println("arr1:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.err.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.err.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.err.println();
        System.out.println("arr1=arr2?" + Arrays.equals(arr1, arr2));
        System.out.println("arr1=arr3?" + Arrays.equals(arr1, arr3));
    }

}
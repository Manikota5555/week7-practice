import java.util.Scanner;

public class ArrInsertLast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int arr1[] = new int[n + 1];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the element: " + (i + 1));
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the new element: ");
    arr1[arr1.length - 1] = sc.nextInt();
    for (int k = 0; k < arr.length; k++) {
      arr1[k] = arr[k];
    }
    for (int j = 0; j < arr1.length; j++) {
      System.out.println("Element: " + arr1[j]);
    }

  }
}
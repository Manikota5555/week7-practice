import java.util.Scanner;

public class ArrRemoveLast {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];
    int[] arr1 = new int[4];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter array elements " + (i + 1));
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = arr[i];
    }

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }

  }
}
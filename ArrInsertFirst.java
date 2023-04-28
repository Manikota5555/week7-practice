import java.util.Scanner;

public class ArrInsertFirst {
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int n=s.nextInt();
    int[] arr= new int[n];
    int[] arr1=new int[n+1];
    for(int i=0;i<arr.length;i++){
    System.out.println("Enter the elements"+(i+1));
    arr[i]=s.nextInt();
    }
    for(int i=0;i<arr.length;i++){
    arr1[i+1]=arr[i];
    }
    System.out.println("Enter your element to insert");
    int x=s.nextInt();
    arr1[0]=x;
    for(int i=0;i<arr1.length;i++){
    System.out.println(arr1[i]);
    }
    
  }
}
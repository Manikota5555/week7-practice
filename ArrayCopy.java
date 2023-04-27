import java.util.Scanner;
public class ArrayCopy{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[6];
    for(int i=0;i<arr.length;i++){
      System.out.println("Enter Element");
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);  
    }
    
  }
}
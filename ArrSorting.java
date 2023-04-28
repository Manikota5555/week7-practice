import java.util.*;
public class ArrSorting{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the how many elements you want to enter: ");
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("enter the element"+(i+1));
      arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          int x=arr[i];
           arr[i]=arr[j];
           arr[j]=x;
        }
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    
  }
}
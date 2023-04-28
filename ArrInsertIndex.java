import java.util.*;
public class ArrInsertIndex{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter howmany elements you want to enter");
    
    int n=sc.nextInt();
    int[] arr=new int[n+1];
   for(int i=0;i<n;i++){
     System.out.println("enter the element"+(i+1));
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the position number to insert");
    int y=sc.nextInt();
System.out.println("Enter the element to insert in "+y+" position");
    int x=sc.nextInt();
    for(int i=arr.length-1;i>=y;i--){
      arr[i]=arr[i-1];
    }
    arr[y]=x;
 
    for(int i=0;i<arr.length;i++){
     System.out.println(arr[i]);
    }
 
    
    
}
}
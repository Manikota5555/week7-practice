import java.util.Scanner;
public class ArrRemoveIndex{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of arry");
    int n=sc.nextInt();
 
    int[] arr=new int[n];
      
    int[] arr1=new int[n-1];
 
    System.out.println("Enter the index position where you want to remove elemnet");
    int pos=sc.nextInt();
          
    for(int i=0;i<arr.length;i++){
      System.out.println("Enter array elements "+(i+1));
      arr[i]=sc.nextInt();
    }
      
    for(int i=0;i<arr1.length;i++){ 
      if(i>=pos){
        arr1[i]=arr[i+1];
      }
      else{
      arr1[i]=arr[i]; 
      }
    }
    
    for(int i=0;i<arr1.length;i++){
      System.out.println(arr1[i]); 
    }
    
  }
}
import java.io.*;
import java.util.*;
public class Test1{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter of student date you want to enter:");
    int n=s.nextInt();
    String name = "0",gender = "0";
    try{
      FileWriter file = new FileWriter("Textfile.txt");
      for(int i = 1;i <= n;i++){
        System.out.println("Enter Name :");
        name = s.next();
        file.write("Student name : "+name);
        System.out.print("Enter gender : ");
          gender = s.next();
        file.write("Student gender : "+gender);
        file.flush();
      }
    }
    catch(IOException e){
      System.out.println(e);
    }
  }
}
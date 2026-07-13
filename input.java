import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        String name =scan.nextLine();
        int age=scan.nextInt();
        System.out.print("my name is"+name);
        System.out.print("my age is"+age);
    }
}
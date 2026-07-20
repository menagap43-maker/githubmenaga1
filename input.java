/*1.import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        String name =scan.nextLine();
        int age=scan.nextInt();
        System.out.println("my name is "+ name);
        System.out.println("my age is "+ age);
    }
}*/

/*2.public class input{
    public static void main(String[] args) {
    int a =10;
    int b=20;
    System.out.print(a+b);
    }
}*/

/*3.import java.util.Scanner;
public class input{
public static void main(String args[]){
Scanner scan = new Scanner (System.in);
int a= scan.nextInt();
int b= scan.nextInt();
int c= scan.nextInt();
int d =a*b*c;
int e =a+b+c;
System.out.print(d/e);
}
}*/

import java.util.Scanner;
public class input{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double score = scan.nextDouble();
        scan.nextLine();
        String department = scan.nextLine();
        System.out.println("my name is: " + name);
        System.out.println("my score is: " + score/10);
        System.out.println("my department is: " + department);
    }
}
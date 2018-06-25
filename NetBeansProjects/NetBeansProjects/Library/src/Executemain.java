import java.util.*;
public class Executemain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        int a=sc.nextInt();
        System.out.println("Enter the marks of 2 subject");
        int b=sc.nextInt();
        System.out.println("Enter the marks of 3rd subject");
        int c=sc.nextInt();
        Library1 l=new Library1(a,b,c);
        l.average();
}
    
}

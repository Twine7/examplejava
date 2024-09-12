import java.util.Scanner;

public class exampleTwo{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.nextLine();
        System.out.println("How much do you make");
        int salary = sc.nextInt();
        System.out.println("Name is: "+name);
        System.out.println("Salary is:"+ salary);
        System.out.println(name+ " makes "+ salary+ "shs");
        sc.close();
    }
}
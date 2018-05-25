import java.util.Scanner;

class acad
{
    static void sum(int x,int y)
    {
        System.out.println("First number is: "+x);
        System.out.println("Second number is: "+y);
        System.out.println("Sum is: "+(x+y));
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);//input from commandline
        int b = Integer.parseInt(args[1]);//input from commandline
        sum(a,b);
    }
}

import java.util.Scanner;
class acad
{
    static void sum(int a, int b) {
        System.out.println(a+b);
    }
    static void sum(double a, double b) {
        System.out.println(a+b);
    }
    public static void main(String args[]) {
        sum(4,9);
        sum(7.8,10.3);
        //Here , sum function takes either 2 int arguments or 2 double type arguments.,hence overloading concept is implemented
    }
}

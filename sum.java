import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //Sum
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=a+b;
        // System.out.println(c);

        //Area of Circle
        // double r=sc.nextDouble();
        // double a=3.14*(r*r);
        // System.out.println(a);

        //Type conversion
        //This is only possible of small datatype is getting stored in larger datatype
        //byte->short->int->float->long->double

        //Type Casting
        //This is also possible but java warns us for lossy conversion(data loss)

        //Type promotion 2 types
        // 1. This happens when a char, short, byte is used with expression, the compiler automatically treats it as int.
        // char a='a';
        // char b='b';
        // System.out.println(b-a);

        // short a=5;
        // byte b=10;
        // char c='c';
        // byte bt=(byte) (a+b+c);
        // System.out.println(bt);


        // 2. This happens when there are datatypes like long, float, double in an expression then the compiler will convert the answer into the largest datatype, present in the expression.
        // int a=9;
        // float b=10.56f;
        // long c=20;
        // // double d=10;
        // // double ans=a+b+c+d;
        // System.out.println(a+b+c);
    }
}

package Insrurction;

import java.util.*;
public class customer{

public static void main(String[] args)
{
int num;
int k =9;
int nm;

System.out.println("please print out this page");


try (Scanner keyboard = new Scanner(System.in)) {
    System.out.print("please print enter number ");
    num =keyboard.nextInt();
    System.out.print("please print enter number");
    nm =keyboard.nextInt();
}

int d = num+k;
int f =d*nm;
System.out.println("values:"+ d);
System.out.println("values:"+ f);


}

}
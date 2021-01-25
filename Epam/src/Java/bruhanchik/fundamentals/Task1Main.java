package java.Fundamentals;

import java.util.Scanner;

public class Task1Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input numbers: ");
        String number=in.nextLine();
        String longNumber="";
        String shortNumber=number;
        for (String s: number.split(" ")) {
        if(s.length()>longNumber.length()){longNumber=s;}
            if(s.length()<shortNumber.length()){shortNumber=s;}

        }
        System.out.println("Long number: "+ longNumber);
        System.out.println("Length: "+longNumber.length());
        System.out.println("Short number: "+shortNumber);
        System.out.println("Length: "+shortNumber.length());
        in.close();
    }

}

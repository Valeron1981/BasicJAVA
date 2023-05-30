package Homework;

import java.util.Scanner;

public class ScannerHomework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=777;

        int Decimal = 7*100+7*10+7*1;
        System.out.println(Decimal);

        System.out.println(Integer.toBinaryString(a));

        System.out.println(Integer.toHexString(a));

        System.out.println(Integer.toOctalString(a));

        System.out.print("Enter aDecimal: ");
        int aDecimal= sc.nextInt();

        System.out.print("Enter aBinary: ");
        int aBinary= sc.nextInt();

        System.out.print("Enter aHex: ");
        int aHex= sc.nextInt();

        System.out.print("Enter aOctal: ");
        int aOctal= sc.nextInt();

        System.out.println("My numbers ist " +aDecimal+"."+aBinary+"."+aHex+"."+aOctal);



        sc.close();





    }





}

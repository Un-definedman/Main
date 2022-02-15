

import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
  double a;
  a=sc.nextDouble();
Locale indiaLocale = new Locale("en", "in");
  NumberFormat b=NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat c=NumberFormat.getCurrencyInstance(indiaLocale);
    NumberFormat d=NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat e=NumberFormat.getCurrencyInstance(Locale.FRANCE);
  System.out.println("US: "+b.format(a));
   System.out.println("India: "+c.format(a));
    System.out.println("China: "+d.format(a));
     System.out.println("France: "+e.format(a));
    }
}


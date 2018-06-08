/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import java.util.*;
/**
 *1
 * @author adityachandra
 */

public class Main {
    public static void main(String[] args) {
        Ebill e = new ConcreteEbill();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Your Plan:\n1.Plan-A\n2.Plan-B");
        int s=sc.nextInt();
        System.out.println("Enter number of units consumed");
        int units=sc.nextInt();
        Plans p=e.planFactory(s);
        System.out.println("Your bill is : $"+p.calculate(units));
    }
}

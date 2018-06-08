/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;
import java.util.*;
/**
 *
 * @author adityachandra
 */
public class Main {
    public static void main (String[] args) {
        Customer cus;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        double p=sc.nextDouble();
        System.out.println("Customer type \n1.First time\n2.Regular");
        boolean b =true;int c;
        while(b){
            c=sc.nextInt();
            switch(c) {
                case 1:
                    cus = new Firstcus();
                    cus.setDiscount(new DiscountType2());
                    cus.display();
                    cus.bill(p);
                    break;
                case 2:
                    cus = new Regcus();
                    cus.setDiscount(new DiscountType1());
                    cus.display();
                    cus.bill(p);
                    break;
                default:
                    b=false;
                    break;
            }
        }
        
    }
}

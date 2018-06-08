/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author adityachandra
 */
public class Main {
    public static void main (String [] args ) {
        Beverage b = new Latte();
        System.out.println(b.getBeverage() + "$" + b.getCost());
        Beverage b1 = new Latte();
        b1=new Cream(b1);
        System.out.println(b1.getBeverage() + "$" + b1.getCost());
    }
}
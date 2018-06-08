/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author adityachandra
 */
public abstract class Customer {
    Discount d;
    public void setDiscount(Discount d) {
        this.d=d;
    }
    public void bill(double price){
        double b=price -price*d.getDiscount();
        System.out.println("Your Bill is $"+b);
    }
    public abstract void display();
}

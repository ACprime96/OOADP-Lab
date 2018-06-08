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
public class DiscountType1 implements Discount{
    @Override
    public double getDiscount(){
        System.out.println("Regular customer discount : 20% ");
        return 0.2;
    }
}
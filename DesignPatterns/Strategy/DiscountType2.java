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
public class DiscountType2 implements Discount{
    @Override
    public double getDiscount(){
        System.out.println("First time customer discount : 30% ");
        return 0.3;
    }
}

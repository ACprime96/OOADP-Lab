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
public class Cream extends Condidec {
    Beverage b;
    public Cream(Beverage b){
        this.b=b;
    }
    @Override
    public String getBeverage() {
        return b.getBeverage() + ",Cream";
    }
    @Override
    public double getCost() {
        return 0.75 + b.getCost() ;
    }
}

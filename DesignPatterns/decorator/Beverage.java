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
public abstract class Beverage {
    String description;
    public String getBeverage() {
        return description;
    }
    public abstract double getCost();
}

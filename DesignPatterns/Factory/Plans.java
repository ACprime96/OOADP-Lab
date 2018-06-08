/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author adityachandra
 */
public abstract class Plans {
    double rate;
    public double calculate(int unit) {
        return(unit*rate);
    }
}

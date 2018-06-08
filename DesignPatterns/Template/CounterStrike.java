/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author adityachandra
 */
public class CounterStrike extends Game {
    @Override
    public void initialize() {
        System.out.println("CStrike1.6 Loading.......");
    }
    @Override
    public void startPlay() {
        System.out.println("Started");
    }
    @Override
    public void endPlay() {
        System.out.println("Ended");
    }
}

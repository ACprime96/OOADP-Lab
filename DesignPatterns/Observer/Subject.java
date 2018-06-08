/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author adityachandra
 */
public interface Subject {
    public void registerOb(Observer o);
    public void removeOb(Observer o);
    public void notifyAllOb();
}


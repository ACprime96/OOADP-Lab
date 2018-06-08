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
public class ConcreteObserver implements Observer {
    public void updateOb(Result r) {
        System.out.println("New Update!!");
        showResults(r);
    }
    public void showResults(Result r) {
        System.out.println("Student Name :"+r.name+"\nSemester :"+r.sem+"\nSGPA :"+r.sgpa);
    }
}

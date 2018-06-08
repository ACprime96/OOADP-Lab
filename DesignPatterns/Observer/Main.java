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
public class Main {
    public static void main(String[] args)  {
        ConcreteSub s=new ConcreteSub();
        ConcreteObserver o1=new ConcreteObserver();
        ConcreteObserver o2=new ConcreteObserver();
        ConcreteObserver o3=new ConcreteObserver();
        s.registerOb(o1);s.registerOb(o2);s.registerOb(o3);
        System.out.println("1st Update!!");
        s.changeDetails("AC", 5, 9.28);
        s.removeOb(o3);
        System.out.println("2nd Update!!");
        s.changeDetails("BC", 4, 7.28);
        s.removeOb(o2);
        System.out.println("3rd Update!!");
        s.registerOb(o3);
        s.changeDetails("CC", 1, 9.52);
    }
}

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
//Concrete creator
public class ConcreteEbill extends Ebill {
    @Override
    public Plans planFactory(int c) {
        switch (c) {
            case 1:
                return new PlanA();
            case 2:
                return new PlanB();
            default:
                System.out.println("Error");
                return null;
        }
    }
    
}

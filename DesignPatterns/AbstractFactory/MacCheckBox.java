/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author adityachandra
 */
public class MacCheckBox implements CheckBox{
    @Override
    public void paint(){
        System.out.println("Mac CheckBox");
    }
}
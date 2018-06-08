/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author adityachandra
 */
public class NonVegRes implements Hotel {
    @Override
    public Menus getMenus(){
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}

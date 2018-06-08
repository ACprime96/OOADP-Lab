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
public class VegRes implements Hotel{
    @Override
    public Menus getMenus(){
        VegMenu v =new VegMenu();
        return v;
    }
}

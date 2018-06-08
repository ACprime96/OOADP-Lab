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
//FACADE
public class HotelKeeper {
     public VegMenu getVegMenu()
    {
        VegRes v = new VegRes();
        VegMenu vegMenu = (VegMenu)v.getMenus();
        return vegMenu;
    }
     
    public NonVegMenu getNonVegMenu()
    {
        NonVegRes v = new NonVegRes();
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus();
        return NonvegMenu;
    }
}

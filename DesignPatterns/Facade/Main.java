/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;
import java.util.*;
/**
 *
 * @author adityachandra
 */
public class Main {
    public static void main(String [] args) {
        System.out.println("Enter Restaurant\n");
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        switch (s) {
            case "Veg":
                {
                    HotelKeeper h = new HotelKeeper();
                    h.getVegMenu().display();
                    break;
                }
            case "NonVeg":
                {
                    HotelKeeper h = new HotelKeeper();
                    h.getNonVegMenu().display();
                    break;
                }
            default:
                System.out.println("ERROR");
                break;
        }
    }
}

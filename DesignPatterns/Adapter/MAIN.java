/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author adityachandra
 */
public class MAIN {
    public static void main(String[] args) {
        Shape s= new Square();
        Shape s1= new Circle();
        s.draw();
        s1.draw();
    }
}

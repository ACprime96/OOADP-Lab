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
//ADAPTER
public class Circle extends Shape {
    MyCircle c= new MyCircle();
    @Override
    public void draw() {
        c.drawCircle("Circle");
    }
}

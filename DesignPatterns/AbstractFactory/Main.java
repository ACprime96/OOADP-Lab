/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;
import java.util.*;
/**
 *
 * @author adityachandra
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Select your OS \n1.Windows\n2.Mac");
        Scanner sc =  new Scanner(System.in);
        int c;boolean b=true;
        GuiFactory factory;App app;
        while(b) {
            c= sc.nextInt();
            switch(c){
                case 1:
                    factory = new WindowsFactory();
                    app = new App(factory);
                    app.paint();
                    break;
                case 2:
                    factory = new MacFactory();
                    app = new App(factory);
                    app.paint();
                    break;
                default:
                    System.out.println("Exit..");
                    b=false;
                    break;
            }
        }
    }
}

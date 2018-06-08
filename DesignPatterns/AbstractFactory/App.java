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
public class App {
    Button button;CheckBox checkbox;
    public App(GuiFactory factory) {
        button=factory.createButton();
        checkbox=factory.createCheckBox();
    }
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

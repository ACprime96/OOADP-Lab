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
public class WindowsFactory implements GuiFactory {
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
    @Override
    public CheckBox createCheckBox(){
        return new WindowsCheckBox();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.*;
/**
 *
 * @author adityachandra
 */
public class ConcreteSub implements Subject{
    public ArrayList<Observer> ob=new ArrayList<>();
    Result r;
    @Override
    public void registerOb(Observer o) {
        ob.add(o);
    }
    @Override
    public void removeOb(Observer o) {
        int i=ob.indexOf(o);
        ob.remove(i);
    }
    @Override
    public void notifyAllOb() {
        for(int i=0;i<ob.size();i++) {
            Observer o = (Observer)ob.get(i);
            o.updateOb(r);
        }
    }
    public void changeDetails(String s,int se,double sg) {
        r = new Result(s,se,sg);
        notifyAllOb();
    }
}

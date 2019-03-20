/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runMvc;

/**
 *
 * @author Acer
 */
public class Model extends java.util.Observable {

    private int counter;

    public Model() {
        System.out.println("MODEL()");

    }

    public void setValue(int value) {
        this.counter = value;
        System.out.println("Model init: counter = " + counter);
        setChanged();
        notifyObservers(counter);
    }
    
    public void incrementValue(){
        ++counter;
        System.out.println("Model : counter = " + counter);
        setChanged();
        notifyObservers(counter);
    }
}

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
class Controller implements java.awt.event.ActionListener{
    
    Model model;
    View view;
    
    Controller(){
        System.out.println("Controller()");
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e){
        System.out.println("Controller: The " + e.getActionCommand() 
                + " button is Clicked at " + new java.util.Date(e.getWhen())
                + " with e.paramString " + e.paramString());
        System.out.println("Controller: acting on Model");
        model.incrementValue();
    }
    
    public void addModel(Model m){
        System.out.println("Controller: adding model");
        this.model = m;
    }
    
    public void addView(View x){
        System.out.println("Controller: adding view");
        this.view = x;
    }
    
    public void initModel(int x){
        model.setValue(x);
    }
    
}

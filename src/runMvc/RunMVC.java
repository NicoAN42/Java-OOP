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
public class RunMVC {
    private int start_value = 10;
    
    public RunMVC(){
        
        Model myModel = new Model();
        View myView = new View();
        
        myModel.addObserver(myView);
        
        Controller myController = new Controller();
        myController.addModel(myModel);
        myController.addView(myView);
        myController.initModel(start_value);
        
        myView.addController(myController);
    }
}

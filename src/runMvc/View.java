/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runMvc;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.Integer;
import java.util.Observable;

/**
 *
 * @author Acer
 */
public class View implements java.util.Observer{
    private TextField myTextField;
    private Button button;
    
    
    View(){
        System.out.println("View()");
        Frame frame = new Frame("Simple MVC");
        frame.add("North", new Label("counter"));
        
        myTextField = new TextField();
        frame.add("Center", myTextField);
        
        Panel panel = new Panel();
        button = new Button("Press Me");
        panel.add(button);
        frame.add("South", panel);
        
        frame.addWindowListener(new CloseListener());
        frame.setSize(400,200);
        frame.setLocation(100,100);
        frame.setVisible(true);
        
    }
    
    public void update(Observable obs, Object obj){
      myTextField.setText("" + ((Integer)obj).intValue());
    }
    
    public void setValue(int x){
        myTextField.setText("" + x);
    }
    
    public void addController(ActionListener  controller){
        System.out.println("View : adding Controller");
        button.addActionListener(controller);
    }
    
    public static class CloseListener extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            e.getWindow().setVisible(false);
            System.exit(0);
        }
    }
    
}

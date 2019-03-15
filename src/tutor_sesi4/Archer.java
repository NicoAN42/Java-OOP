/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor_sesi4;

/**
 *
 * @author Acer
 */
public class Archer extends Character{

    public Archer() {
        super(800,75);
    }

    @Override
    public void skill() {
       System.out.println("Ini Skill Archer"); //To change body of generated methods, choose Tools | Templates.
       dmg += 10;
    }
    
    
    
}

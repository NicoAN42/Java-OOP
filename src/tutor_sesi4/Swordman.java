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
public class Swordman extends Character{

    public Swordman() {
        super(1000, 50);
    }

    @Override
    public void skill() {
        System.out.println("Ini Skill Swordman"); //To change body of generated methods, choose Tools | Templates.
        hp += 50;
    }
    
    
}

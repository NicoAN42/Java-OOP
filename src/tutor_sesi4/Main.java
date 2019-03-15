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
public class Main {

    public Main() {
        Character a = new Character();
        Swordman b = new Swordman();
        Character c = new Swordman();
        c = new Archer();
        
        a.skill();
        b.skill();
        System.out.println(b.toString());
        c.skill();
        System.out.println(c.toString());
        
        
    }
    
    
    public static void main(String[] args){
        new Main();
    }
}

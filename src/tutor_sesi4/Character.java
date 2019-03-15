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
public class Character {

    protected int hp;
    protected int dmg;

    public Character() {
        hp = 0;
        dmg = 0;
    }

    public Character(int hp, int dmg) {
        this.hp = hp;
        this.dmg = dmg;
    }

    public void attack(Character enemy) {
        if (this.dmg > enemy.hp) {
            enemy.hp = 0;
        } else {
            enemy.hp -= this.dmg;
        }
    }

    @Override
    public String toString() {
        return "Character{" + "hp=" + hp + ", dmg=" + dmg + '}';
    }
    
    public void skill(){
        System.out.println("Character Skill");
    }
    
}

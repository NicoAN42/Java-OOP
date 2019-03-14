/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

/**
 *
 * @author Acer
 */
public class Pokemon {
    
    //static method
    public static int showTotalPokemon(){
       return totalPokemon;
//        System.out.println();
    }
    
    //static attribute
    public static int totalPokemon = 0;
    
    //atribute
    private String nama;
    private String elemen;
    public int level;
    private int att,def,spd;
    
    //constructor
    
    public void levelUp(){
        level += 1;
        att += 10;
        def += 9;
        spd += 5;
    }
    
    public Pokemon(String nama, String elemen, int att, int def, int spd) {
        this.nama = nama;
        this.elemen = elemen;
        this.level = 1;
        this.att = att;
        this.def = def;
        this.spd = spd;
        totalPokemon++;
    }

    public Pokemon() {
        totalPokemon++;
         //To change body of generated methods, choose Tools | Templates.
    }
    
    //method
    void doAttack(){
        
    }
    
    public void run(){
        System.out.println(nama+ " Go Away Safety ! ");
    }
    
    //setter / getter
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    public String getElemen() {
        return elemen;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAtt() {
        return att;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nama=" + nama + ", elemen=" + elemen + ", level=" + level + ", att=" + att + ", def=" + def + ", spd=" + spd + '}';
    }
   
 
    
}

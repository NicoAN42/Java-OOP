/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_simple;

import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Bank {

    private Vector<Nasabah>tNasabah = new Vector();

    public Vector<Nasabah> gettNasabah() {
        return tNasabah;
    }
    
    
    public Bank() {
        
    }
    
    
    
    public static void main(String[] args){
     Bank bca = new Bank();
     Nasabah nico = new Nasabah("Nico","2201827780", new Date(14,2,2000));
     bca.gettNasabah().add(nico);
     Tabungan t = new Tabungan();
     t.setNoRek("12345");
     t.setSaldo(0);
     t.setor(750000);
     t.tarik(50000);
     nico.gettLayanan().add(t);
     
     Deposito d = new Deposito(6, new Date(15,3,2019));
     d.setor(500000);
     
//     System.out.println(d);
    }
}

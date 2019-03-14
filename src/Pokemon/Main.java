/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemon;

import java.util.Vector;

/**
 *
 * @author Acer
 */
public class Main {

    public static void main(String[] args) {
        Vector<Pokemon> listPokemon = new Vector<>();
//        charmander = new Pokemon("Charmander", "Fire", 13, 8, 10);
//        charmander.setNama("Charmander");
//        charmander.setLevel(0);
//        
        System.out.println("Total Pokemon = " + Pokemon.showTotalPokemon());

        Pokemon charmander;
        charmander = new Pokemon("Charmander", "Fire", 13, 8, 10);
        System.out.println("Total Pokemon = " + Pokemon.showTotalPokemon());

        Pokemon pikachu;
        pikachu = new Pokemon("Pikachu", "Electric", 12, 10, 10);
        System.out.println("Total Pokemon = " + Pokemon.showTotalPokemon());

        System.out.println("Elemen Pikachu = " + pikachu.getElemen());
        System.out.println("Elemen Charmander = " + charmander.getElemen());

        Pokemon bulbasaur;
        bulbasaur = new Pokemon("Bulbasaur", "Grass", 9, 14, 10);
        Pokemon squirtle;
        squirtle = new Pokemon("Squirtle", "Water", 12, 9, 14);

//        charmander.setNama("Charmander");
        System.out.println(charmander.toString());

        charmander.run();

        //add vector
        listPokemon.add(charmander);
        listPokemon.add(pikachu);
        listPokemon.add(bulbasaur);
        listPokemon.add(squirtle);

        for (Pokemon pokemon : listPokemon) {
            System.out.println(pokemon.toString());
        }
        //delete vector

        listPokemon.remove(charmander);

        //update
        listPokemon.set(2, new Pokemon("Rayquaza", "Flying", 255, 255, 255));
        listPokemon.get(0).levelUp();

        //view all
        System.out.println("Total Pokemon = " + listPokemon.size());
//        for(int i = 0 ; i < listPokemon.size(); i++){
//            System.out.println(listPokemon.get(i));
//        }
//        
        for (Pokemon pokemon : listPokemon) {
            System.out.println(pokemon.toString());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslab_week3;

import java.util.Random;

/**
 *
 * @author Acer
 */
public class Main {

    Random rand = new Random();

    int randomNumber(int max, int min) {
        return rand.nextInt(max - min + 1) + min;
    }

    //constructor
    public Main() {
        Integer a = 0;
        String kata = 101 + "";
        int c = Integer.parseInt(kata);

        //Math
//        //1-10
//        for(int i = 0; i < 7; i++){
//            int max = 100;
//            int min = 50;
//           int random = (int)(Math.random()*(max-min+1)+min);
//            int random = randomNumber();
//             System.out.println(random);
//        }
//        
        //ST[0-9][0-9][0-9]
        String code = "ST" + randomNumber(9, 0) + randomNumber(9, 0) + randomNumber(9, 0);
        System.out.println(code);

    }

    public static void main(String[] args) {

        new Main();
    }
}

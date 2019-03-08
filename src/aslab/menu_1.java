/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslab;

/**
 *
 * @author Acer
 */

import java.util.*;

import javax.swing.JOptionPane;

public class menu_1 {
    
       
	Scanner input = new Scanner(System.in);
	int pilih;
        int age;
        String name, nim;
        int[] arrNum = new int[100];
        String[] arrString = new String[100];
//        Vector<String> vString = new Vector<String>();
        Vector<String> vName = new Vector<String>();
        Vector<String> vNim = new Vector<String>();
        Vector<Integer> vAge = new Vector<Integer>();
//        ArrayList<String> aString = new ArrayList<String>();
//        ArrayList<String> aName = new ArrayList<String>();
//        ArrayList<String> aNim = new ArrayList<String>();
//        ArrayList<Integer> aAge = new ArrayList<Integer>();
        
        
        
	public menu_1() {
            
            do{
                System.out.println("My First Program");
		System.out.println("=================");
		System.out.println("1. Input Data");
		System.out.println("2. View Data");
		System.out.println("3. Selection");
		System.out.println("4. Exit");
   

		boolean valid = true;
		do { 
			valid = true;
			try{       
				System.out.println("Choose : ");
				pilih = input.nextInt();
				
				
	        }catch(Exception e){
//	        	e.printStackTrace();
	        	valid= false;
//	        	JOptionPane.showMessageDialog(null, "Input Salah");
	        }input.nextLine();
		}while(!valid || pilih < 1 || pilih > 4);
                
                switch(pilih){
                    case 1:{
                        boolean validNama = true;
                        do{
                        System.out.printf("Input Name [3-15 char] : ");
                        name  = input.nextLine();
                         validNama = true;
                         for(int i = 0; i< name.length(); i++){
                            if(!Character.isAlphabetic(name.charAt(i))){
                                validNama = false;
                                break;
                            }
                        }
                        }while(name.length() < 3 || name.length() > 15 || !validNama);
                        
                        boolean validNim = true;
                        do{
                        System.out.printf("Input Nim [10 char Include Numeric Only] : ");
                        nim = input.nextLine();
                        validNim = true;
                        for(int i = 0; i< nim.length(); i++){
                            if(!Character.isDigit(nim.charAt(i))){
                                validNim = false;
                                break;
                            }
                        }
                        
                        }while(nim.length() != 10 || !validNim);
                       
                        do{
                        System.out.printf("Input Age [>= 18] : ");
                        age = input.nextInt();
                        }while(age < 18);
                        
                        vName.add(name);
                        vNim.add(nim);
                        vAge.add(age);
//                        aName.add(name);
//                        aNim.add(nim);
//                        aAge.add(age);
                        
                        
                       
//                        input.nextLine();
                        System.out.println("Press Any Key to Menu");
                        break;
                    }
                    case 2:{
                        for(int i = 0; i < vName.size(); i++){
                            System.out.printf("%d. %-15s %-10s %-2d\n", 
                            i+1,vName.get(i),vNim.get(i),vAge.get(i));
                        }
//                        System.out.println("Loop Data 3x");
//                        for(int i  = 0; i < 3;i++){
//                            System.out.println(name +" "+ nim +" "+ age);
//                        }
//                        System.out.println(" ");
//                        String s = "";
//                        while(!s.equals("STOP")){
//                            System.out.println("Type \"Stop\" to Next");
//                            s = input.nextLine();
//                            s = s.toUpperCase();
//                        }
//                        while(!s.equalsIgnoreCase("GO")){
//                            System.out.println("Type Words with \"Go\" to Back Menu");
//                            s = input.nextLine();
//                            s = s.toUpperCase();
//                        }
//                        
//                        System.out.println("Press Any Key to Menu");
                        break;
                    }
                    case 3:{
                          int dec =0;
                          int idx;
                          System.out.print("Input [Del => 1][Update => 2] : ");
                          dec = input.nextInt();
                          if(dec == 1){
                            System.out.print("Input Index to Delete : ");
                            idx = input.nextInt();
//                            idx = input.nextInt()-1;
                            vName.remove(idx);
                            vNim.remove(idx);
                            vAge.remove(idx);
//                            aName.remove(idx);
//                            aNim.remove(idx);
//                            aAge.remove(idx);
                            
                          }else if(dec == 2){
                            System.out.print("Input Index to Update : ");
                            idx = input.nextInt();
                            input.nextLine();
                            boolean validNama = true;
                            do{
                            System.out.printf("Input Name [3-15 char] : ");
                            name  = input.nextLine();

                             validNama = true;
                             for(int i = 0; i< name.length(); i++){
                                if(!Character.isAlphabetic(name.charAt(i))){
                                    validNama = false;
                                    break;
                                }
                            }
                            }while(name.length() < 3 || name.length() > 15 || !validNama);

                            boolean validNim = true;
                            do{
                            System.out.printf("Input Nim [10 char Include Numeric Only] : ");
                            nim = input.nextLine();
                            validNim = true;
                            for(int i = 0; i< nim.length(); i++){
                                if(!Character.isDigit(nim.charAt(i))){
                                    validNim = false;
                                    break;
                                }
                            }

                            }while(nim.length() != 10 || !validNim);

                            do{
                            System.out.printf("Input Age [>= 18] : ");
                            age = input.nextInt();
                            }while(age < 18);
    //                        input.nextLine();
                            System.out.println("Press Any Key to Menu");

                            vName.set(idx, name);
                            vNim.set(idx, nim);
                            vAge.set(idx, age);
//                            aName.set(idx, name);
//                            aNim.set(idx, nim);
//                            aAge.set(idx, age);
                            
                              
                        }
//                        int decision = 0;
//                        if(decision == 1){
//                            System.out.println("Decision 1");
//                        }else if(decision == 2){
//                            System.out.println("Decision 2");
//                        }else{
//                            System.out.println("Decision 3");
//                        }
                        break;
                    }
                }
                input.nextLine();
            }while(pilih != 4);
	} public static void main(String[] args) {
		new menu_1();
                
        }
}
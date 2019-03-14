/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslab_menu;

import java.util.Scanner;
import java.util.Vector;

import aslab_menu.Restaurant;
/**
 *
 * @author Acer
 */
public class Main {

//    Restaurant a=new Restaurant();
   
    Vector<Food> vFood = new Vector();
    Scanner scan = new Scanner(System.in);

    String name;
    Integer price;
    Integer stock;
    Float calorie;
    String desc;
    Integer spicyLevel;
    Float rating;
    String takeAway;
    Boolean isTakeAway;

    void clr() {
        for (int i = 0; i < 25; i++) {
            System.out.println();
        }
    }

    void menu() {
        System.out.println("Halilintar Food Hall");
        System.out.println("========================");
        System.out.println("1. Add Food");
        System.out.println("2. View Food");
        System.out.println("3. Update Food");
        System.out.println("4. Delete Food");
        System.out.println("5. Exit");
    }

    void view() {
        if (vFood.size() <= 0) {
            System.out.println("No Food Data Yet.");
        } else {
            for (int i = 0; i < vFood.size(); i++) {
                System.out.println("No.         " + (i + 1));
                System.out.println("Name        " + vFood.get(i).getName());
                System.out.println("Price       " + vFood.get(i).getPrice());
                System.out.println("Stock       " + vFood.get(i).getStock());
                System.out.println("Description " + vFood.get(i).getDesc());
                System.out.println("Calorie     " + vFood.get(i).getCalorie());
                System.out.println("Rating      " + vFood.get(i).getRating());
                System.out.println("Spicy Level " + vFood.get(i).getSpicyLevel());
                System.out.println("Take Away   " + vFood.get(i).getIsTakeAway());
            }
        }
    }

    void delete() {
        int index;

        if (vFood.size() <= 0) {
            System.out.println("No Food Data Yet.");
        } else {
            view();
            do {
                System.out.println("Choose Food to Delete No. to Delete[ 1-" + vFood.size() + " ]: ");
                index = scan.nextInt();
            } while (index < 1 || index > vFood.size());
            vFood.remove(index - 1);
            System.out.println("Delete Success.");
        }
    }

    void update() {
        int index;
        Food food = new Food();
        if (vFood.size() <= 0) {
            System.out.println("No Food Data Yet.");
        } else {
            view();
            do {
                System.out.println("Choose Food to Update No. to Update[ 1-" + vFood.size() + " ]: ");
                index = scan.nextInt();
            } while (index < 1 || index > vFood.size());
            scan.nextLine();
            do {
                System.out.println("Input Food Name[3..15 Char]: ");
                name = scan.nextLine();
                vFood.get(index - 1).setName(name);
            } while (name.length() < 3 || name.length() > 15);

            do {
                System.out.println("Input Food Price[50000..150000]: ");
                price = scan.nextInt();
                vFood.get(index - 1).setPrice(price);

            } while (price < 50000 || price > 150000);

            do {
                System.out.println("Input Food Stock[10..50]: ");
                stock = scan.nextInt();
                vFood.get(index - 1).setStock(stock);
            } while (stock < 10 || stock > 50);

            do {
                System.out.println("Input Food Calorie[100..500]: ");
                calorie = scan.nextFloat();
                vFood.get(index - 1).setCalorie(calorie);
            } while (calorie < 100 || calorie > 500);
            scan.nextLine();
            do {
                System.out.println("Input Food Description[<100 Char]: ");
                desc = scan.nextLine();
                vFood.get(index - 1).setDesc(desc);
            } while (desc.length() > 100);

            do {
                System.out.println("Input Food Spicy Level[1..5]: ");
                spicyLevel = scan.nextInt();
                vFood.get(index - 1).setSpicyLevel(spicyLevel);

            } while (spicyLevel < 1 || spicyLevel > 5);

            do {
                System.out.println("Input Food Rating[1.0-5.0]: ");
                rating = scan.nextFloat();
                vFood.get(index - 1).setRating(rating);
            } while (rating < 1 || rating > 5);
            scan.nextLine();
            do {
                System.out.println("Is Food Take Away ?[Yes or No]: ");
                takeAway = scan.nextLine();
            } while (!takeAway.equalsIgnoreCase("Yes") && !takeAway.equalsIgnoreCase("No"));
            if (takeAway.equalsIgnoreCase("Yes")) {
                isTakeAway = true;
            } else if (takeAway.equalsIgnoreCase("No")) {
                isTakeAway = false;
            }
            vFood.get(index - 1).setIsTakeAway(isTakeAway);

            System.out.println("Update Success.");
            scan.nextLine();
//            vFood.add(food);
        }
    }

    public Main() {
//        String b =("");
//        b = a.coba();
        int pick = 0;
        do {
//            System.out.println(b);
            clr();
            menu();
            do {
                System.out.print(">> ");
                pick = scan.nextInt();
            } while (pick < 1 || pick > 5);
            scan.nextLine();
            switch (pick) {
                case 1: {
                    Food food = new Food();
                    clr();
                    do {
                        System.out.println("Input Food Name[3..15 Char]: ");
                        name = scan.nextLine();
                        food.setName(name);
                    } while (name.length() < 3 || name.length() > 15);

                    do {
                        System.out.println("Input Food Price[50000..150000]: ");
                        price = scan.nextInt();
                        food.setPrice(price);
                    } while (price < 50000 || price > 150000);

                    do {
                        System.out.println("Input Food Stock[10..50]: ");
                        stock = scan.nextInt();
                        food.setStock(stock);
                    } while (stock < 10 || stock > 50);

                    do {
                        System.out.println("Input Food Calorie[100..500]: ");
                        calorie = scan.nextFloat();
                        food.setCalorie(calorie);
                    } while (calorie < 100 || calorie > 500);
                    scan.nextLine();
                    do {
                        System.out.println("Input Food Description[<100 Char]: ");
                        desc = scan.nextLine();
                        food.setDesc(desc);
                    } while (desc.length() > 100);

                    do {
                        System.out.println("Input Food Spicy Level[1..5]: ");
                        spicyLevel = scan.nextInt();
                        food.setSpicyLevel(spicyLevel);

                    } while (spicyLevel < 1 || spicyLevel > 5);

                    do {
                        System.out.println("Input Food Rating[1.0-5.0]: ");
                        rating = scan.nextFloat();
                        food.setRating(rating);
                    } while (rating < 1 || rating > 5);
                    scan.nextLine();
                    do {
                        System.out.println("Is Food Take Away ?[Yes or No]: ");
                        takeAway = scan.nextLine();
                    } while (!takeAway.equalsIgnoreCase("Yes") && !takeAway.equalsIgnoreCase("No"));
                    if (takeAway.equalsIgnoreCase("Yes")) {
                        isTakeAway = true;
                    } else if (takeAway.equalsIgnoreCase("No")) {
                        isTakeAway = false;
                    }

                    food.setIsTakeAway(isTakeAway);
                    System.out.println("Success Add New Food");
                    scan.nextLine();
                    vFood.add(food);

                    break;
                }
                case 2: {
                    clr();
                    view();

                    scan.nextLine();
                    break;
                }
                case 3: {
                    clr();
                    update();
                    scan.nextLine();
                    break;
                }
                case 4: {
                    clr();
                    delete();
                    scan.nextLine();
                    break;
                }
            }
        } while (pick != 5);
    }

    public static void main(String[] args) {
        new Main();
    }

}

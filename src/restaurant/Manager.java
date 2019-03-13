/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Manager {

    private static String shopName;
    private String name, username, password;
    private static double minimumAmount = 0;
    private static Scanner input;
    private static ArrayList<Manager> managers = new ArrayList<>();

    public Manager() {
        this("", "", "");
    }

    public Manager(String username, String password) {
        this("", username, password);
    }

    public Manager(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public static String getShopName() {
        return shopName;
    }

    public static void setShopName(String shopName) {
        Manager.shopName = shopName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
public static double getMinimumAmount() {
        return minimumAmount;
    }

    public static void setMinimumAmount(double minimumAmount) {
        Manager.minimumAmount = minimumAmount;
    }

    public void createNewManager() {

        receiveCredentials(); 

        boolean isManagerExist = false;
        for (Manager manager : managers) {
            if (manager.name.equals(name)) {
                isManagerExist = true;
                System.out.println("\nManager Account Already Exists!\n");
                break;
            }
        } 
        if (!isManagerExist) {
            managers.add(this);
            System.out.println("New Manager Account Successfully Created.");

        } 
    }

    public void receiveCredentials() {
        
        input = new Scanner(System.in);
        System.out.println("\nCreate New Manager Account\n--------------------------");
        System.out.print("Enter manager name: ");
        name = input.nextLine();
        System.out.print("Enter new username: ");
        username = input.nextLine();
        System.out.print("Enter new password: ");
        String passwordFirstTyped = input.nextLine();
        System.out.print("Retype new password: ");
        String passwordRetyped = input.nextLine();
        while (!passwordFirstTyped.equals(passwordRetyped)) {
            System.out.println("Retyped password does not match! Try again.");
            System.out.print("Enter new password: ");
            passwordFirstTyped = input.nextLine();
            System.out.print("Retype new password: ");
            passwordRetyped = input.nextLine();
        }
        password = passwordFirstTyped;
    }

    public boolean isValidManager() {
        boolean isValid = false;
        for (Manager manager : managers) {
            if (manager.username.equals(username) && manager.password.equals(password)) {
                isValid = true;
            }
        }
        return isValid; 
        
    }
    
    public void editMenu() {
        String mealCode = "", mealName;
        double mealPrice;
        int choice = -1;

        mealCode = mealCodeInput(); 
        
        if (mealCode.equals("0")) {
            return; 
        }
        //Retrieve common mealIndex for the specified mealCode
        int mealIndex = Meal.getMealCodes().indexOf(mealCode);

        while (choice != 0) {
            Meal.displayMeal(mealCode);
            choice = -1;
            System.out.println("\nEDIT MENU\n---------");
            System.out.println("1.Edit Meal Code\n2.Edit Meal Name\n3.Edit Meal Price\n-----------------");
            while (!(choice >= 0 && choice <= 3)) {
                System.out.print("Enter menu option(0 to exit): ");
                String choiceS = input.nextLine();
                try {
                    choice = Integer.valueOf(choiceS);
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid input detected!");
                }
                if (!(choice >= 0 && choice <= 3)) {
                    System.out.println("Invalid choice entered! Try again.");
                }
            } 

            if (choice == 0) {
                return; 
            }
            if (choice == 1) {
                System.out.print("Enter new meal code: ");
                mealCode = input.nextLine();
                while (containsString(mealCode, Meal.getMealCodes()));
                {
                    System.out.println("Meal code entered already exist! Try again.");
                    System.out.print("Enter new meal code: ");
                    mealCode = input.nextLine();
                }
                Meal.getMealCodes().set(mealIndex, mealCode);
                mealName = Meal.getMealNames().get(mealIndex);
                mealPrice = Meal.getMealPrices().get(mealIndex);
                Meal.getMealNames().remove(mealIndex);
                Meal.getMealPrices().remove(mealIndex);
                Collections.sort(Meal.getMealCodes());
                mealIndex = Meal.getMealCodes().indexOf(mealCode);
                Meal.getMealNames().add(mealIndex, mealName);
                Meal.getMealPrices().add(mealIndex, mealPrice);
                System.out.println("Meal code successfully changed.");
            } else if (choice == 2) {
                System.out.print("Enter new meal name: ");
                mealName = input.nextLine();
                Meal.getMealNames().set(mealIndex, mealName);
                System.out.println("Meal name successfully changed.");
            } else if (choice == 3) {
                mealPrice = mealPriceInput();
                Meal.getMealPrices().set(mealIndex, mealPrice);
                System.out.println("Meal price successfully changed.");
            }
        }
    }

    public void addMenu() {
        String mealName, mealCode = "";
        double mealPrice = -1;
        int mealIndex;

        boolean isExist = true;
        while (isExist) {
            System.out.print("\nEnter new meal code(0 to exit): ");
            mealCode = input.nextLine();
            if (mealCode.equals("0")) {
                break;
            }
            isExist = containsString(mealCode, Meal.getMealCodes());
            if (isExist) {
                System.out.println("Meal code already exist");
            }
        } 

        if (mealCode.equals("0")) {
            return; 
        }
        System.out.print("Enter new meal name: ");
        mealName = input.nextLine();

        mealPrice = mealPriceInput();
        Meal.getMealCodes().add(mealCode);
        Collections.sort(Meal.getMealCodes());
        mealIndex = Meal.getMealCodes().indexOf(mealCode);
        Meal.getMealPrices().add(mealIndex, mealPrice);
        Meal.getMealNames().add(mealIndex, mealName);
        System.out.println("New menu successfully added.");
    }

    public void deleteMenu() {
        String mealCode;
        int mealIndex;

        mealCode = mealCodeInput(); 
        if (mealCode.equals("0")) {
            return;
        }

        Meal.displayMeal(mealCode);
        mealIndex = Meal.getMealCodes().indexOf(mealCode);
        Meal.getMealCodes().remove(mealIndex);
        Meal.getMealNames().remove(mealIndex);
        Meal.getMealPrices().remove(mealIndex);
        System.out.println("The given meal sucessfully removed!");
    }
//
//    public void setPromotion() {
//
//        double minimumAmount = -1;
//        double setDrinkPrice = -1;
//
//        while (!(minimumAmount >= 0 && setDrinkPrice >= 0)) {
//
//            System.out.print("Enter new minimum amount: RM");
//            String minimumAmountS = input.nextLine();
//            System.out.print("Enter new set drink price: RM");
//            String setDrinkPriceS = input.nextLine();
//            try {
//
//                minimumAmount = Double.valueOf(minimumAmountS);
//                setDrinkPrice = Double.valueOf(setDrinkPriceS);
//
//            } catch (NumberFormatException ex) {
//                System.out.println("Invalid input detected!");
//            }
//            if (!(minimumAmount >= 0 && setDrinkPrice >= 0)) {
//                System.out.println("Invalid input for discount rate/minimum amount/set drink price!");
//            }
//        } 
//        Manager.setMinimumAmount(minimumAmount);
//        Meal.setSetDrinkPrice(setDrinkPrice);
//        System.out.println("Discount rate, minimum amount and set drink price successfully changed.");
//    }

    public String mealCodeInput() {
        boolean isExist = false;
        String mealCode = "";
        while (!isExist) {
            System.out.print("\nEnter meal code(0 to exit): ");
            mealCode = input.nextLine();
            if (mealCode.equals("0")) {
                break;
            }
            isExist = containsString(mealCode, Meal.getMealCodes());
            if (!isExist) {
                System.out.println("The meal does not exist! Try again.");
            }
        } 
        return mealCode;
    }

    private boolean containsString(String testString, ArrayList<String> list) {
        return list.contains(testString);
    } 

    private double mealPriceInput() {
        double mealPrice = -1;
        while (!(mealPrice >= 0)) {
            System.out.print("Enter new meal price: RM");
            String mealPriceS = input.nextLine();
            try {
                mealPrice = Double.valueOf(mealPriceS);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input detected!");
            }
            if (!(mealPrice >= 0)) {
                System.out.println("Invalid meal price entered! Try again.");
            }
        }
        return mealPrice;
    }
}

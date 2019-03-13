/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.*;
import java.text.*;

/**
 *
 * @author Acer
 */
public class Order {

    private int noOfPax;
    private Date orderTakenTime;
    private ArrayList<Meal> meals = new ArrayList<>();
    private Scanner input;
    private static final int GST = 6;

    public Order() {
        this(0);
    }

    public Order(int noOfPax) {
        this.noOfPax = noOfPax;
        orderTakenTime = new Date();
    }

    public int getNoOfPax() {
        return noOfPax;
    }

    public void setNoOfPax(int noOfPax) {
        this.noOfPax = noOfPax;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public Date getOrderTakenTime() {
        return orderTakenTime;
    }

    public void setOrderTakenTime(Date orderTakenTime) {
        this.orderTakenTime = orderTakenTime;
    }

    public void addMeal(int tableNum) {
        input = new Scanner(System.in);
        String mealCode = "";
        char answer;

        while (!mealCode.equals("0")) {
            boolean isTakeAway = false;
            boolean codeExist = false;
            while (!codeExist) {
                System.out.print("\nEnter meal code(0 to exit): ");
                mealCode = input.nextLine();
                if (mealCode.equals("0")) {
                    break;
                }
                codeExist = Meal.getMealCodes().contains(mealCode);
                if (!codeExist) {
                    System.out.println("Meal code does not exist!");
                }
            } 

            if (mealCode.equals("0")) {
                continue; 
            }
            int indexOfMeal = Meal.getMealCodes().indexOf(mealCode); 
            System.out.println(Meal.getMealNames().get(indexOfMeal)); 

            answer = ' ';
            while (!(answer == 'N' || answer == 'Y')) {
                System.out.print("Is the meal take away?\nEnter 'Y' for yes and 'N' for no: ");
                String answerS = input.nextLine();
                if (answerS.length() >= 1) {
                    answer = Character.toUpperCase(answerS.charAt(0));
                }
                if (answer == 'Y') {
                    isTakeAway = true;
                }
                if (!(answer == 'N' || answer == 'Y')) {
                    System.out.println("Invalid input for whether the meal is take away!");
                }
            } 

            Meal meal;
            if (mealCode.contains("DR")) {
                meal = new OrderedDrink(mealCode, Meal.getMealNames().get(indexOfMeal), Meal.getMealPrices().get(indexOfMeal), isTakeAway);
                addDrinkInfo(meal);
            } else {
                meal = new OrderedFood(mealCode, Meal.getMealNames().get(indexOfMeal), Meal.getMealPrices().get(indexOfMeal), isTakeAway);
                addFoodInfo(meal, isTakeAway);
            }

            meals.add(meal); 
            Table.getTables().get(tableNum - 1).setStatus("OT");
            Table.getTables().get(tableNum - 1).setOrder(this);
            System.out.println("Meal is added to order>>");
        }
    }

    public void addDrinkInfo(Meal meal) {
        char drinkSize = ' ';
        char answer = ' ';
        boolean isDrinkHot = false;

        while (!(drinkSize == 'R' || drinkSize == 'L') || !(answer == 'N' || answer == 'Y')) {
           
            System.out.print("Is the drink hot?\nEnter 'Y' for yes and 'N' for no: ");
            String answerS = input.nextLine();
            if (answerS.length() >= 1) {
                answer = Character.toUpperCase(answerS.charAt(0));
            }
            if (answer == 'Y') {
                isDrinkHot = true;
            }
            System.out.print("Enter drink size('R'-Regular and 'L'-Large): ");
            String drinkSizeS = input.nextLine();
            if (drinkSizeS.length() >= 1) {
                drinkSize = Character.toUpperCase(drinkSizeS.charAt(0));
            }
            if (!(answer == 'N' || answer == 'Y')) {
                System.out.println("Invalid input for drink hotness!");
            }
            if (!(drinkSize == 'R' || drinkSize == 'L')) {
                System.out.println("Invalid input for drink size! Drink size is either 'R'-Regular or 'L'-Large");
            }
        } 

        ((OrderedDrink) meal).setIsDrinkHot(isDrinkHot);
        ((OrderedDrink) meal).setDrinkSize(drinkSize); 
    }

    public void addFoodInfo(Meal meal, boolean isTakeAway) {
        String drinkCode = "";
        char answer = ' ';

        while (!(answer == 'N' || answer == 'Y')) {
           System.out.print("Is the food with set drink?\nEnter 'Y' for yes and 'N' for no: ");
            String answerS = input.nextLine();
            if (answerS.length() >= 1) {
                answer = Character.toUpperCase(answerS.charAt(0));
            }
            if (!(answer == 'N' || answer == 'Y')) {
                System.out.println("Invalid input for whether the food is with set drink!");
            }
        }
        if (answer == 'Y') { 
            boolean codeExist = false;

            while (!codeExist) {
                System.out.print("Enter drink code: ");
                drinkCode = input.nextLine();
                if (drinkCode.contains("DR")) {
                    codeExist = Meal.getMealCodes().contains(drinkCode);
                }
                if (!codeExist) {
                    System.out.println("Drink code does not exist!");
                }
            } 

            int indexOfDrink = Meal.getMealCodes().indexOf(drinkCode); 
            System.out.println(Meal.getMealNames().get(indexOfDrink));
            Meal drink = new OrderedDrink(drinkCode, Meal.getMealNames().get(indexOfDrink), Meal.getMealPrices().get(indexOfDrink), isTakeAway);
            addDrinkInfo(drink); 
            ((OrderedFood) meal).setSetDrink((OrderedDrink) drink); 
        }
    }

    public void displayOrder(int tableNum) {
        Order order = Table.getTables().get(tableNum - 1).getOrder();

        if (order != null) {
            System.out.print("\nNo. Meal Code Meal Name                Details                                                          Meal Status\n");
            System.out.println("--- --------- ------------------------ ---------------------------------------------------------------- -----------");
            int count = 1;
            for (Meal meal : order.getMeals()) {
                System.out.printf("%-4d%s", count, meal.toString());
                count++;
            }
        } 
        else {
            System.out.println("No meals ordered!");
        }
    }

    public void deleteOrder(int tableNum) {
        char answer = ' ';
        while (!(answer == 'Y' || answer == 'N')) {
            System.out.print("Are you sure you want to delete the whole order?\nEnter 'Y' for yes and 'N' for no: ");
            String answerS = input.nextLine();
            if (answerS.length() >= 1) {
                answer = Character.toUpperCase(answerS.charAt(0));
            }
            if (!(answer == 'Y' || answer == 'N')) {
                System.out.println("Invalid input detected! Try again.");
            }
        } 

        if (answer == 'Y') {
            Table.getTables().get(tableNum - 1).setOrder(null);
            Table.getTables().get(tableNum - 1).setStatus("NO");
            System.out.println("Order successfully deleted.");
        } 
    }

    public void changeTable(int tableNum) {
        int newTableNum = 0;
        String status = "NO";
        while (!(newTableNum >= 1 && newTableNum <= Table.getTotalTables()) || !status.equals("NO")) {
            System.out.print("Enter new table number: ");
            String tableNumS = input.nextLine();
            try {
                newTableNum = Integer.valueOf(tableNumS);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input detected!");
            }
            if (!(newTableNum >= 1 && newTableNum <= Table.getTotalTables())) {
                System.out.println("Invalid input for table number!");
            } else {
                status = Table.getTables().get(newTableNum - 1).getStatus();
            }
            if (!status.equals("NO")) {
                System.out.println("Table entered is already occupied!");
            }
        } 

        Table oldTable = Table.getTables().get(tableNum - 1);
        Table newTable = Table.getTables().get(newTableNum - 1);

        newTable.setOrder(oldTable.getOrder()); 
        newTable.setStatus(oldTable.getStatus()); 
        oldTable.setOrder(null); 
        oldTable.setStatus("NO"); 
        System.out.println("Table number changed successfully!");
    }

    public void printReceipt(int tableNum) {
        boolean haveDineIn = false;
        boolean haveTakeAway = false;
        double total = 0, subTotal = 0;
        double gst = 0;

        Order order = Table.getTables().get(tableNum - 1).getOrder();
        int totWidth = Manager.getShopName().length() + 33;
        System.out.println("\n*-*-*-*-*-*Welcome to " + Manager.getShopName() + "*-*-*-*-*-*");

        for (int i = 0; i < (totWidth - 11) / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("TAX INVOICE");

        for (int i = 0; i < totWidth; i++) {
            System.out.print("-");
        }
        SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy  hh:mm:ss a");
        System.out.println("\n" + ft.format(order.getOrderTakenTime()));
        System.out.println("\nTABLE NO: " + tableNum);
        for (int i = 0; i < totWidth; i++) {
            System.out.print("-");
        }
        System.out.println();

        ArrayList<Meal> takeAwayMeals = new ArrayList<>();
        ArrayList<Meal> dineInMeals = new ArrayList<>();

        for (Meal meal : meals) {
            subTotal += meal.mealPrice();
            if (meal.getIsTakeAway()) {
                haveTakeAway = true;
                takeAwayMeals.add(meal);
            } else {
                haveDineIn = true;
                dineInMeals.add(meal);
            }
        }
        if (haveDineIn) {
            for (int i = 0; i < (totWidth - 17) / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("*-*-*Dine In*-*-*");
            receiptMealDisplay(dineInMeals);
        }
        if (haveTakeAway) {
            System.out.println();
            for (int i = 0; i < (totWidth - 19) / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("*-*-*Take Away*-*-*");
            receiptMealDisplay(takeAwayMeals);
        }

        total = subTotal;
        gst = subTotal * GST / 100;
        total += gst;
        System.out.printf("\nSub Total(Rp):\t\t\t %5.2f\n", subTotal);
        System.out.printf("GST(6%%)(Rp):\t\t\t %5.2f\n", gst);
        System.out.printf("Total(Rp):\t\t\t %5.2f\n", total);

        String totalS = String.format("%.2f", total);
        char lastSen = totalS.charAt(totalS.length() - 1);
        double rounding = 0;
        if (lastSen == '1' || lastSen == '2' || lastSen == '6' || lastSen == '7') {
            if (lastSen == '2' || lastSen == '7') {
                rounding = -0.02;
            } else {
                rounding = -0.01;
            }
        } else if (lastSen == '3' || lastSen == '4' || lastSen == '8' || lastSen == '9') {
            if (lastSen == '3' || lastSen == '8') {
                rounding = 0.02;
            } else {
                rounding = 0.01;
            }
        }
        total += rounding;

        System.out.printf("Rounding(Rp):\t\t\t %5.2f\n", rounding);
        System.out.printf("Total(Rp):\t\t\t %5.2f\n", total);

        System.out.println("\nCLOSED: " + ft.format(new Date()));
        for (int i = 0; i < totWidth; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < (totWidth - 9) / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("Thank You");
        for (int i = 0; i < (totWidth - 17) / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("Please Come Again");

        Table.getTables().get(tableNum - 1).setStatus("NO");
    }

    public void receiptMealDisplay(ArrayList<Meal> meals) {
        String setIndicator = "";
        for (Meal meal : meals) {
            if (!meal.getMealCode().contains("DR")) {
                if (((OrderedFood) meal).getSetDrink() != null) {
                    setIndicator = "Set";
                } else {
                    setIndicator = "Ala";
                }
            } else {
                setIndicator = "";
            }
            System.out.printf("%s %s %-25s%5.2f\n", meal.getMealCode(), setIndicator, meal.getMealName(), meal.mealPrice());
        }
    }

    public static void displayTableOrders(ArrayList<Table> tables) {
        tables.clear();
        for (Table table : Table.getTables()) {
            if (table.getStatus() == "OT") {
                tables.add(table);
            }
        }
        if (tables.isEmpty()) {
            return;
        }

        Collections.sort(tables);
        System.out.println("\nAll Orders\n----------");
        for (Table table : tables) {
            System.out.print("\nTable Number: " + table.getTableNum());
            table.getOrder().displayOrder(table.getTableNum());
        }
    }

    public static void setOrderReady(Table chosenTable) {
        boolean isOrderReady = true;
        for (Meal meal : chosenTable.getOrder().getMeals()) {
            if (meal.getMealStatus().equals("Cooking")) {
                isOrderReady = false;
                break;
            }
        }
        if (isOrderReady) {
            chosenTable.setStatus("FR");
        }
    }

    public void setOrderServed(int tableNum) {
        char option = ' ';
        while (!(option == 'N' || option == 'Y')) {
            System.out.print("\nMeal Served?\nEnter 'Y' for yes and 'N' for no: ");
            String optionS = input.nextLine();
            if (optionS.length() >= 1) {
                option = Character.toUpperCase(optionS.charAt(0));
            }
            if (option == 'Y') {
                Table.getTables().get(tableNum - 1).setStatus("FS");
                ArrayList<Meal> meals = Table.getTables().get(tableNum - 1).getOrder().getMeals();
                for (Meal meal : meals) {
                    meal.setMealStatus("Served");
                }
                System.out.println("Meal served.");
            }
            if (!(option == 'N' || option == 'Y')) {
                System.out.println("Invalid input detected! Try again.");
            }
        }
    }
}

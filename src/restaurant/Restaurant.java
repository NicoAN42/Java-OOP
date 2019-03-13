/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package restaurant;
import java.util.*;

/**
 *
 * @author Acer
 */
public class Restaurant {
    private static Scanner input;

    public static void main(String[] args){
        input = new Scanner(System.in);
        System.out.println("---------Welcome to Ashyap---------\n");

        System.out.print("Enter Restaurant/Cafe Name: ");
        String shopName = input.nextLine();
        Manager.setShopName(shopName);

        Manager manager = new Manager();
        manager.createNewManager(); 

        Table.configTable(); 

        String username = "", password = "";
        while (true){
            boolean isValid = false;
            while (!isValid){
                System.out.println("\n" + Manager.getShopName() + " Login");
                for(int i=0; i<Manager.getShopName().length()+6; i++)
                    System.out.print("-");
                System.out.print("\nEnter username('0' to terminate system): ");
                username = input.nextLine();
                if (username.equals("0"))
                    break;
                System.out.print("Enter password: ");
                password = input.nextLine();

                manager = new Manager(username, password);
                isValid = manager.isValidManager();

                if (!isValid)
                    System.out.println("Username or Password is incorrect! Try again.\n");
            } 
            if (username.equals("0")){
                exitMenu();
                continue;
            }
            enterMenu(); 
        }
    }

    public static void enterMenu(){
        char access = ' ';
        while(access!='4'){
            printSystemAccess(); 

            while (!(access>='1' && access<='4')){
                System.out.print("Choose System Access: ");
                String systemAccess = input.nextLine();
                if (systemAccess.length() >= 1 && !(access>='1' && access<='4'))
                    access = systemAccess.charAt(0);
                if (!(access>='1' && access<='4'))
                    System.out.println("Invalid System Access! Try again.");
            } 

            enterFunctions(access); 

            if (access!='4')
                access = ' '; 
        }
        System.out.println(Manager.getShopName() + " Successfully Logged Out.");
    }

    public static void printSystemAccess(){
        System.out.println();
        System.out.println("1.Waiter");
        System.out.println("2.Cook");
        System.out.println("3.Manager");
        System.out.println("4.Log Out");
        System.out.println("---------------------"); 
    }

    public static void enterFunctions(char access){

        if (access=='1'){
            int tableNum = -1;

            while (tableNum != 0){
                System.out.println();
                ArrayList<Integer> options = new ArrayList<>();
                while(!(tableNum >= 0 && tableNum <= Table.getTotalTables())){
                    System.out.print("Enter table number(0 to exit): ");
                    String tableNumS = input.nextLine();
                    try {
                        tableNum = Integer.valueOf(tableNumS);
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Invalid input detected!");
                    }
                    if (!(tableNum >= 0 && tableNum <= Table.getTotalTables()))
                        System.out.println("Invalid input for table number!");
                }

                if (tableNum == 0)
                    break;

                String status = Table.getTables().get(tableNum-1).getStatus(); 

                if (status == "NO"){
                    int noOfPax = 0;
                    System.out.println("\nCreate New Order\n----------------");

                    while(!(noOfPax >= 1)){
                        System.out.print("Enter number of customer(s): ");
                        String noOfPaxS = input.nextLine();
                        try {
                            noOfPax = Integer.valueOf(noOfPaxS);
                        }
                        catch(NumberFormatException ex){
                            System.out.println("Invalid input detected!");
                        }
                        if (noOfPax < 1)
                            System.out.println("Invalid input for number of customers!");
                    } 

                    Order order = new Order(noOfPax); 
                    order.addMeal(tableNum); 
                }
                else if (status == "OT"){
                    options.clear();
                    for (int i=0; i<5; i++)
                        options.add(i);
                    System.out.println();
                    int option = menuEntry(options); 
                    enterFunctions(option, tableNum); 
                }
                else if (status == "FR"){
                    options.clear();
                    options.add(0);
                    options.add(2);
                    options.add(4);
                    options.add(5);
                    System.out.println();
                    int option = menuEntry(options); 
                    enterFunctions(option, tableNum); 
                }
                else if (status == "FS"){
                    options.clear();
                    options.add(0);
                    options.add(2);
                    options.add(4);
                    options.add(6);
                    System.out.println();
                    int option = menuEntry(options); 
                    enterFunctions(option, tableNum); 
                }

                tableNum = -1; 
            } 
        }

        else if(access=='2'){
            int tableNum = -1;
            boolean isExist;
            Table chosenTable = null;
            ArrayList<Table> tables = new ArrayList<>();

            while(tableNum != 0){
                tableNum = -1;
                Order.displayTableOrders(tables); 

                if (tables.isEmpty()){
                    System.out.println("No orders at the moment.");
                    break;
                }
                isExist = false;
                while(!(tableNum >= 0 && isExist)){
                    System.out.print("\nEnter table number(0 to exit): ");
                    String tableNumS = input.nextLine();
                    try {
                        tableNum = Integer.valueOf(tableNumS);
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Invalid input detected!");
                    }
                    if (tableNum == 0)
                        break;
                    for (Table table: tables){
                        if (table.getTableNum() == tableNum){
                            isExist = true;
                            chosenTable = table; 
                            break;
                        }
                    }
                    if (!(tableNum >= 0 && isExist))
                        System.out.println("Table number entered does not exist in order list!");
                } 
                
                if (tableNum == 0)
                    continue; 
                
                int numOfOrders = chosenTable.getOrder().getMeals().size();
                int orderNo = 0;
                while(!(orderNo >= 1 && orderNo <= numOfOrders)){
                    System.out.print("Enter which meal have been cooked: ");
                    String orderNoS = input.nextLine();
                    try{
                        orderNo = Integer.valueOf(orderNoS);
                    }
                    catch(NumberFormatException ex){
                        System.out.println("Invalid input detected!");
                    }
                    if (!(orderNo >= 1 && orderNo <= numOfOrders))
                        System.out.println("Order number entered is invalid! Try again.");
                }
                
                Meal chosenMeal = chosenTable.getOrder().getMeals().get(orderNo-1);
                boolean isMealCooking = chosenMeal.getMealStatus().equals("Cooking");
                if (isMealCooking)
                    chosenMeal.setMealStatus("Ready");
                else
                    System.out.println("The meal chosen is already cooked!");
                Order.setOrderReady(chosenTable); 
            }
        }

        else if (access=='3'){
            Manager manager = null;
            String username = "", password = "";

            while (!username.equals("0")){
                boolean isValid = false;
                while (!isValid){
                    System.out.println("\n" + Manager.getShopName() + " Manager Login");
                    for(int i=0; i<Manager.getShopName().length()+14; i++)
                        System.out.print("-");
                    System.out.print("\nEnter username('0' to exit): ");
                    username = input.nextLine();
                    if (username.equals("0"))
                        break;
                    System.out.print("Enter password: ");
                    password = input.nextLine();

                    manager = new Manager(username, password);
                    isValid = manager.isValidManager();

                    if (!isValid)
                        System.out.println("Username or Password is incorrect! Try again.\n");
                } 

                if (username.equals("0"))
                    continue; 

                char option = ' ';
                while (option != '0'){
                    displayManagerMenu(); 
                    option = ' ';
                    while (!(option >= '0' && option <= '8')){
                        System.out.print("Enter menu option(0 to exit): ");
                        String optionS = input.nextLine();
                        if (optionS.length() >= 1)
                            option = optionS.charAt(0);
                        if (!(option >= '0' && option <= '8'))
                            System.out.println("Invalid option! Try again.");
                    } 

                    if (option == '0')
                        continue; 
                    else if (option == '1')
                        manager.editMenu();
                    else if (option == '2')
                        manager.addMenu();
                    else if (option == '3')
                        manager.deleteMenu();
                }
            }
        }
    }

    public static int menuEntry(ArrayList<Integer> options){
        String[] orderFunctions = {"Display Order", "Delete Order", "Change Table", "Serve Meal", "Print Receipt"};
        int functionsNo = 1;
        for (int i=0; i<orderFunctions.length; i++){
            if (options.contains(i)){
                System.out.println(functionsNo + ". " + orderFunctions[i]);
                functionsNo++;
            }
        } 
        System.out.println("------------------");

        int option = 0;
        while (!(option >= 1 && option <= options.size())){
            System.out.print("Enter menu function: ");
            String optionS = input.nextLine();
            try{
                option = Integer.valueOf(optionS);
            }
            catch(NumberFormatException ex){
                System.out.println("Invalid input detected!");
            }
            if (!(option >= 1 && option <= options.size()))
                System.out.println("Invalid option! Try again.");
        } 

        option = options.get(option-1) + 1; 
        return option;
    }

    public static void enterFunctions(int option, int tableNum){
        Order order = Table.getTables().get(tableNum-1).getOrder();

        if (option == 1){
            order.displayOrder(tableNum);
            System.out.print("\nPress 'Enter' to continue...");
            input.nextLine();
        }
        else if (option == 2)
            order.deleteOrder(tableNum);
        else if (option == 3)
            order.changeTable(tableNum);
        else if (option == 4)
            order.setOrderServed(tableNum);
        else if (option == 5){
            order.printReceipt(tableNum);
            System.out.print("\nPress 'Enter' to continue...");
            input.nextLine();
        }
    }

    public static void displayManagerMenu(){
        System.out.println();
        System.out.println("1. Edit Meal Menu");
        System.out.println("2. Add Meal Menu");
        System.out.println("3. Delete Meal Menu");
        System.out.println("----------------------------------"); 
    }

    public static void exitMenu(){
        char option = ' ';
        System.out.println("Are you sure, you want to exit? All saved data will be lost!");
        while (!(option == 'N')){
            System.out.print("Enter 'Y' for \"Yes\" and 'N' for \"No\": ");
            String optionS = input.nextLine();
            if (optionS.length() >= 1)
                option = Character.toUpperCase(optionS.charAt(0));
            if (option == 'Y'){
                System.out.println(Manager.getShopName() + "'s Ashyaap Successfully Terminated.");
                System.exit(0);
            } 
            if (!(option == 'N'))
                System.out.println("Invalid input detected! Try again.");
        }
    }
}
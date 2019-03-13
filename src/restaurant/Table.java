/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author Acer
 */

import java.util.*;

public class Table implements Comparable<Table>{
    private final int tableNum;
    private String status;
    private Order order;
    private static int tablesPerRow;
    private static int totalTables;
    private static ArrayList<Table> tables = new ArrayList<>();
    private static Scanner input;

    public Table(int tableNum, String status) {
        this.tableNum = tableNum;
        this.status = status;
    }

    public int getTableNum() {
        return tableNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static int getTablesPerRow() {
        return tablesPerRow;
    }

    public static void setTablesPerRow(int tablesPerRow) {
        Table.tablesPerRow = tablesPerRow;
    }

    public static int getTotalTables() {
        return totalTables;
    }

    public static void setTotalTables(int totalTables) {
        Table.totalTables = totalTables;
    }

    public static ArrayList<Table> getTables() {
        return tables;
    }

    public static void setTables(ArrayList<Table> tables) {
        Table.tables = tables;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public static void configTable(){
        System.out.println("\nConfigure Table Settings\n------------------------");
        int numOfTables = 0;
        int numPerRow = 0;
        input = new Scanner(System.in);

        while(!(numOfTables>=1 && numOfTables<=99 && numPerRow<=numOfTables && numPerRow>=1)){
            System.out.print("Enter number of tables: ");
            String totTables = input.nextLine();
            System.out.print("Enter number of tables per row: ");
            String perRow = input.nextLine();
            try {
                numOfTables = Integer.valueOf(totTables);
                numPerRow = Integer.valueOf(perRow);
            }
            catch(NumberFormatException ex){
                System.out.println("Invalid input detected!");
            }
            if (!(numOfTables>=1 && numOfTables<=99 && numPerRow<=numOfTables && numPerRow>=1))
                System.out.println("Invalid input for total tables or tables per row!");
            else{
                Table.totalTables = numOfTables;
                Table.tablesPerRow = numPerRow; 
            }
        } 

        createTables(); 
        System.out.println("Table configuration complete.");
    }

    public static void createTables(){
        tables.clear();
        for (int i=1; i<=totalTables; i++){
            Table table = new Table(i, "NO"); 
            tables.add(table);
        }
    }

    @Override
    public int compareTo(Table table){
        return order.getOrderTakenTime().compareTo(table.order.getOrderTakenTime());
    } 
}

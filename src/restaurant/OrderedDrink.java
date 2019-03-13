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
public class OrderedDrink extends Meal{
    private boolean isDrinkHot;
    private char drinkSize;

    public OrderedDrink(){
        this("", "", 0.0, false);
    }

    public OrderedDrink(String mealCode, String mealName, double mealPrice, boolean isTakeAway){
        super(mealCode, mealName, mealPrice, isTakeAway);
    }

    public boolean isDrinkHot() {
        return isDrinkHot;
    }

    public void setIsDrinkHot(boolean isDrinkHot) {
        this.isDrinkHot = isDrinkHot;
    }

    public char getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(char drinkSize) {
        this.drinkSize = drinkSize;
    }

    public String drinkHotness(){
        if (isDrinkHot)
            return "Hot";
        else
            return "Cold";
    } 
    
    public String drinkSize(){
        if (drinkSize == 'R')
            return "Regular";
        else
            return "Large";
    }

    public String toString(){
        String mealDetails = "-" + mealOrderType() + "---" + drinkHotness() + "---" + drinkSize();
        return String.format("%-10s%-25s%-65s", getMealCode(), getMealName(), mealDetails) + getMealStatus() + remarks() + "\n";
    }

    public double mealPrice(){
        return getMealPrice();
    }
}

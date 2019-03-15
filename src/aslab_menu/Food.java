/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aslab_menu;

/**
 *
 * @author Acer
 */
public class Food {
    
    private String name;
    private Integer price;
    private Integer stock;
    private Float calorie;
    private String desc;
    private Integer spicyLevel;
    private Float rating;
    private Boolean isTakeAway;

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", price=" + price + ", stock=" + stock + ", calorie=" + calorie + ", desc=" + desc + ", spicyLevel=" + spicyLevel + ", rating=" + rating + ", isTakeAway=" + isTakeAway + '}';
    }

    public Food(String name, Integer price, Integer stock, Float calorie, String desc, Integer spicyLevel, Float rating, Boolean isTakeAway) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.calorie = calorie;
        this.desc = desc;
        this.spicyLevel = spicyLevel;
        this.rating = rating;
        this.isTakeAway = isTakeAway;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Float getCalorie() {
        return calorie;
    }

    public void setCalorie(Float calorie) {
        this.calorie = calorie;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getSpicyLevel() {
        return spicyLevel;
    }

    public void setSpicyLevel(Integer spicyLevel) {
        this.spicyLevel = spicyLevel;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Boolean getIsTakeAway() {
        return isTakeAway;
    }

    public void setIsTakeAway(Boolean isTakeAway) {
        this.isTakeAway = isTakeAway;
    }
    
    public Food(){
    //default
    }

}

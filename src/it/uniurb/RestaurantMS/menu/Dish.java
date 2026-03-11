/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.menu;

import it.uniurb.RestaurantMS.menu.DishType;
import it.uniurb.RestaurantMS.ingredient.Ingredient;
import java.util.ArrayList;

/*
 * This Class is used to create dishes, define their prices and type and to
 * add ingredients to a specific dish recipe.
 */
public class Dish {
    
    private String dishName;
    private double dishPrice;
    private ArrayList<Ingredient> dishRecipe;
    private DishType dishType;
    
    /**
     *
     * @param name It is the name of the dish.
     * @param price It is the price of the dish.
     * @param dishType it is the type of the dish.
     */
    public Dish(String name, double price, DishType dishType) {
        this.dishName = name;
        this.dishPrice = price;
        this.dishRecipe = new ArrayList<>();
        this.dishType = dishType;
    }
    
    /**
     *
     * @param ingredient It is the igredient to add in the dish recipe.
     */
    public void addIngredient(Ingredient ingredient) {
        if(!dishRecipe.contains(ingredient)) {
            dishRecipe.add(ingredient);
        }
    }
    
    /**
     *
     * @param ingredient It is the ingredient to remove from the dish recipe.
     */
    public void removeIngredient(Ingredient ingredient) {
        dishRecipe.remove(ingredient);
    }
    
    /**
     *
     * @return Return the name of the dish.
     */
    public String getDishName() {
        return dishName;
    }
    
    /**
     *
     * @return Return the price of the dish.
     */
    public double getDishPrice() {
        return dishPrice;
    }
    
    /**
     *
     * @return 
     */
    public ArrayList<Ingredient> getDishRecipe() {
        return dishRecipe;
    }
    
    /**
     *
     * @return Return the type of the dish.
     */
    public DishType getDishType() {
        return dishType;
    }
    
}

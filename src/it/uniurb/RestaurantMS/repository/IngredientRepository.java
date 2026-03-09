/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.repository;

import it.uniurb.RestaurantMS.model.Ingredient;
import java.util.LinkedHashSet;

/**
 *
 * @author lucapaolillo
 */
public class IngredientRepository implements RepoInterface<Ingredient> {
    
    private LinkedHashSet<Ingredient> ingredientList = new LinkedHashSet<>();            
    /**
     * Constructor.
     */
    public IngredientRepository() {
        
    }
    
    /**
     *
     * Generate ingredient ID;
     */
    @Override
    public int generateItemId() {
        if(this.ingredientList.isEmpty()){
            return 1;
        }
        else{
            int id = this.ingredientList.getLast().getIngredientId();
            return id + 1;
        }
    }
    
    /**
     *
     * @param ingredientToAdd
     * @return Return true if the ingredient has been added to the list.
     */
    
    @Override
    public boolean addItem(Ingredient ingredientToAdd) {
        boolean added = false;        
        if(!ingredientList.contains(ingredientToAdd)) {
            ingredientList.addLast(ingredientToAdd);
            added = true;
        }
        return added;
    }
    
    /**
     *
     * @param ingredientToRemove
     * @return Returns true if the ingredient has ben removed successfully.
     */
    
    @Override
    public boolean removeItem(Ingredient ingredientToRemove) {
        boolean removed = false;
        if(ingredientList.contains(ingredientToRemove)) {
            ingredientList.remove(ingredientToRemove);
            removed = true;
        }
        return removed;
    }

    /**
     *
     * @param ingredient Ingredient to search in the list.
     */
    public void searchIngredient(Ingredient ingredient) {
        
        
            if(this.ingredientList.contains(ingredient)) {
                System.out.println(ingredient);
            }
            else{
                System.out.println(ingredient + " non presente.");
            }
        
    }


    @Override
    public boolean updateItemName(Ingredient ingredientToUpdate, String newName) {
        boolean updated = false;
        if(ingredientList.contains(ingredientToUpdate)) {
            ingredientToUpdate.setIngredientName(newName);
            updated = true;
        }
        return updated;
        
    }

    @Override
    public void printContents(){
        for(Ingredient item : ingredientList){
            System.out.println(item.toString());
            
        }
    }
}

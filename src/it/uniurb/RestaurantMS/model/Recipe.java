/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.model;

/**
 *
 * @author lucapaolillo
 */
public class Recipe {
    
    private String recipeName;
    private boolean isCustom = false;
    
    public Recipe (String recipeName) {
        this.recipeName = recipeName;
    }
    /*
    public void setRecipeId(int id) {
        this.recipeId = id;
    }
    
    
    public int getRecipeId() {
        return recipeId;
    }
    
    public String getRecipeName() {
        return recipeName;
    }
    
    public boolean getIsCustom() {
        return isCustom;
        
    }
    
    @Override
    public String toString() {
        return "Name: " + recipeName + ", ID: " + recipeId; 
    }
    */
    
}

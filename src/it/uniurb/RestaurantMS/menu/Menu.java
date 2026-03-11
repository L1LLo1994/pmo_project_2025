/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.menu;

import java.util.ArrayList;

/**
 *
 * @author lucapaolillo
 */
public class Menu {
    private int menuId;
    private String menuName;
    private ArrayList<Dish> dishes;
    
    public Menu() {
        this.dishes = new ArrayList<>();
    }
    
    public void setMenuId(int id) {
        this.menuId = id;
    }
    
    public int getMenuId() {
        return menuId;
    }
    
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    
    public String getMenuName() {
        return this.menuName;
        
    }
   
    
    public ArrayList<Dish> getMenuDishes() {
        return dishes;
    }
    
    
    @Override
    public String toString() {
        return "Name: " + this.menuName + ", ID: " + this.menuId; 
    }
    
}

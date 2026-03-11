/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.uniurb.RestaurantMS.clientorder;

/**
 *
 * @author lucapaolillo
 */
public class ClientOrder {
    
    private int clientOrderId;
    private int clientOrderTable;
    // private Dish clientOrderDishes;
    private OrderStatus clientOrderStatus;
    
    /**
     * Constructor.
     */
    public ClientOrder() {
        
    }
    
    /**
     *
     * @return Return client's order ID.
     */
    public int getClientOrderId() {
        return clientOrderId;
    }
    
    /**
     *
     * @param id Set the ID to the client's order.
     */
    public void setClientOrderId(int id) {
        this.clientOrderId = id;
    }
    
    /**
     *
     * @return Return client's order table.
     */
    public int getClientTable() {
        return clientOrderTable;
    }
    
    /**
     *
     * @return Return status of the order.
     */
    public OrderStatus getClientOrderStatus() {
        return clientOrderStatus;
    }
    
    
    
}

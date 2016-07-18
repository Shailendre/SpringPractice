package org.shailendra.singh;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shailendra.singh on 7/18/16.
 */
public class Customer {

    private Person person;
    private int itemsInCart;

    public Person getPerson() {
        return person;
    }

    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public int getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(int itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public void displayCustomerInfo(){
        System.out.println("Customers name: "+getPerson().getName());
        System.out.println("Customers age: "+getPerson().getAge());
        System.out.println("Customers gender: "+getPerson().getGender());
        System.out.println("Customer purchased: "+getItemsInCart());
    }
}

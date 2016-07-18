package org.shailendra.singh;

import static java.lang.System.out;

/**
 * Created by shailendra.singh on 7/18/16.
 */
public class Student {

    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address.getCity()+","+address.getState();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayName(){
        out.println("The name is: "+getName());
    }

    public void displayAddress(){
        out.println("The address is:"+getAddress());
    }
}

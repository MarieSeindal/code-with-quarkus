package org.acme;

public class Person {
    String address;
    String name;

    public Person(String address, String name){
        this.address=address;
        this.name=name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

package com.mycompany.mavenproject1;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    
 
    void SayMenu(){
    }
    
    void buyFood(){
    }
    
    void cancelBuy(){
    }
    
    public void sellFood(){
    if (this.role != CustomerRole.ADMINISTRATIVE){
    System.out.println("Usted no tiene ");
    return;
    }
    System.out.println("Ya te atiendo wey");
    }
}

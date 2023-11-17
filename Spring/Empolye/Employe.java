/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empolye;

/**
 *
 * @author user
 */
public class Employe {
    
   
    private String name;
    private String id;
    private Address address ;
    
    public Employe(String name, String id,Address address) {
        this.name = name;
        this.id = id;
        this.address=address;
    }
    
    public void displayEmploye(){
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("address="+address.toString());
    }

    
    
}

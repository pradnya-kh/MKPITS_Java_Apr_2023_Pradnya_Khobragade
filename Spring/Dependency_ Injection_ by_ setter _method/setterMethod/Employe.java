/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterMethod;

/**
 *
 * @author user
 */
public class Employe {
    private String id;
    private String name;
    private Address address;

    public Employe(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
      
    
    public void displayEmploye(){
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("address="+address.toString());
    }
}

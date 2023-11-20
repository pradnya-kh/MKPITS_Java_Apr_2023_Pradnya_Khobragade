/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterMethod;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author user
 */
public class Question {
    private int id;
    private String name;
    private List<String>answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
    
    public void displayinfolist(){
        System.out.println("id= "+id);
         System.out.println("name= "+name);
        Iterator iterator = answers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        
    }
    
}

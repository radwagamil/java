/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams;

/**
 *
 * @author RODY4_000
 */
public class Tasks {
    
    private String name;
    private String description;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    @Override
    public String toString(){
       
        return"Name : " + name + "\nDescription : " + description + "\n" ;
    }
    
    
}

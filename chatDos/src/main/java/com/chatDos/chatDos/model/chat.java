/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatDos.chatDos.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class chat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;     
     private String name;          
     private String massage;
    
 
     
  

    public chat(long id, String name, String massage) {
        this.id = id;       
        this.name = name;       
        this.massage = massage;   
                    
    }       
  
    
    public chat() {
    }     
}








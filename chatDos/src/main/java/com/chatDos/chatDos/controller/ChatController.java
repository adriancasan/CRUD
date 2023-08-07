/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatDos.chatDos.controller;

import com.chatDos.chatDos.model.chat;
import com.chatDos.chatDos.service.IChatService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

  @RestController  
@CrossOrigin (origins = "http://localhost:4200")
//    @CrossOrigin (origins = "https://asis-5884e.web.app/") 
public class ChatController {
    
  @Autowired
private IChatService chatServ;  
  @PostMapping ("/chats")
  public void agregarChat (@RequestBody chat ch) {
  chatServ.agregarChat(ch);
  } 
  @GetMapping ("/chats") 
  @ResponseBody
  public List<chat> verChat() {
 return chatServ.verChat();
  }
  @DeleteMapping ("/chats/{id}")
  public void borrarIngresoPersona (@PathVariable Long id){
  chatServ.borrarChat(id);
  }  
   @PutMapping ("/chats/{id}")
  public void editarHoraIngreso (@RequestBody chat ch) {
  chatServ.editarChat(ch);
  } 
}



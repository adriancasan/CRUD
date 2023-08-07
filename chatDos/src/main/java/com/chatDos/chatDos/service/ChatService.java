/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chatDos.chatDos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chatDos.chatDos.model.chat;
import com.chatDos.chatDos.repository.ChatRepository;




@Service
public class ChatService implements IChatService {
    
    @Autowired
    public ChatRepository chatRepo; 
    
    @Override
    public List<chat> verChat() {
       //  System.out.println("prueba" + horaIngresoRepo.findAll());
       return chatRepo.findAll();     
               
    }

    @Override
    public void agregarChat(chat ch) {
    chatRepo.save(ch);
    }

    @Override
    public void borrarChat(Long id) {
     chatRepo.deleteById(id);
    }

    @Override
    public chat buscarChat(Long id) {
        
         return chatRepo.findById(id).orElse(null);
    }

    @Override
  public void editarChat (chat Ch){
  chatRepo.save(Ch);
  }
}





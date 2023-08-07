
package com.chatDos.chatDos.service;

import com.chatDos.chatDos.model.chat;
import java.util.List;


public interface IChatService {
    public  List<chat> verChat();
    public void agregarChat(chat ch);
    public void borrarChat(Long id);    
    public chat buscarChat (Long id); 
    public void editarChat (chat ch);
}



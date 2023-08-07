/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.chatDos.chatDos.repository;

import com.chatDos.chatDos.model.chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Adrian
 */
@Repository
public interface ChatRepository extends JpaRepository <chat, Long>{
    
}


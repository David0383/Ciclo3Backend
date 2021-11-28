package com.ciclo3backend.ciclo3backend.view;

import com.ciclo3backend.ciclo3backend.Model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jeison Hernandez
 */
public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}
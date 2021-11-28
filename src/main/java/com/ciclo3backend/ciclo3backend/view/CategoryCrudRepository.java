package com.ciclo3backend.ciclo3backend.view;


import com.ciclo3backend.ciclo3backend.Model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jeison Hernandez
 */
public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

}

package com.ciclo3backend.ciclo3backend.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Pacho
 */
@Repository
public class AdminRepository {
    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public List<Admin>getAll(){
        return (List<Admin>)adminCrudRepository.findAll();
    }
    public Optional<Admin>getAdmin(int id){
        return adminCrudRepository.findById(id);
    }
    public Admin save(Admin a){
        return adminCrudRepository.save(a);
    }
}
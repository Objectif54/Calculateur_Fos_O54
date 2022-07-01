package com.obj54.Repository;

import org.springframework.data.repository.CrudRepository;

import com.obj54.Model.Externe;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ExterneRepository extends CrudRepository<Externe, Integer> {

}
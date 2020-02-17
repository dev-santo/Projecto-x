package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Route;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Long> {
       //User findUse;
        Route findRouteById(Long id);

}

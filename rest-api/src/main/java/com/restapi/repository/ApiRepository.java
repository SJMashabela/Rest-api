package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.entity.Client;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<Client,Integer> {

}

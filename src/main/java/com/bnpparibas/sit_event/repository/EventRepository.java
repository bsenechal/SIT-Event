package com.bnpparibas.sit_event.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bnpparibas.sit_event.model.Event;

public interface EventRepository extends CrudRepository<Event, Long>{

	public List<Event> findAll();

}
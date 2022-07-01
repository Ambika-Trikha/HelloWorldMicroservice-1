package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	UserRepo userRep;
	
	@GetMapping("/users")
	public Iterable showAll() {
		return userRep.findAll();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<user_table> getUserById(@PathVariable int id)
    {
        return userRep.findById(id);
    }
	
	@PutMapping("/addUser")
	public user_table addAUser(@RequestBody user_table user)
    {
        return userRep.save(user);
    }

}

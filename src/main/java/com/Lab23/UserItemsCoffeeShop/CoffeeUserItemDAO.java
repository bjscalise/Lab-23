package com.Lab23.UserItemsCoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeUserItemDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Items> findAllItems() {
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
	}

	public List<Users> findAllUsers() {
		return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));
	}
	
	public int addUsers(String fName, String lName, String phoneNum, String email) {
		String addQuery = "insert into users(First name, Last name, Phone number, e-mail) values(?,?,?,?)";
		return jdbcTemplate.update(addQuery, fName, lName, phoneNum, email);
	}
}

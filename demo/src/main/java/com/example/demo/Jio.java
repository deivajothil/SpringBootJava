package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Jio {
//private int connection;
	@Autowired
	Mobile_User connect;

public Jio()
{
System.out.println("Jio");	
}

/**
 * 
 */
public void provide_internet()
{
	System.out.println("provide internet");
	connect.connection();
	
	
	
	}
/**
 * @return
 */
/*
public int getConnection() {
	return connection;
}

public void setConnection(int connection) {
	this.connection = connection;
}*/

}

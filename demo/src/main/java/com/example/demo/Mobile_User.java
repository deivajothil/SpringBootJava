package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile_User {
	private int id_proof;
	private int address_proof;
	public int getId_proof() {
		return id_proof;
	}
	public void setId_proof(int id_proof) {
		this.id_proof = id_proof;
	}
	public int getAddress_proof() {
		return address_proof;
	}
	public void setAddress_proof(int address_proof) {
		this.address_proof = address_proof;
	}
    //@Autowired
	public void connection()
{
		System.out.println("Connection established");}

}

package com.example.springpractice.TransactionalTest.Model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Purchase {
	private int id;
	private int customer_id;
	private int price;
}

package com.example.springpractice.TransactionalTest.JPA;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "transactionaltest", schema = "transactionaltest")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String fio;
	private Long money;
}

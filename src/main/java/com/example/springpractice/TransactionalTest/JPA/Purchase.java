package com.example.springpractice.TransactionalTest.JPA;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "purchase", schema = "transactionaltest")
public class Purchase {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Customer customer;
	private Long money;
}

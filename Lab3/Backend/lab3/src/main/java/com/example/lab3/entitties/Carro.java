package com.example.lab3.entitties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carro {
	private Long id;
    private String modelo;
    private String marca; 
    private Integer preco; 
}

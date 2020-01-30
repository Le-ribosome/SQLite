package com.example.demo.dto;



import lombok.Data;

/**
 * Ingrédients, hop et fermentable en héritent
 * 
 * @author alexis
 *
 */

@Data
public class Element {

	private int id;
	
	private String last_modif;

	private String name;

	private String vendeur;
}

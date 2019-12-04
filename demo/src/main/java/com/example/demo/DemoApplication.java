package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.database.Connexion;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Connexion connexion = new Connexion();
		connexion.connect();
		connexion.close();
		
	}

}

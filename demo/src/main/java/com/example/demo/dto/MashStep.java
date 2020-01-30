package com.example.demo.dto;

import lombok.Data;

/**
 * Étape d'empâtage, pour construire la liste d'étapes de l'empâtage d'une recette.
 * 
 * @author alexis
 *
 */

@Data
public class MashStep {

    private String name;
    private String type;
    private String time;
    private String temp;
    private float infuseAmount;
    private int version;
    
}

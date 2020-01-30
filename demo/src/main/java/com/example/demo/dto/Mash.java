package com.example.demo.dto;

import java.util.List;

import lombok.Data;

/**
 * Empâtage
 * 
 * @author alexis
 *
 */

@Data
public class Mash {

    private String name;
    private String grainTemp;
    private Temperature tunTemp;
    private Temperature spargeTemp;
    private Double ph;
    private List<MashStep> mashSteps;
    
}

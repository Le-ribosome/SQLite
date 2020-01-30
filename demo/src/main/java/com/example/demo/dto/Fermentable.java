package com.example.demo.dto;

import com.example.demo.Enums.FermentableTypeEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Tous les ingrédients fermentescibles (grains, sucre)
 * 
 * @author alexis
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Fermentable extends Element{

    private int amount;
    private FermentableTypeEnum type;
    private int fyield;
    private boolean recommendMash;
    private int color;
    private boolean useAfterBoil;
	
}

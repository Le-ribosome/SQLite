package com.example.demo.dto;

import com.example.demo.Enums.MiscUseEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Autres ingrédients
 * 
 * @author alexis
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Misc extends Element{

    private Float amount;
    private String type;
    private Float time;
    private MiscUseEnum use;
}

package com.example.demo.dto;

import com.example.demo.Enums.HopFormEnum;
import com.example.demo.Enums.HopUseEnum;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Houblon
 * 
 * @author alexis
 *
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class Hop extends Element{

    private Float amount;
    private HopFormEnum form;
    private Float time;
    private Float _alpha;
    private HopUseEnum use;
}

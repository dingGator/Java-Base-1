package com.example.game1;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public interface ISaveable {
    List<String>write();
    void read(List<String> savedValues);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.controller;

import main.model.ItemModel;
import main.repository.ItemRepository;

/**
 *
 * @author uillia
 */
public class ItemController {
    ItemRepository ir = new ItemRepository();

    public void addItemsPlus(ItemModel im) {
        ir.addItemsPlus(im);
    }
    
}

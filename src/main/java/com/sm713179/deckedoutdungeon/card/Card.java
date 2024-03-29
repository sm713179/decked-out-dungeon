/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sm713179.deckedoutdungeon.card;

/**
 *
 * @author Samuel McClatchey
 */
public abstract class Card {
    String name, iconPath;

    //Boilerplate
    public Card() {}
    
    public Card(String name, String iconPath) {
        this.name = name;
        this.iconPath = iconPath;
    }

    public String getName() {
        return name;
    }

    public String getIconPath() {
        return "asset/" + iconPath + ".png";
    }
    
    //Methods
    public boolean isType(String type) {
        type = "class com.sm713179.deckedoutdungeon.card." + type;
        return type.equals(this.getClass().toString());
    }
}
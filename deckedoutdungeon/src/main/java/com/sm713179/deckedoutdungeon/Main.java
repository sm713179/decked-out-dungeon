/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sm713179.deckedoutdungeon;

import com.sm713179.deckedoutdungeon.util.card.*;
import javax.swing.ImageIcon;

/**
 *
 * @author Samuel McClatchey
 */
public class Main {

    public static void main(String[] args) {
        
            Misc card = new Misc("Empty Space", "misc/emptyTile.png");
            System.out.println(card.getName());
            System.out.println(card.getIcon().getIconHeight());
            System.out.println(System.getProperty("user.dir"));
    }
}
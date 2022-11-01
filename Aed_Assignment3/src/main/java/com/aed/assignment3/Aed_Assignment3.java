/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.aed.assignment3;

import com.aed.model.Community;
import com.aed.model.Person;
import com.aed.view.Additions;
import static com.aed.view.Additions.communityId;
import static com.aed.view.Additions.communityMap;
import static com.aed.view.Additions.personId;
import static com.aed.view.Additions.personMap;
import com.aed.view.LoginJFrame;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme;

/**
 *
 * @author just_chakri
 */
public class Aed_Assignment3 {

 

    public static void main(String[] args) {
        
        try{
            FlatDraculaContrastIJTheme.setup();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        new LoginJFrame().setVisible(true);
    }
}

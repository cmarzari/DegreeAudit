/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreeaudit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author cmarzari
 */
public class Cset extends DegreeAudit {
    
    public class Cset (course){
         int[] Id = {0,1,2,3,4};
        String[] courseNameCset = {"CSET1000", "CSET1100", "CSET1200", "CSET1300", "CSET1400"};
        int[] credits = {4,3,4,4,3};
        
        //finding out classes a student has not taken given how many classes they have
        
        
        //initializing the arrays we are going to fill in
        List<String> alreadyTakenCset = new ArrayList<String>();
        List<String> notTakenCset = new ArrayList<String>();
        List<Integer> alreadyTakenCsetID = new ArrayList<Integer>();
        
       
        //Getting the list of classes and ID numbers that have already been taken
        for (int i=0; i<noCommas.length;i++){
            
            if(Arrays.asList(courseName).contains(noCommas[i])){
                alreadyTakenCN.add(noCommas[i]);
                alreadyTakenID[i]=Id[i];                
            } 
        }
        System.out.println("Classes you have taken:");
        System.out.println(Arrays.toString(alreadyTakenCN.toArray()));
        
        for (int j=0; j<courseName.length;j++){
            
            if(Arrays.asList(noCommas).contains(courseName[j])){      
            } 
            else{
                
                notTaken.add(courseName[j]);
                    }
        }
        
        System.out.println("Classes you still have to take:");
        System.out.println(Arrays.toString(notTaken.toArray())); 
}
}

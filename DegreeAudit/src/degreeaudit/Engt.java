/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreeaudit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cmarzari
 */
public class Engt {
     public static List<String> Engt(List EngtClasses, HashMap EngtList){
        List<String> takenEngt = new ArrayList<String>();
        List<String> notTakenEngt = new ArrayList<String>();
        Arrays.toString(EngtClasses.toArray());
        List<String> EngtCourseName = new ArrayList<String>(EngtList.keySet());
        List<Integer> EngtCourseCredit = new ArrayList<Integer>(EngtList.values());
        
        String[] courseName = new String[EngtCourseName.size()];
        courseName = EngtCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[EngtCourseCredit.size()];
        credit = EngtCourseCredit.toArray(credit);
        
        int EngtCredits = 0;
  
        for (int j=0; j<courseName.length;j++){
            
            if(EngtClasses.contains(courseName[j])){     
                takenEngt.add(courseName[j]);
                EngtCredits = EngtCredits + credit[j];
            } 
            else{
                
                notTakenEngt.add(courseName[j]);
            }
        
        }
        
        String TextOut = "";

        System.out.println("ENGT Classes you have taken: ");
        System.out.println(Arrays.toString(takenEngt.toArray()));
        
        TextOut =  "ENGT Classes you still have to take: " + Arrays.toString(notTakenEngt.toArray());   

        List<String> out = notTakenEngt;
        out.add(TextOut);
        out.add(Integer.toString(EngtCredits));
        
        return out;
    }
}

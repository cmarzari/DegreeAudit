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
public class Eet {
      public static List<String> Eet(List EetClasses, HashMap EetList){
        List<String> takenEet = new ArrayList<String>();
        List<String> notTakenEet = new ArrayList<String>();
        Arrays.toString(EetClasses.toArray());
        List<String> EetCourseName = new ArrayList<String>(EetList.keySet());
        List<Integer> EetCourseCredit = new ArrayList<Integer>(EetList.values());
        
        String[] courseName = new String[EetCourseName.size()];
        courseName = EetCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[EetCourseCredit.size()];
        credit = EetCourseCredit.toArray(credit);
        
        int EetCredits = 0;
  
        for (int j=0; j<courseName.length;j++){
            
            if(EetClasses.contains(courseName[j])){     
                takenEet.add(courseName[j]);
                EetCredits = EetCredits + credit[j];
            } 
            else{
                
                notTakenEet.add(courseName[j]);
            }
        
        }
        
        String TextOut = "";
        
        System.out.println("EET Classes you have taken: ");
        System.out.println(Arrays.toString(takenEet.toArray()));
        
        TextOut = "EET Classes you still have to take: " + Arrays.toString(notTakenEet.toArray());   
        
        
        List<String> out = notTakenEet;
        out.add(TextOut);
        out.add(Integer.toString(EetCredits));
        
        return out;
    }
}

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
public class Comm{
   public static List<String> Comm (List CommClasses, HashMap CommList){
       int CommCredits = 0;
       
       List<String> takenComm = new ArrayList<String>();
        List<String> notTakenComm = new ArrayList<String>();
        
        Arrays.toString(CommClasses.toArray());
        List<String> CommCourseName = new ArrayList<String>(CommList.keySet());
        List<Integer> CommCourseCredit = new ArrayList<Integer>(CommList.values());
        
        String[] courseName = new String[CommCourseName.size()];
        courseName = CommCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[CommCourseCredit.size()];
        credit = CommCourseCredit.toArray(credit);
        
        for (int j=0; j<courseName.length;j++){
            
            if(CommClasses.contains(courseName[j])){     
                takenComm.add(courseName[j]);
                CommCredits = CommCredits + credit[j];
            } 
            else{
                
                notTakenComm.add(courseName[j]);
            }
        
        }
        
        String TextOut = "";
        
        if(takenComm.size()>=1){
            TextOut = "You have fulfilled the COMM elective with the following class(es): " + Arrays.toString(takenComm.toArray());
        }
        else{
            TextOut = "You must take one of the following COMM electives: " + Arrays.toString(notTakenComm.toArray());
        }
        
        List<String> out = notTakenComm;
        out.add(TextOut);
        out.add(Integer.toString(CommCredits));
       
       return out;
}
} 
        
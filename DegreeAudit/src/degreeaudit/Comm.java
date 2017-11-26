/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreeaudit;

import static degreeaudit.DegreeAudit.FinalOut;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author cmarzari
 */
public class Comm{
   public static int Comm (List CommClasses, HashMap CommList){
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
        
        if(takenComm.size()>=1){
            System.out.println("You have fulfilled the COMM elective with the following class(es): ");
            System.out.println(Arrays.toString(takenComm.toArray()));
        }
        else{
             System.out.println("You must take one of the following COMM electives: ");
             System.out.println(Arrays.toString(notTakenComm.toArray()));
        }
       
       return CommCredits;
}
} 
        
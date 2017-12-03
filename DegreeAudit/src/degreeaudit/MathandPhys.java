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
public class MathandPhys {
    public static List<String> MathandPhys(List MathandPhysClasses, HashMap MathandPhysList){
        List<String> takenMathandPhys = new ArrayList<String>();
        List<String> notTakenMathandPhys = new ArrayList<String>();
        Arrays.toString(MathandPhysClasses.toArray());
        List<String> MathandPhysCourseName = new ArrayList<String>(MathandPhysList.keySet());
        List<Integer> MathandPhysCourseCredit = new ArrayList<Integer>(MathandPhysList.values());
        
        String[] courseName = new String[MathandPhysCourseName.size()];
        courseName = MathandPhysCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[MathandPhysCourseCredit.size()];
        credit = MathandPhysCourseCredit.toArray(credit);
        
        int MathandPhysCredits = 0;
  
        for (int j=0; j<courseName.length;j++){
            
            if(MathandPhysClasses.contains(courseName[j])){     
                takenMathandPhys.add(courseName[j]);
                MathandPhysCredits = MathandPhysCredits + credit[j];
            } 
            else{
                
                notTakenMathandPhys.add(courseName[j]);
            }
        
        }    
        
        String TextOut = "";
        
        System.out.println("MATH and PHYS Classes you have taken: ");
        System.out.println(Arrays.toString(takenMathandPhys.toArray()));
        
        TextOut = "MATH and PHYS Classes you still have to take: " + Arrays.toString(notTakenMathandPhys.toArray());   

        List<String> out = notTakenMathandPhys;
        out.add(TextOut);
        out.add(Integer.toString(MathandPhysCredits));
        
        return out;
    }
}

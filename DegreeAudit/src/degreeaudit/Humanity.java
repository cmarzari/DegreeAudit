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

public class Humanity {
    public static int Humanity(List HumanityClasses, HashMap HumanityList){
        int HumanityCredits = 0;
        List<String> takenHumanity = new ArrayList<String>();
        List<String> notTakenHumanity = new ArrayList<String>();
        
        Arrays.toString(HumanityClasses.toArray());
        List<String> HumanityCourseName = new ArrayList<String>(HumanityList.keySet());
        List<Integer> HumanityCourseCredit = new ArrayList<Integer>(HumanityList.values());
        
        String[] courseName = new String[HumanityCourseName.size()];
        courseName = HumanityCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[HumanityCourseCredit.size()];
        credit = HumanityCourseCredit.toArray(credit);
        
        for (int j=0; j<courseName.length;j++){
            
            if(HumanityClasses.contains(courseName[j])){     
                takenHumanity.add(courseName[j]);
                HumanityCredits = HumanityCredits + credit[j];
            } 
            else{
                
                notTakenHumanity.add(courseName[j]);
            }
        
        }
        
        if(takenHumanity.size()>=2){
            System.out.println("You have fulfilled the Humanities electives with the following classes: ");
            System.out.println(Arrays.toString(takenHumanity.toArray()));
        }
        else if(takenHumanity.size()==1) {
             System.out.println("You must take two of the following Humanities electives: ");
             System.out.println(Arrays.toString(notTakenHumanity.toArray()));
        }
        else if(takenHumanity.size()==0){
            System.out.println("You must take two of the following Humanities electives: ");
             System.out.println(Arrays.toString(notTakenHumanity.toArray()));
        }
        
        
             
        return HumanityCredits;
    }
    
}

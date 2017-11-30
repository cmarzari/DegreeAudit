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

public class Social {
    public static int Social(List SocialClasses, HashMap SocialList){
        int SocialCredits = 0;
        List<String> takenSocial = new ArrayList<String>();
        List<String> notTakenSocial = new ArrayList<String>();
        
        Arrays.toString(SocialClasses.toArray());
        List<String> SocialCourseName = new ArrayList<String>(SocialList.keySet());
        List<Integer> SocialCourseCredit = new ArrayList<Integer>(SocialList.values());
        
        String[] courseName = new String[SocialCourseName.size()];
        courseName = SocialCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[SocialCourseCredit.size()];
        credit = SocialCourseCredit.toArray(credit);
        
        for (int j=0; j<courseName.length;j++){
            
            if(SocialClasses.contains(courseName[j])){     
                takenSocial.add(courseName[j]);
                SocialCredits = SocialCredits + credit[j];
            } 
            else{
                
                notTakenSocial.add(courseName[j]);
            }
        
        }
        
        if(takenSocial.size()>=2){
            System.out.println("You have fulfilled the Social electives with the following classes: ");
            System.out.println(Arrays.toString(takenSocial.toArray()));
        }
        else if(takenSocial.size()==1) {
             System.out.println("You must take one of the following Social electives: ");
             System.out.println(Arrays.toString(notTakenSocial.toArray()));
        }
        else if(takenSocial.size()==0){
            System.out.println("You must take two of the following Social electives: ");
             System.out.println(Arrays.toString(notTakenSocial.toArray()));
        }
        
        
             
        return SocialCredits;
    }
    
}

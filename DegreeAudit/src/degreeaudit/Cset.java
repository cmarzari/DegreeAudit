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
public class Cset {
    
     public static List<String> Cset(List CsetClasses, HashMap CsetList, HashMap CsetElectList3, HashMap CsetElectList4) {
       
         boolean CsetElect3 = false;
         boolean CsetElect4 = false;
         
        List<String> takenCset = new ArrayList<String>();
        List<String> notTakenCset = new ArrayList<String>();
        //Arrays.toString(CsetClasses.toArray());
        List<String> Cset3 = new ArrayList<String>();
        List<String> Cset4 = new ArrayList<String>();
        
      
        
        List<String> CsetCourseName = new ArrayList<String>(CsetList.keySet());
        List<Integer> CsetCourseCredit = new ArrayList<Integer>(CsetList.values());
        
        List<String> CsetElectList3Name = new ArrayList<String>(CsetList.keySet());
        List<Integer> CsetElectList3Credit = new ArrayList<Integer>(CsetList.values());
        
        List<String> CsetElectList4Name = new ArrayList<String>(CsetList.keySet());
        List<Integer> CsetElectList4Credit = new ArrayList<Integer>(CsetList.values());

        Integer [] CsetCredit = new Integer[CsetCourseCredit.size()];
        CsetCredit = CsetCourseCredit.toArray(CsetCredit);
        
        //fix alllllllllllllll of this shit
         String[] courseName = new String[CsetCourseName.size()];
        courseName = CsetCourseName.toArray(courseName);
        
        int CsetCredits = 0;
  
       for (int j=0; j<courseName.length;j++){
            
            if(CsetClasses.contains(courseName[j])){     
                takenCset.add(courseName[j]);
                CsetCredits = CsetCredits + CsetCredit[j];
                
                if (CsetElectList3Name.contains(courseName[j])){
                    Cset3.add(courseName[j]);
                    CsetElectList3Name.remove(courseName[j]);
                }
                
                else if(CsetElectList4Name.contains(courseName[j])){
                    Cset4.add(courseName[j]);
                    CsetElectList4Name.remove(courseName[j]);
                }
            } 
            else{
                
                notTakenCset.add(courseName[j]);
            }
        
        }    
        
       String TextOut = "";
        
        System.out.println("CSET and EECS Classes you have taken: ");
        System.out.println(Arrays.toString(takenCset.toArray()));
        
        System.out.println("CSET Classes you still have to take: ");
        System.out.println(Arrays.toString(CsetCourseName.toArray()));
        
        if ((Cset3.size()>=1)&& (Cset4.size()>=1)){
            TextOut = "You have fulfilled the CSET elective requirements with the following classes: "+ Arrays.toString(Cset3.toArray()) + Arrays.toString(Cset4.toArray());
        }
        else if ((Cset3.size()==0)&& (Cset4.size()>=1)){
            TextOut = "You must take one of the following classes to fulfill the elective 3: " + Arrays.toString(CsetElectList3Name.toArray());
        }
        else if ((Cset3.size()>=1)&& (Cset4.size()==0)){
            TextOut = "You must take one of the following classes to fulfill the elective 4: " + Arrays.toString(CsetElectList4Name.toArray());
        }
        else{
            TextOut = "Missing CSET Electives, Choose one 3 and 4 credit class: " + Arrays.toString(CsetElectList3Name.toArray()) + " and " + Arrays.toString(CsetElectList4Name.toArray());
        }
        
        List<String> out = notTakenCset;
        out.add(TextOut);
        out.add(Integer.toString(CsetCredits));
        
        
        return out;
    
}
        
           
}


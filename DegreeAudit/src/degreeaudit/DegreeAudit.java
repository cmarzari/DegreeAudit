

package degreeaudit;
import java.util.Scanner;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.lang.String;
import java.lang.*;
import java.util.List;


import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author cmarzari
 */
public class DegreeAudit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner
    	Scanner input = new Scanner(System.in);
    	
        //Get the input of classes
    	System.out.println("Input all of the classes you've taken, separated by a comma:");
        String courseInput = input.nextLine();
        
        //get rid of the spaces and make it to an array separating it at the commas
        String noSpaces = courseInput.toUpperCase().replaceAll("\\s+","");
        String[] noCommas = noSpaces.split(",");
        
        //initializing the hashmaps with the appropriate classes and credit values
        List<String> CsetClasses = new ArrayList<String>();
        List<String> EetClasses = new ArrayList<String>();
        
        //the arrays of all the course names
        HashMap<String, Integer> CsetList = new HashMap<String, Integer>();
            CsetList.put ("CSET1000", 4);
            CsetList.put ("CSET1100", 2);
            CsetList.put ("CSET1200", 4);
            CsetList.put ("CSET1300", 5);
            CsetList.put ("CSET1400", 3);

        HashMap<String, Integer> EetList = new HashMap<String, Integer>();
            EetList.put ("EET1000", 4);
            EetList.put ("EET1100", 2);
            EetList.put ("EET1200", 4);
            EetList.put ("EET1300", 5);
            EetList.put ("EET1400", 3);
        //Getting the list of classes and ID numbers that have already been taken
        
        
        
        for (int i=0; i<noCommas.length;i++){
            
            if(noCommas[i].contains("CSET")){
                CsetClasses.add(noCommas[i]);
                
            }
            else if(noCommas[i].contains("EET")){
                EetClasses.add(noCommas[i]);
            }
            else {
                System.out.println(noCommas[i]+" is not a valid course");
            }
       }
        
       System.out.println("total cset credits: "+Cset(CsetClasses, CsetList));
       System.out.println("total eet credits: "+Eet(EetClasses, EetList));
        
        
}   
    
    
    public static int Cset(List CsetClasses, HashMap CsetList) {
       
        List<String> takenCset = new ArrayList<String>();
        List<String> notTakenCset = new ArrayList<String>();
        Arrays.toString(CsetClasses.toArray());
        List<String> CsetCourseName = new ArrayList<String>(CsetList.keySet());
        List<Integer> CsetCourseCredit = new ArrayList<Integer>(CsetList.values());
        
        //converting list to array
        String[] courseName = new String[CsetCourseName.size()];
        courseName = CsetCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[CsetCourseCredit.size()];
        credit = CsetCourseCredit.toArray(credit);
        
        int CsetCredits = 0;
  
        for (int j=0; j<courseName.length;j++){
            
            if(CsetClasses.contains(courseName[j])){     
                takenCset.add(courseName[j]);
                CsetCredits = CsetCredits + credit[j];
            } 
            else{
                
                notTakenCset.add(courseName[j]);
            }
        
        }    
        System.out.println("CSET Classes you have taken:");
        System.out.println(Arrays.toString(takenCset.toArray()));
        
        System.out.println("CSET Classes you still have to take:");
        System.out.println(Arrays.toString(notTakenCset.toArray()));
        
        return CsetCredits;
    
}
    
    public static int Eet(List EetClasses, HashMap EetList){
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
        
        System.out.println("EET Classes you have taken:");
        System.out.println(Arrays.toString(takenEet.toArray()));
        
        System.out.println("EET Classes you still have to take:");
        System.out.println(Arrays.toString(notTakenEet.toArray()));   
        
        return EetCredits;
    }
    
    public static void FinalOut (){
        System.out.println("-----------------");
        
    }
}






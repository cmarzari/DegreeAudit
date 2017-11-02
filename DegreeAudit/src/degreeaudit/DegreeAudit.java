

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
        
        //here are the parallel arrays of all the courses, credit numbers, and ID numbers
        int[] Id = {0,1,2,3,4};
       // String[] courseName = {"CSET1000", "CSET1100", "CSET1200", "CSET1300", "CSET1400"};
        int[] credits = {4,3,4,4,3};
        List<String> CsetClasses = new ArrayList<String>();
        
        
        //finding out classes a student has not taken given how many classes they have
        //int howMany = courseName.length - noCommas.length +1;
        
        //initializing the arrays we are going to fill in
       // List<String> alreadyTakenCN = new ArrayList<String>();
       // List<String> notTaken = new ArrayList<String>();
        int[] alreadyTakenID = new int[noCommas.length];
       
        //Getting the list of classes and ID numbers that have already been taken
        
        
        
        for (int i=0; i<noCommas.length;i++){
            
            if(noCommas[i].contains("CSET")){
                String course = noCommas[i];
                CsetClasses.add(course);
                
            }
            else {
                System.out.println(noCommas[i]+" is not a valid course");
            }
       }
        
       Cset(CsetClasses);
        
        
}   
    
    
    public static void Cset(List CsetClasses) {
        String[] courseName = {"CSET1000", "CSET1100", "CSET1200", "CSET1300", "CSET1400"};
        List<String> takenCset = new ArrayList<String>();
        List<String> notTakenCset = new ArrayList<String>();
        Arrays.toString(CsetClasses.toArray());
        
        
       for(int i=0;i<CsetClasses.size();i++){
           
            String course  = CsetClasses.get(i).toString();
            if(Arrays.asList(courseName).contains(course)){
                takenCset.add(course);
                //alreadyTakenID[i]=Id[i];                
            } 
       }
        
        System.out.println("Classes you have taken:");
        System.out.println(Arrays.toString(takenCset.toArray()));
        
        for (int j=0; j<courseName.length;j++){
            
            if(CsetClasses.contains(courseName[j])){      
            } 
            else{
                
                notTakenCset.add(courseName[j]);
            }
        
        }    
        
    System.out.println("Classes you still have to take:");
        System.out.println(Arrays.toString(notTakenCset.toArray()));
    
}
    
    public static void FinalOut (){
        
    }
}






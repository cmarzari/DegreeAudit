

package degreeaudit;
import java.util.Scanner;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.lang.String;
import java.lang.*;


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

    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Input all of the classes you've taken, separated by a comma:");
    	
        String courseInput = input.nextLine();
        
        String noSpaces = courseInput.toUpperCase().replaceAll("\\s+","");
        
        String[] noCommas = noSpaces.split(",");
        
        

        
        int[] Id = {0,1,2,3,4};
        String[] courseName = {"CSET1000", "CSET1100", "CSET1200", "CSET1300", "CSET1400"};
        int[] credits = {4,3,4,4,3};
        
        int howMany = courseName.length - noCommas.length;
        
        String[] alreadyTaken = new String[noCommas.length];
        String[] haveNotTaken = new String[courseName.length-noCommas.length];
       
        for (int i=0; i<noCommas.length;i++){
            
            if(Arrays.asList(courseName).contains(noCommas[i])){
                alreadyTaken[i] = noCommas[i];
                System.out.println(alreadyTaken[i]);
            } 
            
           
        }
        
        
        //fix this
        /*
        for(int j=0; j<howMany; j++){
            if(Arrays.asList(courseName).contains(alreadyTaken[j])){
            } 
            else {
                haveNotTaken[j] = courseName[j];
                System.out.println(haveNotTaken[j]);
                } 
        }
        */
        
        
        
        
        
    	//try with a few classes 
    	
    	/*HashMap<String, Integer> allCourses = new HashMap<String, Integer>();
    	
    	allCourses.put("CSET1100",0);
    	allCourses.put("CSET1200",1);
    	allCourses.put("CSET1300",2);
        allCourses.put("CSET1400",3);
    	
    	Set set = allCourses.entrySet();
        Iterator i = set.iterator();
        
        
    	while(i.hasNext()) {
    		
    		Map.Entry course = (Map.Entry)i.next();
    		System.out.println(course.getKey());
    	}
*/
    	
    	
    	
    }
    
}



package degreeaudit;
import java.util.Scanner;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;
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
    	
    	//try with a few classes 
    	
    	HashMap allCourses = new HashMap();
    	
    	allCourses.put("CSET1100", new int 0);
    	allCourses.put("CSET1200", new int 1);
    	allCourses.put("CSET1300", new int 2);
    	
    	
    	while(i.hasNext()) {
    		
    		Map.Entry course = (Map.Entry)i.next();
    		System.out.println(course.getKey);
    	}
    	
    	
    	
    }
    
}

package degreeaudit;
import java.util.*;
import java.lang.*;


public class DegreeAudit
{
    public static void main(String[] args) 
    {
        //create new scanner
    	Scanner input = new Scanner(System.in);
    	
        //Get the input of classes
    	System.out.println("Input all of the classes you've taken, separated by a comma:");
        String courseInput = input.nextLine();
        
        //get rid of the spaces and make it to an array separating it at the Commas
        String noSpaces = courseInput.toUpperCase().replaceAll("\\s+","");
        String[] noCommas = noSpaces.split(",");
        
        //initializing the hashmaps with the appropriate classes and credit values
        List<String> CsetClasses = new ArrayList<String>();
        List<String> EetClasses = new ArrayList<String>();
        List<String> ElectClasses = new ArrayList<String>();

        
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
            
        HashMap<String, Integer> ElectList = new HashMap<String, Integer>();
            ElectList.put ("COMM2600", 3);
            ElectList.put ("COMM2820", 3);
            ElectList.put ("COMM2840", 3);
            ElectList.put ("BUAD2040", 3);
            ElectList.put ("BUAD2050", 3);
            ElectList.put ("BAUD2080", 3);
            ElectList.put ("BUAD3010", 3);
            ElectList.put ("BUAD3020", 3);
            ElectList.put ("BUAD3030", 3);
            ElectList.put ("BUAD3040", 3);
            ElectList.put ("BAUD3470", 3);
            ElectList.put ("BLAW3570", 3);
            ElectList.put ("FINA3060", 3);
            ElectList.put ("CSET3100", 3);
            ElectList.put ("CSET3200", 3);
            ElectList.put ("CSET3250", 3);
            ElectList.put ("CSET3400", 3);
            ElectList.put ("CSET4150", 3);
            ElectList.put ("CSET4200", 4);
            ElectList.put ("CSET4650", 4);
            ElectList.put ("CSET4850", 4);
            
 
        //Getting the list of classes and ID numbers that have already been taken
        
        
        
        for (int i=0; i<noCommas.length;i++)
        {
            
            if(noCommas[i].contains("CSET"))
            {
                CsetClasses.add(noCommas[i]);
                
            }
            if(noCommas[i].contains("EET"))
            {
                EetClasses.add(noCommas[i]);
            }
            else if(noCommas[i].contains("COMM"))
            {
                ElectClasses.add(noCommas[i]);
            }
            else 
            {
                System.out.println(noCommas[i]+" is not a valid course");
            }
       }
        
       System.out.println("total cset credits: "+Cset(CsetClasses, CsetList));
       System.out.println("total eet credits: "+Eet(EetClasses, EetList));
       System.out.println("total cset credits: "+Elect(ElectClasses, ElectList));
       
    }   
    
    
    public static int Cset(List CsetClasses, HashMap CsetList) 
    {  
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
  
        for (int j=0; j<courseName.length;j++)
        {
            
            if(CsetClasses.contains(courseName[j]))
            {     
                takenCset.add(courseName[j]);
                CsetCredits = CsetCredits + credit[j];
            } 
            else
            {
                
                notTakenCset.add(courseName[j]);
            }  
        }    
        System.out.println("CSET Classes you have taken:");
        System.out.println(Arrays.toString(takenCset.toArray()));
        
        System.out.println("CSET Classes you still have to take:");
        System.out.println(Arrays.toString(notTakenCset.toArray()));
        
        return CsetCredits;   
    }
    
    public static int Eet(List EetClasses, HashMap EetList)
    {
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
  
        for (int j=0; j<courseName.length;j++)
        {
            
            if(EetClasses.contains(courseName[j]))
            {     
                takenEet.add(courseName[j]);
                EetCredits = EetCredits + credit[j];
            } 
            else
            {
                
                notTakenEet.add(courseName[j]);
            }    
        }    
        
        System.out.println("EET Classes you have taken:");
        System.out.println(Arrays.toString(takenEet.toArray()));
        
        System.out.println("EET Classes you still have to take:");
        System.out.println(Arrays.toString(notTakenEet.toArray()));   
        
        return EetCredits;
    }
    
     public static int Elect(List ElectClasses, HashMap ElectList)
    {
        List<String> takenElect = new ArrayList<String>();
        List<String> notTakenElect = new ArrayList<String>();
        Arrays.toString(ElectClasses.toArray());
        List<String> ElectCourseName = new ArrayList<String>(ElectList.keySet());
        List<Integer> ElectCourseCredit = new ArrayList<Integer>(ElectList.values());
        
        String[] courseName = new String[ElectCourseName.size()];
        courseName = ElectCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[ElectCourseCredit.size()];
        credit = ElectCourseCredit.toArray(credit);
        
        int ElectCredits = 0;
  
        for (int j=0; j<courseName.length;j++)
        {
            
            if(ElectClasses.contains(courseName[j]))
            {     
                takenElect.add(courseName[j]);
                ElectCredits = ElectCredits + credit[j];
            } 
            else
            {
                
                notTakenElect.add(courseName[j]);
            }    
        }    
        
        System.out.println("Elect Classes you have taken:");
        System.out.println(Arrays.toString(takenElect.toArray()));
        
        System.out.println("Elect Classes you still have to take:");
        System.out.println(Arrays.toString(notTakenElect.toArray()));   
        
        return ElectCredits;
    }    
    
    
    
    
    public static void FinalOut ()
    {
        System.out.println("-----------------");       
    }
}



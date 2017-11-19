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
        List<String> CommClasses = new ArrayList<String>();
        List<String> CsetElectClasses = new ArrayList<String>();
        List<String> BuadClasses = new ArrayList<String>();
        
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
            
            
        HashMap<String, Integer> CsetElectList = new HashMap<String, Integer>();
            CsetElectList.put ("CSET3100", 3);
            CsetElectList.put ("CSET3200", 3);
            CsetElectList.put ("CSET3250", 3);
            CsetElectList.put ("CSET3400", 3);
            CsetElectList.put ("CSET4150", 3);
            CsetElectList.put ("CSET4200", 4);
            CsetElectList.put ("CSET4650", 4);
            CsetElectList.put ("CSET4850", 4);

            
        HashMap<String, Integer> CommList = new HashMap<String, Integer>();
            CommList.put ("COMM2600", 3);
            CommList.put ("COMM2820", 3);
            CommList.put ("COMM2840", 3);


        HashMap<String, Integer> BuadList = new HashMap<String, Integer>();
            BuadList.put ("BUAD2040", 3);
            BuadList.put ("BUAD2050", 3);
            BuadList.put ("BAUD2080", 3);
            BuadList.put ("BUAD3010", 3);
            BuadList.put ("BUAD3020", 3);
            BuadList.put ("BUAD3030", 3);
            BuadList.put ("BUAD3040", 3);
            BuadList.put ("BAUD3470", 3);
            BuadList.put ("FINA3060", 3);

            
 
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
            if(noCommas[i].contains("BUAD"))
            {
                BuadClasses.add(noCommas[i]);
            }
            if(noCommas[i].contains("FINA"))
            {
                BuadClasses.add(noCommas[i]);
            }           
            if(noCommas[i].contains("COMM"))
            {
                CommClasses.add(noCommas[i]);
            }
            else 
            {
                System.out.println(noCommas[i]+" is not a valid course");
            }
       }
        
       System.out.println("total cset credits: "+Cset(CsetClasses, CsetList));
       System.out.println("                             ");
       System.out.println("total eet credits: "+Eet(EetClasses, EetList));
       System.out.println("                             ");
       System.out.println("total comm credits out of 3 required: "+Comm(CommClasses, CommList));
       System.out.println("                             ");
       System.out.println("total cset elective credits out of 7 required: " + CsetElect(CsetElectClasses, CsetElectList));
       System.out.println("                             ");
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
    
     
    
    
    
    
    
    public static int Comm(List CommClasses, HashMap CommList)
    {
        List<String> takenComm = new ArrayList<String>();
        List<String> notTakenComm = new ArrayList<String>();
        Arrays.toString(CommClasses.toArray());
        List<String> CommCourseName = new ArrayList<String>(CommList.keySet());
        List<Integer> CommCourseCredit = new ArrayList<Integer>(CommList.values());
        
        String[] courseName = new String[CommCourseName.size()];
        courseName = CommCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[CommCourseCredit.size()];
        credit = CommCourseCredit.toArray(credit);
        
        int CommCredits = 0;
  
        for (int j=0; j<courseName.length;j++)
        {
             
            if(CommClasses.contains(courseName[j]))
            {     
                takenComm.add(courseName[j]);
                CommCredits = CommCredits + credit[j];
            } 
            else if (CommCredits < 3)
            {               
                notTakenComm.add(courseName[j]);
            }    
        }    
        
        System.out.println("COMM Classes you have taken: ");
        System.out.println(Arrays.toString(takenComm.toArray()));
        
        System.out.println("Must take at least one COMM class: ");
        System.out.println(Arrays.toString(notTakenComm.toArray()));   
        
        return CommCredits;
    }    
     
    
    
    
    
    
    public static void FinalOut ()
    {
        System.out.println("-----------------");       
    }
}

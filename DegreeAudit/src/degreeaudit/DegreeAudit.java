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
        List<String> NaturalClasses = new ArrayList<String>();
        List<String> SocialClasses = new ArrayList<String>();         
        
        //the arrays of all the course names
        HashMap<String, Integer> CsetList = new HashMap<String, Integer>();
            CsetList.put ("CSET1000", 4);
            CsetList.put ("CSET1100", 2);
            CsetList.put ("CSET1200", 4);
            CsetList.put ("CSET1300", 5);
            CsetList.put ("CSET1400", 3);
        
            
        HashMap<String, Integer> NaturalList = new HashMap<String, Integer>();
            NaturalList.put ("KINE", 4);
            NaturalList.put ("ASTR", 4);
            NaturalList.put ("BIOL", 4);
            NaturalList.put ("CHEM", 4);
            NaturalList.put ("EEES", 4);
            NaturalList.put ("PHYS", 4);

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
            
        HashMap<String, Integer> SocialList = new HashMap<String, Integer>();
            SocialList.put ("ANTH", 3);
            SocialList.put ("ECON", 3);
            SocialList.put ("GEPL", 3);
            SocialList.put ("PSC",  3);
            SocialList.put ("PSY",  3);
            SocialList.put ("SOCW", 3);
            SocialList.put ("SOC",  3);
  

            
 
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
            if(noCommas[i].contains("KINE"))
            {
                NaturalClasses.add(noCommas[i]);
            }           
            if(noCommas[i].contains("ASTR"))
            {
                NaturalClasses.add(noCommas[i]);
            } 
            if(noCommas[i].contains("BIOL"))
            {
                NaturalClasses.add(noCommas[i]);
            }      
            if(noCommas[i].contains("CHEM"))
            {
                NaturalClasses.add(noCommas[i]);
            }  
            if(noCommas[i].contains("EEES"))
            {
                NaturalClasses.add(noCommas[i]);
            }          
            if(noCommas[i].contains("PHYS"))
            {
                NaturalClasses.add(noCommas[i]);
            }   
            if(noCommas[i].contains("ANTH"))
            {
                SocialClasses.add(noCommas[i]);
            }     
            if(noCommas[i].contains("ECON"))
            {
                SocialClasses.add(noCommas[i]);
            }  
            if(noCommas[i].contains("GEPL"))
            {
                SocialClasses.add(noCommas[i]);
            } 
            if(noCommas[i].contains("PSC"))
            {
                SocialClasses.add(noCommas[i]);
            } 
            if(noCommas[i].contains("PSY"))
            {
                SocialClasses.add(noCommas[i]);
            }  
            if(noCommas[i].contains("SOCW"))
            {
                SocialClasses.add(noCommas[i]);
            }  
            if(noCommas[i].contains("SOC"))
            {
                SocialClasses.add(noCommas[i]);
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
       System.out.println("total natural science credits out of 4 required: " + Natural(NaturalClasses, NaturalList));
       System.out.println("                             ");
       System.out.println("total proffesional development credits out of 6 required: " + Buad(BuadClasses, BuadList));
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
     
    public static int CsetElect(List CsetElectClasses, HashMap CsetElectList)
    {
        List<String> takenCsetElect = new ArrayList<String>();
        List<String> notTakenCsetElect = new ArrayList<String>();
        Arrays.toString(CsetElectClasses.toArray());
        List<String> CsetElectCourseName = new ArrayList<String>(CsetElectList.keySet());
        List<Integer> CsetElectCourseCredit = new ArrayList<Integer>(CsetElectList.values());
        
        String[] courseName = new String[CsetElectCourseName.size()];
        courseName = CsetElectCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[CsetElectCourseCredit.size()];
        credit = CsetElectCourseCredit.toArray(credit);
        
        int CsetElectCredits = 0;
  
        for (int j=0; j<courseName.length;j++)
        {
             
            if(CsetElectClasses.contains(courseName[j]))
            {     
                takenCsetElect.add(courseName[j]);
                CsetElectCredits = CsetElectCredits + credit[j];
            } 
            else if (CsetElectCredits < 7)
            {               
                notTakenCsetElect.add(courseName[j]);
            }    
        }    
        
        System.out.println("CSET Elect Classes you have taken: ");
        System.out.println(Arrays.toString(takenCsetElect.toArray()));
        
        System.out.println("Must take at least two COMM elective class: ");
        System.out.println(Arrays.toString(notTakenCsetElect.toArray()));   
        
        return CsetElectCredits;
    }    
   
    public static int Buad(List BuadClasses, HashMap BuadList)
    {
        List<String> takenBuad = new ArrayList<String>();
        List<String> notTakenBuad = new ArrayList<String>();
        Arrays.toString(BuadClasses.toArray());
        List<String> BuadCourseName = new ArrayList<String>(BuadList.keySet());
        List<Integer> BuadCourseCredit = new ArrayList<Integer>(BuadList.values());
        
        String[] courseName = new String[BuadCourseName.size()];
        courseName = BuadCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[BuadCourseCredit.size()];
        credit = BuadCourseCredit.toArray(credit);
        
        int BuadCredits = 0;
  
        for (int j=0; j<courseName.length;j++)
        {
             
            if(BuadClasses.contains(courseName[j]))
            {     
                takenBuad.add(courseName[j]);
                BuadCredits = BuadCredits + credit[j];
            } 
            else if (BuadCredits < 6)
            {               
                notTakenBuad.add(courseName[j]);
            }    
        }    
        
        System.out.println("Buad Elect Classes you have taken: ");
        System.out.println(Arrays.toString(takenBuad.toArray()));
        
        System.out.println("Must take at least two Buad class: ");
        System.out.println(Arrays.toString(notTakenBuad.toArray()));   
        
        return BuadCredits;
        
    }    
    
    
    
        public static int Natural(List NaturalClasses, HashMap NaturalList)
    {
        List<String> takenNatural = new ArrayList<String>();
        List<String> notTakenNatural = new ArrayList<String>();
        Arrays.toString(NaturalClasses.toArray());
        List<String> NaturalCourseName = new ArrayList<String>(NaturalList.keySet());
        List<Integer> NaturalCourseCredit = new ArrayList<Integer>(NaturalList.values());
        
        String[] courseName = new String[NaturalCourseName.size()];
        courseName = NaturalCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[NaturalCourseCredit.size()];
        credit = NaturalCourseCredit.toArray(credit);
        
        int NaturalCredits = 0;
  
        for (int j=0; j<courseName.length;j++)
        {
             
            if(NaturalClasses.contains(courseName[j]))
            {     
                takenNatural.add(courseName[j]);
                NaturalCredits = NaturalCredits + credit[j];
            } 
            else if (NaturalCredits < 4)
            {               
                notTakenNatural.add(courseName[j]);
            }    
        }    
        
        System.out.println("Natural Science Classes you have taken: ");
        System.out.println(Arrays.toString(takenNatural.toArray()));
        
        System.out.println("Must take at least one Natural Science class: ");
        System.out.println(Arrays.toString(notTakenNatural.toArray()));   
        
        return NaturalCredits;
        
    }    
        
        public static int Social(List SocialClasses, HashMap SocialList)
    {
        List<String> takenSocial = new ArrayList<String>();
        List<String> notTakenSocial = new ArrayList<String>();
        Arrays.toString(SocialClasses.toArray());
        List<String> SocialCourseName = new ArrayList<String>(SocialList.keySet());
        List<Integer> SocialCourseCredit = new ArrayList<Integer>(SocialList.values());
        
        String[] courseName = new String[SocialCourseName.size()];
        courseName = SocialCourseName.toArray(courseName);
        
        Integer [] credit = new Integer[SocialCourseCredit.size()];
        credit = SocialCourseCredit.toArray(credit);
        
        int SocialCredits = 0;
  
        for (int j=0; j<courseName.length;j++)
        {
             
            if(SocialClasses.contains(courseName[j]))
            {     
                takenSocial.add(courseName[j]);
                SocialCredits = SocialCredits + credit[j];
            } 
            else if (SocialCredits < 3)
            {               
                notTakenSocial.add(courseName[j]);
            }    
        }    
        
        System.out.println("Social Science Classes you have taken: ");
        System.out.println(Arrays.toString(takenSocial.toArray()));
        
        System.out.println("Must take at least one Social Science class: ");
        System.out.println(Arrays.toString(notTakenSocial.toArray()));   
        
        return SocialCredits;
        
    }            
 public static void FinalOut ()
    {
        System.out.println("-----------------");       
    }
}

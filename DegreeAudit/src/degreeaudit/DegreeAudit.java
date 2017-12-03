

package degreeaudit;

import java.util.HashMap;
import java.lang.String;
import java.lang.*;
import java.util.List;


import java.util.ArrayList;
public class DegreeAudit {
    
        public static void main(String[] args)
    {
        InputWindow InWindow = new InputWindow("eg: cset1000, cset1100, cset1200",""); //the first string is what start text to be displayed and the 2nd one is any error output
        InWindow.setVisible(true);
    }
    
    public static void Next(HashMap<String,Integer> intOut, HashMap<String,List<String>> strOut, String orig,List<String> invalid){
        
    if (!invalid.isEmpty()){
        InputWindow InWindow = new InputWindow(orig,"invalid corse(s): "+String.join(",",invalid));
        InWindow.setVisible(true);
    } else {
        OutputWindow OutWindow = new OutputWindow(intOut, strOut,orig);
        OutWindow.setVisible(true);
    }
    
}
    
    
    public static HashMap<String, Object> run(String[] args) {
        String courseInput = args[0];
        
        //get rid of the spaces and make it to an array separating it at the commas
        String noSpaces = courseInput.toUpperCase().replaceAll("\\s+","");
        String[] noCommas = noSpaces.split(",");
        
        //initializing the hashmaps with the appropriate classes and credit values
        List<String> CsetClasses = new ArrayList<>();
        List<String> EetClasses = new ArrayList<>();
        List<String> EngtClasses = new ArrayList<>();
        List<String> MathandPhysClasses = new ArrayList<>();
        List<String> CommClasses = new ArrayList<>();
        List<String> CsetElectClasses = new ArrayList<>();
        List<String> BuadClasses = new ArrayList<>();
        List<String> NaturalClasses = new ArrayList<>();
        List<String> SocialClasses = new ArrayList<>();   
        List<String> HumanityClasses = new ArrayList<>();
        
        //the arrays of all the course names
        HashMap<String, Integer> CsetList = new HashMap<>();
            CsetList.put ("CSET1100", 4);
            CsetList.put ("CSET1200", 3);
            CsetList.put ("CSET2230", 4);
            CsetList.put ("CSET2220", 4);
            CsetList.put ("CSET3150", 4);
            CsetList.put ("CSET3300", 4);
            CsetList.put ("CSET3600", 4);
            CsetList.put ("CSET4750", 4);
            CsetList.put ("CSET4250", 4);
            CsetList.put ("EECS2520", 4);
            //electives
            CsetList.put ("CSET3100", 3);
            CsetList.put ("CSET3200", 3);
            CsetList.put ("CSET3250", 3);
            CsetList.put ("CSET3400", 3);
            CsetList.put ("CSET4150", 3);
            CsetList.put ("CSET4200", 4);
            CsetList.put ("CSET4650", 4);
            CsetList.put ("CSET4850", 4);
            

        HashMap<String, Integer> EetList = new HashMap<>();
            EetList.put ("EET2420", 1);
            EetList.put ("EET2210", 4);
            EetList.put ("EET2410", 4);
            EetList.put ("EET3350", 4);
            
        HashMap<String, Integer> EngtList = new HashMap<>();
            EngtList.put ("ENGT1000", 1);
            EngtList.put ("ENGT2000", 1);
            EngtList.put ("ENGT3050", 4);
            EngtList.put ("ENGT3010", 4);
            EngtList.put ("ENGT4050", 3);
            
        HashMap<String, Integer> MathandPhysList = new HashMap<>();
            MathandPhysList.put ("PHYS2010", 5);
            MathandPhysList.put ("PHYS2020", 5);
            MathandPhysList.put ("MATH2450", 4);
            MathandPhysList.put ("MATH2460", 4);
            MathandPhysList.put ("MATH2890", 3);
            
        HashMap<String, Integer> NaturalList = new HashMap<>();
            NaturalList.put ("KINE", 4);
            NaturalList.put ("ASTR", 4);
            NaturalList.put ("BIOL", 4);
            NaturalList.put ("CHEM", 4);
            NaturalList.put ("EEES", 4);
            NaturalList.put ("PHYS", 4);
            
        HashMap<String, Integer> CsetElectList3 = new HashMap<>();
            CsetElectList3.put ("CSET3100", 3);
            CsetElectList3.put ("CSET3200", 3);
            CsetElectList3.put ("CSET3250", 3);
            CsetElectList3.put ("CSET3400", 3);
            CsetElectList3.put ("CSET4150", 3);
            
        HashMap<String, Integer> CsetElectList4 = new HashMap<>();
            CsetElectList4.put ("CSET4200", 4);
            CsetElectList4.put ("CSET4650", 4);
            CsetElectList4.put ("CSET4850", 4);
            
        HashMap<String, Integer> CommList = new HashMap<>();
            CommList.put ("COMM2600", 3);
            CommList.put ("COMM2820", 3);
            CommList.put ("COMM2840", 3);


        HashMap<String, Integer> BuadList = new HashMap<>();
            BuadList.put ("BUAD2040", 3);
            BuadList.put ("BUAD2050", 3);
            BuadList.put ("BAUD2080", 3);
            BuadList.put ("BUAD3010", 3);
            BuadList.put ("BUAD3020", 3);
            BuadList.put ("BUAD3030", 3);
            BuadList.put ("BUAD3040", 3);
            BuadList.put ("BAUD3470", 3);
            BuadList.put ("FINA3060", 3);
            
        HashMap<String, Integer> SocialList = new HashMap<>();
            SocialList.put ("ANTH", 3);
            SocialList.put ("ECON", 3);
            SocialList.put ("GEPL", 3);
            SocialList.put ("PSC",  3);
            SocialList.put ("PSY",  3);
            SocialList.put ("SOCW", 3);
            SocialList.put ("SOC",  3);
  
        HashMap<String, Integer> HumanityList = new HashMap<>();
            HumanityList.put ("ANTH", 3);
            HumanityList.put ("CLC",  3);
            HumanityList.put ("COMM", 3);
            HumanityList.put ("ENGL", 3);
            HumanityList.put ("FREN", 3);
            HumanityList.put ("GERM", 3);
            HumanityList.put ("HIST", 3);
            HumanityList.put ("HUM",  3);
            HumanityList.put ("JAPN", 3);
            HumanityList.put ("MUS",  3);
            HumanityList.put ("PHIL", 3);
            HumanityList.put ("RUS",  3);
            HumanityList.put ("SPAN", 3);
            HumanityList.put ("THR",  3);    
            
        
        //Getting the list of classes and ID numbers that have already been taken       
        List<String> invalid = new ArrayList<>();
        
        for (int i=0; i<noCommas.length;i++){
            
            if(noCommas[i].contains("CSET")||noCommas[i].contains("EECS")){
                CsetClasses.add(noCommas[i]);
                
            }
            else if(noCommas[i].contains("EET")){
                EetClasses.add(noCommas[i]);
            }
            else if(noCommas[i].contains("ENGT")){
                EngtClasses.add(noCommas[i]);
            }
            else if(noCommas[i].contains("MATH")||noCommas[i].contains("PHYS")){
                MathandPhysClasses.add(noCommas[i]);
            }
            else if(noCommas[i].contains("COMM")){
                CommClasses.add(noCommas[i]);
            }
            else if(noCommas[i].contains("BUAD")||noCommas[i].contains("FINA")){
                BuadClasses.add(noCommas[i]);
            }
            else {
                invalid.add(noCommas[i]);
                System.out.println(noCommas[i]+" is not a valid course");
            }
            
       }
        
        //setting local variables to the return of classes
        //classes in other files called appropriatly
        List<String> csetAll = Cset.Cset(CsetClasses, CsetList, CsetElectList3, CsetElectList4);
        List<String> eetAll = Eet.Eet(EetClasses, EetList);
        List<String> engtAll = Engt.Engt(EngtClasses, EngtList);
        List<String> mathandphysAll = MathandPhys.MathandPhys(MathandPhysClasses, MathandPhysList);
        List<String> commAll = Comm.Comm(CommClasses, CommList);
        List<String> buadAll = Buad.Buad(BuadClasses, BuadList);
        

        int csetCredits = Integer.valueOf(csetAll.get(csetAll.size() - 1));
        int eetCredits = Integer.valueOf(eetAll.get(eetAll.size() - 1));
        int engtCredits = Integer.valueOf(engtAll.get(engtAll.size() - 1));
        int mathandphysCredits = Integer.valueOf(mathandphysAll.get(mathandphysAll.size() - 1));
        int commCredits = Integer.valueOf(commAll.get(commAll.size() - 1));
        int buadCredits = Integer.valueOf(buadAll.get(buadAll.size() - 1));
        
        int totalCredits = csetCredits + eetCredits +engtCredits+mathandphysCredits+commCredits+buadCredits;
        
       HashMap<String, Integer> classOut = new HashMap<>();
       classOut.put("CSET",csetCredits);
       classOut.put("EET",eetCredits);
       classOut.put("ENGT",engtCredits);
       classOut.put("MATH",mathandphysCredits);
       classOut.put("COMM",commCredits);
       classOut.put("buad",buadCredits);
       classOut.put("totalCreds",totalCredits);
       
       HashMap<String, List<String>> strOut = new HashMap<>();
       strOut.put("csetAll", csetAll);
       strOut.put("eetAll", eetAll);
       strOut.put("engtAll", engtAll);
       strOut.put("mathAll", mathandphysAll);
       strOut.put("commAll", commAll);
       strOut.put("buadAll", buadAll);
       
       HashMap<String, Object> finalOut = new HashMap<>();
       finalOut.putAll(classOut);
       finalOut.putAll(strOut);
       
       
       
       System.out.println("total CSET credits: "+csetCredits);
       System.out.println("total EET credits: "+eetCredits);
       System.out.println("total ENGT credits: "+engtCredits);
       System.out.println("total MATH and PHYS credits: "+mathandphysCredits);
       System.out.println("total COMM credits: "+commCredits);
       System.out.println("total Professional Development credits: "+buadCredits);
       System.out.println("TOTAL CREDITS TAKEN: "+totalCredits);
       
       if(totalCredits >=128){
           System.out.println("CONGRATULATIONS YOU'RE READY TO GRADUATE!");
       }
       else{
           System.out.println("You need to complete "+ (128-totalCredits)+" credits to graduate.");
       }
    Next(classOut,strOut,courseInput,invalid);
    
    return finalOut;
    }
}
 
   






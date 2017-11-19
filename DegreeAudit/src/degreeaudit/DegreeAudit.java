

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
    	
        //Creating instances of classes

        
        //Get the input of classes
    	System.out.println("Input all of the classes you've taken, separated by a comma:");
        String courseInput = input.nextLine();
        
        //get rid of the spaces and make it to an array separating it at the commas
        String noSpaces = courseInput.toUpperCase().replaceAll("\\s+","");
        String[] noCommas = noSpaces.split(",");
        
        //initializing the hashmaps with the appropriate classes and credit values
        List<String> CsetClasses = new ArrayList<String>();
        List<String> EetClasses = new ArrayList<String>();
        List<String> EngtClasses = new ArrayList<String>();
        List<String> MathandPhysClasses = new ArrayList<String>();
        List<String> CommClasses = new ArrayList<String>();
        List<String> CsetElectClasses = new ArrayList<String>();
        List<String> BuadClasses = new ArrayList<String>();
        List<String> NaturalClasses = new ArrayList<String>();
        List<String> SocialClasses = new ArrayList<String>();   
        List<String> HumanityClasses = new ArrayList<String>();
        
        //the arrays of all the course names
        HashMap<String, Integer> CsetList = new HashMap<String, Integer>();
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
            

        HashMap<String, Integer> EetList = new HashMap<String, Integer>();
            EetList.put ("EET2420", 1);
            EetList.put ("EET2210", 4);
            EetList.put ("EET2410", 4);
            EetList.put ("EET3350", 4);
            
        HashMap<String, Integer> EngtList = new HashMap<String, Integer>();
            EngtList.put ("ENGT1000", 1);
            EngtList.put ("ENGT2000", 1);
            EngtList.put ("ENGT3050", 4);
            EngtList.put ("ENGT3010", 4);
            EngtList.put ("ENGT4050", 3);
            
        HashMap<String, Integer> MathandPhysList = new HashMap<String, Integer>();
            MathandPhysList.put ("PHYS2010", 5);
            MathandPhysList.put ("PHYS2020", 5);
            MathandPhysList.put ("MATH2450", 4);
            MathandPhysList.put ("MATH2460", 4);
            MathandPhysList.put ("MATH2890", 3);
            
        HashMap<String, Integer> NaturalList = new HashMap<String, Integer>();
            NaturalList.put ("KINE", 4);
            NaturalList.put ("ASTR", 4);
            NaturalList.put ("BIOL", 4);
            NaturalList.put ("CHEM", 4);
            NaturalList.put ("EEES", 4);
            NaturalList.put ("PHYS", 4);
            
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
  
        HashMap<String, Integer> HumanityList = new HashMap<String, Integer>();
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
        for (int i=0; i<noCommas.length;i++){
            
            if(noCommas[i].contains("CSET")||noCommas[i].contains("CSET")){
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
            else {
                System.out.println(noCommas[i]+" is not a valid course");
            }
       }
        
        //setting local variables to the return of classes
        //classes in other files called appropriatly
        int csetCredits = Cset.Cset(CsetClasses, CsetList, CsetElectList);
        int eetCredits = Eet.Eet(EetClasses, EetList);
        int engtCredits = Engt.Engt(EngtClasses, EngtList);
        int mathandphysCredits = MathandPhys.MathandPhys(MathandPhysClasses, MathandPhysList);
        int totalCredits = csetCredits + eetCredits +engtCredits+mathandphysCredits;
        
        
        FinalOut();
       System.out.println("total cset credits: "+csetCredits);
       System.out.println("total eet credits: "+eetCredits);
       System.out.println("total ENGT credits: "+engtCredits);
       System.out.println("total MATH and PHYS credits: "+mathandphysCredits);
       FinalOut();
       System.out.println("TOTAL CREDITS TAKEN: "+totalCredits);
       
       if(totalCredits >=128){
           System.out.println("CONGRATULATIONS YOU'RE READY TO GRADUATE!");
       }
       else{
           System.out.println("You need to complete "+ (128-totalCredits)+" credits to graduate.");
       }     
}   
 
    
    public static void FinalOut(){
        System.out.println("-----------------");
        
    }
}






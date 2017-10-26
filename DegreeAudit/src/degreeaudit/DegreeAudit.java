/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degreeaudit;
import java.util.ArrayList;

//class template to hold the curriculum information 
class ClassInfo { 
    String Name;
    int CorseId;
    int[] pre;  // pre = prerequisites
    int hours;
    
    public ClassInfo(String Names,int Ids, int[] pres,int credits) {
        //copy vars to the main object
        Name = Names;
        CorseId = Ids;
        pre = pres;
        hours = credits;
   }
}
   
public class DegreeAudit {
    public static void main(String[] args) {
        //Huge List O' Curriculum
        //ClassInfo NAME = new ClassInfo("NAME", 0000, new int[]{} , 0);
        ClassInfo CSET1100 = new ClassInfo("Intro to CSET", 1100,new int[]{1100}, 4);
        ClassInfo EET2420  = new ClassInfo("Instrumentation Laboratory", 2420,new int[]{} , 1);
        ClassInfo PHIL1010 = new ClassInfo("Introduction to Logic", 1010, new int[]{}, 3);
        ClassInfo ENGT1000 = new ClassInfo("Introduction to Engineering Technology", 1000, new int[]{} , 1);
        ClassInfo ENGL1110 = new ClassInfo("NAME", 0000, new int[]{} , 0);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelterdatabase;

/**
 *
 * @author Ciaran
 */
public class Medical {
    private int ResidentID;
    private String Bloodtype;
    private String Weight;
    private String Height;
    private String Allergies;
    private String Conditions;
    private String Heartrisk;
    private String Diabetus;
    private String Medication;
    private String Specialreq;
    private String Disability;
    private String History;
    private String Notes;
    
    public Medical (int rid, String bt, String w, String h, String all, String con, String hrt, String d, String m, String s, String dis, String hist, String notes)
    {
        this.ResidentID = rid;
        this.Bloodtype = bt;
        this.Weight = w;
        this.Height = h;
        this.Allergies = all;
        this.Conditions = con;
        this.Heartrisk = hrt;
        this.Diabetus = d;
        this.Medication = m;
        this.Specialreq = s;
        this.Disability = dis;
        this.History = hist;
        this.Notes = notes;
    }
public int getresidentid(){return ResidentID;}
public String getbloodtype(){return Bloodtype;}
public String getweight(){return Weight;}
public String getheight(){return Height;}
public String getallergies(){return Allergies;}
public String getconditions(){return Conditions;}
public String getheartrisk(){return Heartrisk;}
public String getdiabetus(){return Diabetus;}
public String getmedication(){return Medication;}
public String getspecialreq(){return Specialreq;}
public String getdisability(){return Disability;}
public String gethistory(){return History;}
public String getnotes(){return Notes;}

    
}

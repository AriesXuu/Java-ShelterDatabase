/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelterdatabase;

/**
 *
 * @author new user
 */
public class Resident {
    private int ResidentID;
    private String Fname;
    private String Sname;
    private String DOB;
    private String Gender;
    private String Language;
    private String Nationality;
    private String Religion;
    private byte[] picture;
    
    public Resident (int rid, String fn, String sn, String dob, String Gend, String Lang, String Nation, String Rel,byte[] rimg)
    {
        this.ResidentID = rid;
        this.Fname = fn;
        this.Sname = sn;
        this.DOB = dob;
        this.Gender = Gend;
        this.Language = Lang;
        this.Nationality = Nation;
        this.Religion = Rel;
        this.picture = rimg;
    }
public int getresidentid(){return ResidentID;}
public String getfname(){return Fname;}
public String getsname(){return Sname;}
public String getdob(){return DOB;}
public String getgender(){return Gender;}
public String getlanguage(){return Language;}
public String getnationality(){return Nationality;}
public String getreligion(){return Religion;}
 public byte[] getImage()
    {
    return picture;
    }
}

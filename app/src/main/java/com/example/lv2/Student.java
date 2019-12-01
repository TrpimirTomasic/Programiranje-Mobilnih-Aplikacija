package com.example.lv2;

public class Student {

    private String sIme;
    private String sPrezime;
    private String sPredmet;

    public Student(String ime, String prezime, String predmet)
    {
        sIme = ime;
        sPrezime = prezime;
        sPredmet = predmet;
    }

    public String getIme()
    {
        return sIme;
    }

    public String getPrezime()
    {
        return sPrezime;
    }

    public String getPredmet()
    {
        return sPredmet;
    }
}

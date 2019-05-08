package inleveropdracht1;

import java.util.Date;

public class Reiziger {

    private String naam;
    private Date gbdatum;

    public Reiziger (String nm, Date gbdm) {
        naam = nm;
        gbdatum = gbdm;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String nm) {
        naam = nm;
    }

    public Date getGbdatum() {
        return gbdatum;
    }

    public void setGbdatum(Date gbdm) {
        gbdatum = gbdm;
    }
}

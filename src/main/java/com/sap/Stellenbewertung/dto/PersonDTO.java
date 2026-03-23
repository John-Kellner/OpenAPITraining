package com.sap.Stellenbewertung.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable {
    private Long id;
    private String vorname;
    private String nachname;
    private String abteilungsID;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAbteilungsID() {
        return abteilungsID;
    }

    public void setAbteilungsID(String abteilungsID) {
        this.abteilungsID = abteilungsID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

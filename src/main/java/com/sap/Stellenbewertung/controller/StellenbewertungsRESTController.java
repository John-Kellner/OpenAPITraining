package com.sap.Stellenbewertung.controller;

import com.sap.Stellenbewertung.dto.OrgDataDTO;
import com.sap.Stellenbewertung.dto.PersonDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StellenbewertungsRESTController {

    @GetMapping(path = "/person/{id}")
    public PersonDTO readPerson(@PathVariable("id") Long id){

        //Platzhalter DB - wird aus der DB gelesen
        final PersonDTO personDTO = new PersonDTO();
        personDTO.setId(342L);
        personDTO.setNachname("Sahin");
        personDTO.setVorname("Selma");
        personDTO.setAbteilungsID("IT321");
        return personDTO;
    }


    @PostMapping(path = "/orgdata")
    public ResponseEntity<String> orgdata(OrgDataDTO orgDataDTO){

        // erhalten und in der DB speichern

        return ResponseEntity.ok().build();
    }
}

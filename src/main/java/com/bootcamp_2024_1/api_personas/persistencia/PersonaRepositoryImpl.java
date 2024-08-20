package com.bootcamp_2024_1.api_personas.persistencia;

import com.bootcamp_2024_1.api_personas.dto.PersonaDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonaRepositoryImpl {

    private ArrayList<PersonaDto> baseDatos;

    public PersonaRepositoryImpl() {
        this.baseDatos = new ArrayList<>();
    }

    public List<PersonaDto> obtenerPersonas(){
        return this.baseDatos;
    }

    public PersonaDto crearPersona(PersonaDto persona){
        this.baseDatos.add(persona);
        return persona;
    }
}

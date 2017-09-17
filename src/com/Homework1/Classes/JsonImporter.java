package com.Homework1.Classes;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonImporter extends Importer {

    ObjectMapper mapper = new ObjectMapper();

    public JsonImporter(String name, String description) {
        super(name, description);
    }

    @Override
    public List<Person> Read(String filename)
    {
        filename = AppendExtension(filename, ".json");
        try{
            List<Person> people = mapper.readValue(new File(filename), new TypeReference<List<Person>>(){} );
            return people;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
}

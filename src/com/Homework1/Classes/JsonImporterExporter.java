package com.Homework1.Classes;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonImporterExporter extends ImporterExporter {

    ObjectMapper mapper = new ObjectMapper();

    public JsonImporterExporter(String name, String description) {
        super(name, description);
    }

    @Override
    public void Write(List<Person> data, String filename)
    {
        try {
            if(filename.isEmpty()){
                StringBuilder output = new StringBuilder();
                for (Person p : data) {
                    output.append("Match:\n").append(p);
                }
                System.out.println(output);
            }else {
                mapper.writeValue(new File(filename), data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
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

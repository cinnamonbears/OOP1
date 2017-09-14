package com.Homework1.Classes;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLImporterExporter extends ImporterExporter {

    public XMLImporterExporter(String name, String description) {
        super(name, description);
    }

    @Override
    public void Write(List<Person> data, String filename) {
        if (filename.isEmpty()) {
            StringBuilder output = new StringBuilder();
            for (Person p : data) {
                output.append("Match:\n").append(p);
            }
            System.out.println(output);
        } else {
            System.out.println("Do something"); //TODO: write this method
            //mapper.writeValue(new File(filename), data);
        }
    }

    @Override
    public List<Person> Read(String filename) {
        filename = AppendExtension(filename, ".xml");
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(PersonCollection.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            PersonCollection people = (PersonCollection) jaxbUnmarshaller.unmarshal(new File(filename));
            return people.getPeople();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.Homework1.Classes;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XMLImporter extends Importer {

    public XMLImporter(String name, String description) {
        super(name, description);
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

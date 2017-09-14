package com.Homework1.Classes;

import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ArrayOfPerson")
public class PersonCollection {

    @XmlElement(name="Person")
    private List<Person> people = new ArrayList<>();
    public ImporterExporter myImporterExporter;
    public String myDataFile;
    public MatchingAlgorithm myAlgorithm;
    public DisplayMatches myDisplay;

    public ImporterExporter getMyImporterExporter() {
        return myImporterExporter;
    }

    public void setMyImporterExporter(ImporterExporter myImporterExporter) {
        this.myImporterExporter = myImporterExporter;
    }

    public String getMyDataFile() {
        return myDataFile;
    }

    public void setMyDataFile(String myDataFile) {
        this.myDataFile = myDataFile;
    }

    public List<Person> Read(){
        return myImporterExporter.Read(myDataFile);
    }

    public void Write(List<MatchPair> matches, String saveLocation){ myDisplay.Write(matches, saveLocation); }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<MatchPair> Matches(){ return myAlgorithm.Matches(people); }

    public MatchingAlgorithm getMyAlgorithm() { return myAlgorithm; }

    public void setMyAlgorithm(MatchingAlgorithm myAlgorithm) { this.myAlgorithm = myAlgorithm; }
}

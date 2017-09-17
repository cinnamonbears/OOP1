package com.Homework1.Classes;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ArrayOfPerson")
public class PersonCollection {

    @XmlElement(name="Person")
    private List<Person> people = new ArrayList<>();
    private List<MatchPair> myMatches = new ArrayList<>();
    private Importer myImporterExporter;
    private String myDataFile;
    private MatchingAlgorithm myAlgorithm;
    private DisplayMatches myDisplay;

    public void setMyImporterExporter(Importer myImporterExporter) { this.myImporterExporter = myImporterExporter; }

    public void setMyDataFile(String myDataFile) { this.myDataFile = myDataFile; }

    public List<Person> getPeople() { return people; }

    public void setPeople(List<Person> people) { this.people = people; }

    public void setMyMatches(List<MatchPair> myMatches) { this.myMatches = myMatches; }

    public void setMyAlgorithm(MatchingAlgorithm myAlgorithm) { this.myAlgorithm = myAlgorithm; }

    public void setMyDisplay(DisplayMatches myDisplay) { this.myDisplay = myDisplay; }

    public List<Person> Read(){ return myImporterExporter.Read(myDataFile); }

    public void Write(String saveLocation){ myDisplay.Write(myMatches, saveLocation); }

    public List<MatchPair> Matches(){ return myAlgorithm.Matches(people); }
}

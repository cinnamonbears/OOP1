package com.Homework1;

import com.Homework1.Classes.*;

public class Main {

    private static final MatchingAlgorithm[] algorithmTypes = {
            new MatchingAlgorithm1("1"),
            new MatchingAlgorithm2("2"),
            new MatchingAlgorithm3("3")
    };

    private static final Importer[] importerExporters ={
        new JsonImporter("json", "Json representation"),
        new XMLImporter("xml", "Json representation")
    };

    private static final DisplayMatches[] displayMatches = {
            new DisplayMatchesConsole(""),
            new DisplayMatchesTxt(".txt")

    };

    private static Boolean validateFileType(String type) {
        for (Importer ies : importerExporters) {
            if (type.contains(ies.getName()) && ies != null) {
                return true;
            }
        }
        StringBuilder errorString = new StringBuilder();
        errorString.append("The File Type must be either");
        for (Importer ies : importerExporters) {
            errorString.append(" ").append(ies.getName());
            errorString.append(" or");
        }
        errorString.setLength(errorString.length() - 3);
        System.out.println(errorString);
        return false;
    }

    private static Boolean validateAlgorithmSelection(String type){
        for (MatchingAlgorithm algorithm : algorithmTypes) {
            if (type.toLowerCase().equals(algorithm.getName().toLowerCase()) && algorithm != null) {
                return true;
            }
        }
        StringBuilder errorString = new StringBuilder();
        errorString.append("The Algorithm Type must be either");
        for (MatchingAlgorithm algorithm : algorithmTypes) {
            errorString.append(" ").append(algorithm.getName());
            errorString.append(" or");
        }
        errorString.setLength(errorString.length() - 3);
        System.out.println(errorString);
        return false;
    }

    private static String validateSaveLocation(String destination){
        if(destination.isEmpty()){
            return "";
        }else{
            if(destination.endsWith(".txt")){
                return destination;
            }else{
                return destination.concat(".txt");
            }
        }
    }

    public static Importer GetFileFormat(String fileType){
        Importer result = null;
        while(result == null){
            for (Importer ies: importerExporters) {
                if(fileType.toLowerCase().endsWith(ies.getName().toLowerCase())){
                    return ies;
                }
            }
        }
        return result;
    }

    public static MatchingAlgorithm GetMatchingAlgorithm(String algorithm){
        MatchingAlgorithm result = null;
        while(result == null){
            for(MatchingAlgorithm ma : algorithmTypes){
                if(algorithm.toLowerCase().equals(ma.getName())){
                    return ma;
                }
            }
        }
        return result;
    }

    public static DisplayMatches GetDisplayType(String file){
        DisplayMatches result = displayMatches[0];
        if(file.endsWith(".txt")){
            return displayMatches[1];
        }
        return displayMatches[0];
    }

    public static void main(String[] args) {
        String saveLocation = "";
        PersonCollection myPeople = new PersonCollection();

        for (int i = 0; i < args.length; ++i) {
            if(i == 0){
                if(!validateAlgorithmSelection(args[i])){ return; }
                myPeople.setMyAlgorithm(GetMatchingAlgorithm(args[i]));
            }
            if(i == 1) {
                if(!validateFileType(args[i])){ return; }
                myPeople.setMyImporterExporter(GetFileFormat(args[i]));
                myPeople.setMyDataFile(args[i]);
            }
            if(i == 2){
                saveLocation = validateSaveLocation(args[i]);
            }
        }
        myPeople.setMyDisplay(GetDisplayType(saveLocation));
        myPeople.setPeople(myPeople.Read());
        myPeople.setMyMatches(myPeople.Matches());
        myPeople.Write(saveLocation);
    }
}

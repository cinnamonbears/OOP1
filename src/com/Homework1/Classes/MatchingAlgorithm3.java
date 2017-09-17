package com.Homework1.Classes;

import java.util.ArrayList;
import java.util.List;

public class MatchingAlgorithm3 extends MatchingAlgorithm {

    public MatchingAlgorithm3(String name) {
        super(name);
    }

    @Override
    public List<MatchPair> Matches(List<Person> allPeople) {
        List<MatchPair> myMatches = new ArrayList<>();
        for (int i = 0; i < allPeople.size(); ++i) {
            for (int j = i + 1; j < allPeople.size(); ++j) {
                if (CheckValuesString(allPeople.get(i).getStateFileNumber(), allPeople.get(j).getStateFileNumber())
                        && CheckValuesString(allPeople.get(i).getSocialSecurityNumber(), allPeople.get(j).getSocialSecurityNumber())
                        && CheckValuesInteger(allPeople.get(i).getBirthOrder(), allPeople.get(j).getBirthOrder())
                        && CheckValuesString(allPeople.get(i).getNewbornScreeningNumber(), allPeople.get(j).getNewbornScreeningNumber())
                        && CheckValuesString(allPeople.get(i).getFirstName(), allPeople.get(j).getFirstName())
                        && CheckValuesInteger(allPeople.get(i).getBirthYear(), allPeople.get(j).getBirthYear())
                        ) {
                    myMatches.add(new MatchPair(allPeople.get(i), allPeople.get(j)));
                }
            }
        }
        return myMatches;
    }
}

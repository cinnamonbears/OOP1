package com.Homework1.Classes;

import java.util.ArrayList;
import java.util.List;

public class MatchingAlgorithm2 extends MatchingAlgorithm {

    public MatchingAlgorithm2(String name) {
        super(name);
    }

    @Override
    public List<MatchPair> Matches(List<Person> allPeople) {
        List<MatchPair> myMatches = new ArrayList<>();
        for (int i = 0; i < allPeople.size(); ++i) {
            for (int j = i + 1; j < allPeople.size(); ++j) {
                if (CheckValuesString(allPeople.get(i).getMotherFirstName(), allPeople.get(j).getMotherFirstName())
                        && CheckValuesString(allPeople.get(i).getMotherMiddleName(), allPeople.get(j).getMotherMiddleName())
                        && CheckValuesString(allPeople.get(i).getMotherLastName(), allPeople.get(j).getMotherLastName())
                        && CheckValuesInteger(allPeople.get(i).getBirthDay(), allPeople.get(j).getBirthDay())
                        && CheckValuesInteger(allPeople.get(i).getBirthMonth(), allPeople.get(j).getBirthMonth())
                        && CheckValuesInteger(allPeople.get(i).getBirthYear(), allPeople.get(j).getBirthYear())
                        ) {
                    myMatches.add(new MatchPair(allPeople.get(i), allPeople.get(j)));
                }
            }
        }
        return myMatches;
    }
}

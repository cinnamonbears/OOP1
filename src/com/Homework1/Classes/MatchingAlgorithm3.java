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
            for (int j = i + 1; j < allPeople.size() - 1; ++j) {
                if (CheckValues(allPeople.get(i).getStateFileNumber(), allPeople.get(j).getStateFileNumber())
                        && CheckValues(allPeople.get(i).getSocialSecurityNumber(), allPeople.get(j).getSocialSecurityNumber())
                        && CheckValues(allPeople.get(i).getBirthOrder().toString(), allPeople.get(j).getBirthOrder().toString())
                        && CheckValues(allPeople.get(i).getNewbornScreeningNumber(), allPeople.get(j).getNewbornScreeningNumber())
                        && CheckValues(allPeople.get(i).getFirstName(), allPeople.get(j).getFirstName())
                        && CheckValues(allPeople.get(i).getBirthYear().toString(), allPeople.get(j).getBirthYear().toString())
                        ) {
                    myMatches.add(new MatchPair(allPeople.get(i), allPeople.get(j)));
                }
            }
        }
        System.out.println(myMatches);
        return myMatches;
    }
}

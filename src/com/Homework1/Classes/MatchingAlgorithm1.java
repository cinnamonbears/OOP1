package com.Homework1.Classes;

import java.util.ArrayList;
import java.util.List;

public class MatchingAlgorithm1 extends MatchingAlgorithm {

    public MatchingAlgorithm1(String name) {
        super(name);
    }

    @Override
    public List<MatchPair> Matches(List<Person> allPeople) {
        List<MatchPair> myMatches = new ArrayList<>();
        for (int i = 0; i < allPeople.size(); ++i) {
            for (int j = i + 1; j < allPeople.size() - 1; ++j) {
                if (CheckValues(allPeople.get(i).getFirstName(), allPeople.get(j).getFirstName())
                        && CheckValues(allPeople.get(i).getMiddleName(), allPeople.get(j).getMiddleName())
                        && CheckValues(allPeople.get(i).getLastName(), allPeople.get(j).getLastName())
                        && CheckValues(allPeople.get(i).getSocialSecurityNumber(), allPeople.get(j).getSocialSecurityNumber())
                        ) {
                    myMatches.add(new MatchPair(allPeople.get(i), allPeople.get(j)));
                }
            }
        }

        System.out.println(myMatches);
        return myMatches;
    }

}

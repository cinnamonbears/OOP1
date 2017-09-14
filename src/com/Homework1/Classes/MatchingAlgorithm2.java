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
            for (int j = i + 1; j < allPeople.size() - 1; ++j) {
                if (CheckValues(allPeople.get(i).getMotherFirstName(), allPeople.get(j).getMotherFirstName())
                        && CheckValues(allPeople.get(i).getMotherMiddleName(), allPeople.get(j).getMotherMiddleName())
                        && CheckValues(allPeople.get(i).getMotherLastName(), allPeople.get(j).getMotherLastName())
                        && CheckValues(allPeople.get(i).getBirthDay().toString(), allPeople.get(j).getBirthDay().toString())
                        && CheckValues(allPeople.get(i).getBirthMonth().toString(), allPeople.get(j).getBirthMonth().toString())
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

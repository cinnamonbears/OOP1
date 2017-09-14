package com.Homework1.Classes;

import java.util.List;

public abstract class MatchingAlgorithm {

    protected String name;

    public MatchingAlgorithm(String name) {
        this.name = name;
    }

    public abstract List<MatchPair> Matches(List<Person> allPeople);

    public String getName() {
        return name;
    }

    protected Boolean CheckValues(String p1, String p2) {
        if ((p1 != null && p2 != null) && !p1.equals(p2)) {
            return false;
        }
        return true;
    }
}

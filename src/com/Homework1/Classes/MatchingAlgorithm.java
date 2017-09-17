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

    protected Boolean CheckValuesString(String p1, String p2) {
        if ((p1 != null && p2 != null) && !p1.equals(p2)) {
            return false;
        }
        return true;
    }
    protected Boolean CheckValuesInteger(Integer i1, Integer i2){
        if ((i1 != null && i2 != null) && !i1.equals(i2)) {
            return false;
        }
        return true;
    }
}

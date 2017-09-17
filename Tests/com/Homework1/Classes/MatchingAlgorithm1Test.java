package com.Homework1.Classes;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MatchingAlgorithm1Test {

    Person p1 = new Person(1, "1", "222", "Logan",
            null, "Smith", 2000, 1, 1,
            "m", "2", "n", 0,
            "Cache", "Sue", null, null, null,
            null);

    Person p2 = new Person(1, "1", "222", "Logan",
            null, "Smith", 2000, 1, 1,
            "m", "2", "n", 0,
            "Cache", "Sue", null, null, null,
            null);

    Person p3 = new Person(1, "1", "222", "Joe",
            null, "Smith", 2000, 1, 1,
            "m", "2", "n", 0,
            "Cache", "Sue", null, null, null,
            null);
    Person p4 = new Person(null, null, null, null,
            null, null, null, null, null,
            null, null, null, null,
            null, null, null, null, null,
            null);


    @Test
    public void matchesGood() throws Exception {
        List<Person> p = new ArrayList<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);
        MatchingAlgorithm1 m1 = new MatchingAlgorithm1("something");
        assertEquals(m1.Matches(p).size(), 1);
    }

    @Test
    public void matchesBad() throws Exception {
        List<Person> p = new ArrayList<>();
        p.add(p1);
        p.add(p3);
        MatchingAlgorithm1 m1 = new MatchingAlgorithm1("something");
        assertEquals(m1.Matches(p).size(), 0);
    }

    @Test
    public void matchesVoid() throws Exception {
        List<Person> p = new ArrayList<>();
        p.add(p1);
        p.add(p4);
        MatchingAlgorithm1 m1 = new MatchingAlgorithm1("something");
        assertEquals(m1.Matches(p).size(), 1);
    }

    @Test
    public void matchesEmpty() throws Exception {
        List<Person> p = new ArrayList<>();
        MatchingAlgorithm1 m1 = new MatchingAlgorithm1("something");
        assertEquals(m1.Matches(p).size(), 0);
    }

    @Test
    public void onePerson() throws Exception {
        List<Person> p = new ArrayList<>();
        p.add(p4);
        MatchingAlgorithm1 m1 = new MatchingAlgorithm1("something");
        assertEquals(m1.Matches(p).size(), 0);
    }
}
package com.Homework1.Classes;

import java.util.List;

public class DisplayMatchesConsole extends DisplayMatches {
    public DisplayMatchesConsole(String fileName) {
        super(fileName);
    }

    @Override
    public void Write(List<MatchPair> matches, String location) {
        for(MatchPair mp : matches){
            System.out.println("Match");
            System.out.println(mp.person1);
            System.out.println(mp.person2);
        }
    }

}

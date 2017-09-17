package com.Homework1.Classes;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class DisplayMatchesTxt extends DisplayMatches {

    public DisplayMatchesTxt(String fileName) {
        super(fileName);
    }

    @Override
    public void Write(List<MatchPair> matches, String location) {
            try{
                PrintWriter out = new PrintWriter(location);
                StringBuilder sb = new StringBuilder();
                for (MatchPair mp : matches) {
                    sb.append(mp.person1.getObjectId()).append("\t").append(mp.person2.getObjectId()).append("\n");
                }
                out.print(sb.toString());
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
}

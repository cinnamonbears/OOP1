package com.Homework1.Classes;

import java.util.List;

public abstract class DisplayMatches {
    protected String fileName;

    public DisplayMatches(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public abstract void Write(List<MatchPair> matches, String location);

}

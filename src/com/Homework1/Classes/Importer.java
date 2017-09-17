package com.Homework1.Classes;

import java.util.List;

public abstract class Importer {
    protected String name;
    protected String description;

    public Importer(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public abstract List<Person> Read(String filename);

    protected String AppendExtension(String filename, String extension)
    {
        if (extension.isEmpty()){
            extension = "";
        }

        if (filename.isEmpty()){
            filename = "";
        }

        if (!extension.startsWith("."))
            extension = "." + extension;

        if (!filename.endsWith(extension))
            filename += extension;

        return filename;
    }
}

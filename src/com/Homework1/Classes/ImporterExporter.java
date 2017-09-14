package com.Homework1.Classes;

import java.util.List;

public abstract class ImporterExporter {
    protected String name;
    protected String description;

    public ImporterExporter(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public abstract void Write(List<Person> list, String filename);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

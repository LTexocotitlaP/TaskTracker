package org.example.tasks;

public class Tasks {

    private int id;
    private String name;
    private String description;
    private Progress progress;

    public Tasks() {}

    public Tasks(int id, String name, String description, Progress progress) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.progress = progress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", progress=" + progress +
                '}';
    }
}

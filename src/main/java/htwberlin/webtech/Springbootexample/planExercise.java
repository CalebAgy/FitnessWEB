package htwberlin.webtech.Springbootexample;


public class planExercise {

    private String name;
    private String Weekday;
    private String description;
    private String difficulty;


    public String Fitness() {
        return "Herzlich Willkommen auf der Webseite!";
    }
    public planExercise(){
    }
    public planExercise(String name, String weekday, String description, String difficulty) {
        this.name = name;
        this.Weekday = weekday;
        this.description = description;
        this.difficulty = difficulty;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWeekday() {
        return Weekday;
    }
    public void setWeekday(String weekday) {
        this.Weekday = weekday;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

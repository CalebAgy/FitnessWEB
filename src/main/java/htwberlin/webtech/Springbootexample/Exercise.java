package htwberlin.webtech.Springbootexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise {

    private String name;
    private String Weekday;
    private String description;
    private String difficulty;

    @GetMapping("/Fitness")

    public String Fitness() {
        return "Herzlich Willkommen auf der Webseite!";
    }
    public Exercise(){
    }
    public Exercise(String name, String weekday, String description, String difficulty) {
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

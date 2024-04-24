package htwberlin.webtech.Springbootexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @GetMapping("/Fitness")
    public List<planExercise> greeting() {
        planExercise entry = new planExercise("Caleb", "Monatg", "Brust, Triceps", "Leicht");
        planExercise entry1 = new planExercise("Caleb","Dienstag", "Rücken, Biceps", "Leicht");
        planExercise entry2 = new planExercise("Caleb","Mittwoch", "Beine", "Leicht");
        planExercise entry3 = new planExercise("Caleb","Donnerstag", "Rücken, Brust", "Leicht");
        planExercise entry4 = new planExercise("Caleb","Freitag", "Arme, Schulter", "Leicht");
        return List.of(entry, entry1, entry2, entry3, entry4);
    }

}
package Controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import model.Assassin;
import model.Target;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Controller {

    Gson gson = new Gson();

    public void saveTargets(List<Target> targets) {
        try (Writer writer = new FileWriter("src/main/resources/targets.json")) {
            gson.toJson(targets, writer);
        } catch (Exception e) {
            System.out.println("Error occurd");
        }
    }

    public List<Target> loadTargets() {
        Type collectionType = new TypeToken<Collection<Target>>(){}.getType();
        JsonReader reader;
        List<Target> targets;
        try {
            reader = new JsonReader(new FileReader("src/main/resources/targets.json"));
            targets = gson.fromJson(reader,collectionType);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            targets = Collections.emptyList();
        }

//        for (Target target: targets) {
//            System.out.println(target.toString());
//        }
        return targets;
    }
}

package az.iktlab.lessons.lesson15;

import java.io.File;
import java.io.FileWriter;

public class fileExample {

    public static void main(String[] args) {

        File file = new File("C:/Users/aliye/IdeaProjects" +
                "/java_problems/src/main/resources/gz.java");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.getMessage();
            }
        }
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("ZAKIR GULU\n");
            fileWriter.write("ZAKIR GULU\n");
            fileWriter.write("ZAKIR GULU\n");
            fileWriter.write("ZAKIR GULU\n");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

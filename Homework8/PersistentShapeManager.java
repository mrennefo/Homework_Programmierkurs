package Homework8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersistentShapeManager {

    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (Shape shape : shapes) {
                writer.write(shape.toString() + "\n");
            }
            writer.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Shape> loadShapesFromFile(String filename){
        List<Shape> shapes = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            ShapeFactory factory = new ShapeFactory();
            while(true){
                line = reader.readLine();
                if(line == null) break;
                try {
                    Shape shape = factory.fromString(line);
                    shapes.add(shape);
                } catch(IllegalArgumentException e) {
                    e.getMessage();
                }
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return shapes;
    }

    public static void clearFile(String filename){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write("");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

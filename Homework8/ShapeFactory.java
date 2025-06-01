package Homework8;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class ShapeFactory {
    public static Shape fromString(String input) throws IllegalArgumentException {
        String[] information = input.split(" ");
        String type = null;
        if(information.length >= 1) { // extract the Class type
            String[] typetrimmed = information[0].split(":");
            type = typetrimmed[0];
        } else{
            throw new IllegalArgumentException("Input must be in the format: ShapeType: key=value, ...");
        }
        ArrayList<Double> inputFactors = new ArrayList<>();
        for(int i = 1; i < information.length; i++){    //extract all input factors
            String[] splittet = information[i].split("=");
            if(splittet.length == 2) {
                try {
                    String[] inputFactorTrimmed = splittet[1].split(","); //delete the ','
                    inputFactors.add(Double.parseDouble(inputFactorTrimmed[0]));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Input must be in the format: ShapeType: key=value, ...");
                }
            } else{
                throw new IllegalArgumentException("Input must be in the format: ShapeType: key=value, ...");
            }
        }
        try{ //try to build the object
            switch(type) {
                case "Circle":
                    return new Circle(inputFactors.get(0));
                case "Rectangle":
                    return new Rectangle(inputFactors.get(0), inputFactors.get(1));
            }
        } catch(Exception e){
            throw new IllegalArgumentException("Input must be in the format: ShapeType: key=value, ...");
        }
        throw new IllegalArgumentException("Input must be in the format: ShapeType: key=value, ...");
    }
}

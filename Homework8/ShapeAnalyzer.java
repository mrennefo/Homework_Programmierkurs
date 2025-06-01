package Homework8;

import java.util.*;

public class ShapeAnalyzer {
    public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea) {
        List<Shape> result = new ArrayList<Shape>();
        for (Shape shape : shapes) {
            if (shape.getArea() >= minArea) {
                result.add(shape);
            }
        }
        return result;
    }

    public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
        Shape result = null;
        for (Shape shape : shapes) {
            if (result == null || shape.getArea() > result.getArea()) {
                result = shape;
            }
        }
        return result;
    }

    public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shape){
        Collection shapeCopy = new ArrayList(shape);
        Map<String, List<T>> result = new HashMap<String, List<T>>();
        for(T shapes: shape){
            String currentShape = shapes.getClass().getSimpleName();
            List<T> fittingShapes = new ArrayList<T>();
            for(T currentShapes: shape){
                if(currentShapes.getClass().getSimpleName().equals(currentShape)){
                    fittingShapes.add(currentShapes);
                    shapeCopy.remove(currentShapes);
                }
            }
            result.put(currentShape, fittingShapes);
        }
        return result;
    }
}

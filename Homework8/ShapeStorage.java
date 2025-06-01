package Homework8;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
    //ArrayList<T> shapes = new ArrayList<>();


    public double getTotalArea(){
        double sum = 0.0;
        for(int i = 0; i < this.size(); i++){
            sum += this.get(i).getArea();
        }
        return sum;
    }

    public void displayAllShapes(){
        for(int i = 0; i < this.size(); i++){
            System.out.println(this.get(i).toString());
        }

    }

    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea) {
        for(U shape: other){
            if(shape.getArea() >= minArea){
                this.add(shape);
            }
        }
    }

}

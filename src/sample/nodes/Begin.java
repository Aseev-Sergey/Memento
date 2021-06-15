package sample.nodes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class Begin extends Node {

    private Circle begin;

    public Begin(){
        super();
        begin = new Circle(startX, startY,20, Color.BLACK);
    }

    public Begin(double posX, double posY, double radius){
        super(posX, posY);
        begin = new Circle(startX, startY, radius, Color.BLACK);
    }


    @Override
    public String toString() {
        return "Начальный узел";
    }

    public void draw(Pane pane){
        pane.getChildren().add(begin);
    }

    @Override
    public Shape getNode() {
        return begin;
    }

    @Override
    boolean isEmpty() {
        if(begin == null){
            return true;
        }
        else{
            return false;
        }
    }
}

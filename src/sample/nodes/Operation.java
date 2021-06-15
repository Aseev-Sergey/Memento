package sample.nodes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Operation extends Node {

    private Rectangle oper;

    public Operation(){
        super();
        oper = new Rectangle( 120, 60, Color.LIGHTGREY);
        oper.setX(startX-60);
        oper.setY(startY);
        oper.setArcWidth(50);
        oper.setArcHeight(50);
    }

    public Operation(double posX, double posY, double width, double height, double arc){
        super(posX, posY);
        oper = new Rectangle(width, height, Color.LIGHTGREY);
        oper.setArcHeight(arc);
        oper.setArcWidth(arc);
        oper.setX(startX-width / 2.0);
        oper.setY(startY);
    }

    @Override
    public Shape getNode() {
        return oper;
    }

    @Override
    public String toString() {
        return "Узел управления";
    }

    public void draw(Pane pane){
        pane.getChildren().add(oper);
    }

    @Override
    boolean isEmpty() {
        if(oper == null){
            return true;
        }
        else{
            return false;
        }
    }

}

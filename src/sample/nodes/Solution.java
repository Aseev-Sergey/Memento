package sample.nodes;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Solution extends Node{

    private Rectangle sol;

    public Solution(){
        super();
        sol = new Rectangle(100, 100, Color.LIGHTGREY);
        sol.setX(startX - 50);
        sol.setY(startY);
        sol.setRotate(45);
    }

    public Solution(double posX, double posY, double width, double rotate){
        super(posX, posY);
        sol = new Rectangle(width, width, Color.LIGHTGREY);
        sol.setRotate(rotate);
        sol.setX(startX - width / 2.0);
        sol.setY(startY);
    }

    @Override
    public Shape getNode() {
        return sol;
    }

    @Override
    public String toString() {
        return "Узел решения";
    }

    public void draw(Pane pane){
        pane.getChildren().add(sol);
    }

    @Override
    boolean isEmpty() {
        if(sol == null){
            return true;
        }
        else{
            return false;
        }
    }
}

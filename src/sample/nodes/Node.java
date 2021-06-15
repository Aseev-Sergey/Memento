package sample.nodes;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

abstract class Node {


    protected double startX, startY;

    public Node(){
        startX = 210;
        startY = 100;
    }

    public Node(double posX, double posY){
        startX = posX;
        startY = posY;
    }

    abstract void draw(Pane pane);
    abstract Shape getNode();
    abstract boolean isEmpty();

}

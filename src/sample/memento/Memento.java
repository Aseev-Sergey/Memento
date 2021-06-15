package sample.memento;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

public class Memento {

    private Shape snape;
    private double width;
    private Color color;

    public Memento(Shape state) {

        this.snape = state;

        width = snape.getStrokeWidth();

        color = (Color) snape.getStroke();
    }

    public Shape getState(){

        snape.setStrokeWidth(width);

        snape.setStroke(color);

        return snape;

    }

    public Shape initState() {

        snape.setStrokeWidth(2);

        snape.setStroke(Color.BLUE);

        return snape;
    }

    public void draw(Pane pane){
        pane.getChildren().add(snape);
    }
}

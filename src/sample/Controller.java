package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import sample.memento.CareTaker;
import sample.memento.Memento;
import sample.memento.Originator;
import sample.nodes.Begin;
import sample.nodes.Operation;
import sample.nodes.Solution;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Pane pane;
    private Originator originator = new Originator();
    private CareTaker careTaker = new CareTaker();
    private Memento temp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }

    public void clickClear(ActionEvent actionEvent) {
        clearPane();
        temp = null;
    }

    private void clearPane(){
        pane.getChildren().clear();
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void clickGoBack(ActionEvent actionEvent) {
        pane.getChildren().remove(temp.getState());
        originator.getStateFromMemento(careTaker.pop());
        temp = originator.saveStateToMemento();
        pane.getChildren().add(temp.getState());

    }

    public void clickGoToStart(ActionEvent actionEvent) {
        pane.getChildren().remove(temp.getState());
        pane.getChildren().add(careTaker.first());
        temp = new Memento(careTaker.first());
        careTaker = new CareTaker();
    }

    public void clickBegin(ActionEvent actionEvent) {
        clearPane();
        originator.setState(new Begin().getNode());
        careTaker.push(new Memento(new Begin().getNode()));
        temp = originator.saveStateToMemento();
        temp.draw(pane);
    }

    public void clickOperation(ActionEvent actionEvent) {
        clearPane();
        originator.setState(new Operation().getNode());
        careTaker.push(new Memento(new Operation().getNode()));
        temp = originator.saveStateToMemento();
        temp.draw(pane);
    }

    public void clickSolution(ActionEvent actionEvent) {
        clearPane();
        originator.setState(new Solution().getNode());
        careTaker.push(new Memento(new Solution().getNode()));
        temp = originator.saveStateToMemento();
        temp.draw(pane);
    }

    public void setOnMouseDragged(MouseEvent mouseEvent) {
        if(temp==null) return;
        temp.initState().relocate(mouseEvent.getX(), mouseEvent.getY());
    }

    public void setOnMouseMoved(MouseEvent mouseEvent) {

    }

    public void setOnMousePressed(MouseEvent mouseEvent) {
        temp.initState().toFront();
    }

    public void setOnMouseReleased(MouseEvent mouseEvent) {
        if(temp==null) return;
        temp.getState().relocate(mouseEvent.getX(), mouseEvent.getY());
        careTaker.push(temp);
    }
}

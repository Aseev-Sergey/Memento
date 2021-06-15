package sample.memento;

import javafx.scene.shape.Shape;

import java.util.ArrayDeque;
import java.util.Deque;

public class CareTaker {

    private Deque<Memento> mementoList = new ArrayDeque<Memento>();
    private Memento first;



    public void push(Memento state){
        if(mementoList.isEmpty()){
            first = new Memento(state.getState());
        }
        mementoList.add(state);

    }

    public Memento pop(){

        return mementoList.pop();

    }

    public boolean isEmpty(){
        return mementoList.isEmpty();
    }

    public Shape first(){
        return first.getState();
    }
}

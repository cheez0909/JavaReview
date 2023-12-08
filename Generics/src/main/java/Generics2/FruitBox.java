package Generics2;

import Generics.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }
}

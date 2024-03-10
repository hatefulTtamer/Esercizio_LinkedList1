/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
*/

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(new Fruit("Orange"));
        fruits.add(new Fruit("Watermelon"));
        fruits.add(new Fruit("Apple"));
        fruits.add(new Fruit("Pomegranate"));
        //for (Fruit fruit : fruits) {
        //    System.out.println(fruit.getName());
        //}
        fruits.addFirst(new Fruit("Peach"));
        fruits.addLast(new Fruit("Pineapple"));
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }

    }
}
package com.company;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private int x,y;
    public Person(int n1,int n2){
        x=n1;
        y=n2;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return x == person.x && y == person.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

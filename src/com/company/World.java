package com.company;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class World implements Serializable {
    private HashMap<Integer,ArrayList<Person>> worldMap;
    private Random rand;
    public World(int n1,int n2,int n3,int n4,int n5){
        worldMap=new HashMap<>();
        rand=new Random(100);
        Person[]persons=new Person[100];
        for(int i=0;i<100;i++){
            persons[i]=new Person(rand.nextInt(1000),rand.nextInt(1000));
        }
        for(int i=0;i<100;i++){
            if(worldMap.containsKey(persons[i].hashCode())){
                worldMap.get(persons[i].hashCode()).add(persons[i]);
            }else{
                ArrayList<Person> temp=new ArrayList<>();
                temp.add(persons[i]);
                worldMap.put(persons[i].hashCode(),temp);
            }
        }

    }
    public void createWorld(){

    }
    public void next(){

    }
    public StringBuilder getLog(){
        return new StringBuilder("ok");
    }
    public int getMaxX(){
        return 1000;
    }
    public int getCurrentlyInfected(){
        return 0;
    }
    public HashMap<Integer, ArrayList<Person>> getWorldMap(){
        return worldMap;
    }
    public boolean hasInfected(int n1){
        return rand.nextBoolean();
    }
    public int getPopulation(){
        return 0;
    }
    public int getDay(){
        return 0;
    }
    public int getCurrentlyVaccinated(){
        return 0;
    }
    public double getVacPerc(){
        return 0;
    }
    public int getCurrentlyHospitalized(){
        return 0;
    }
    public int getCurrentlyDead(){
        return 0;
    }
}

package org.hariom.practicleexam.histogram;

import java.util.ArrayList;

public class ProcessData {
    private ArrayList<DogsData> dogs = new ArrayList<>();
    public void addDogsData(DogsData dog){
        dogs.add(dog);
    }

    public ArrayList<DogsData> getDogs(){
        return dogs;
    }
}

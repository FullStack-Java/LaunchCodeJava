package com.annabelle.launch.springboot.models;

import java.util.ArrayList;

public class ModelData {

    static ArrayList<ModelDemo> modelData;

    public ModelData() {
        ModelData.modelData = new ArrayList<>();
    }

    public static ArrayList<ModelDemo> getAll(){
        return modelData;
    }

    public static void addPerson(ModelDemo data){
        modelData.add(data);
    }

    public static void remove(int id){
        ModelDemo theData = getById(id);
        modelData.remove(theData);
    }

    public static ModelDemo getById(int id){
        ModelDemo theData = null;

        for (ModelDemo data: modelData){
            if(data.getId() == id){
                theData = data;
            }
        }
        return theData;
    }
}

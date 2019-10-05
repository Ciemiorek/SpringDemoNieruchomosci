package com.ciemiorek.SpringDemoNieruchomosci.models;

public abstract class AbstractModel {

    protected static  int lastId =0;

    protected int id;

    protected AbstractModel(){

        lastId++;
        this.id=lastId;
    }

    public int getId(){
        return id;
    }

    public void  setId(int id){

        this.id = id;
    }

}

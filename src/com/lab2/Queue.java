package com.lab2;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<String> arr;
    private Integer limit;


    public Queue(){
        this.arr = new ArrayList<>();
    }

    public Queue(int limit){
        this.arr = new ArrayList<>();
        this.limit = limit;
    }

    public boolean push(String item){
        if(this.isFull()){
            return false;
        } else {
            return this.arr.add(item);
        }
    }

    public String pop(){
        return this.arr.remove(0);
    }

    public boolean isFull(){
        if(limit == null){
            return false;
        }
        return this.arr.size() == this.limit;
    }

    public boolean isEmpty(){
        return this.arr.size() == 0;
    }

}

package com.example.spacemath;

//outer part of nasa image api
public class Collection {
    //items contains all the data
    Item[] items;

    public Collection(Item[] items){
        this.items= items;
    }

    public Item[] getItems() {
        return items;
    }
}

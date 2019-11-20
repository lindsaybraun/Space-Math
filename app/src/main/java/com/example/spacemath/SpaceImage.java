package com.example.spacemath;

public class SpaceImage {
    //items grouping and then each object has a links grouping and a data grouping

    String collection;
    Item[] items;


    public SpaceImage(String collection, Item[] items){
        this.collection = collection;
        this.items = items;

    }

    //get image url
    public String getCollection() {
        return collection;
    }
    public Item[] getItems() { return items;}


}

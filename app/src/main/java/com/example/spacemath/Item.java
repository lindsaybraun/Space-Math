package com.example.spacemath;

public class Item {
    Links[] links;
    Data[] data;

    public Item(Links[] links, Data[] data){
        this.links = links;
        this.data = data;
    }

    public Data[] getData() {
        return data;
    }

    public Links[] getLinks() {
        return links;
    }
}

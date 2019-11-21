package com.example.spacemath;

//section of nasa images api response with all the data
public class Item {
    //need links for image url and data for image title
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

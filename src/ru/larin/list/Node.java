package ru.larin.list;

/**
 * Created by mrden on 25.10.2016.
 */
public class Node {
    private String data;
    private Node nextElementLink;

    public Node(String string){
        this.data = string;
    }

    public String getData() {
        return data;
    }

    public void setData(String string) {
        this.data = string;
    }

    public Node getNextElementLink() {
        return nextElementLink;
    }

    public void setNextElementLink(Node nextElementLink) {
        this.nextElementLink = nextElementLink;
    }
}

package ru.larin.list;

/**
 * Created by mrden on 25.10.2016.
 */
public class LinkList {
    private Node first;

    public LinkList() {
        this.first = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public void add(String string) {
        if (isEmpty()) {
            Node node = new Node(string);
            node.setNextElementLink(first);
            first = node;
        } else {
            boolean conect = false;
            Node temp = first;
            while (temp != null) {
                if(temp.getNextElementLink() == null){
                    break;
                }
                if (temp.getNextElementLink() != null && temp.getData().length() <= string.length()) {
                    conect = true;
                    break;
                }
                if (string.length() < temp.getData().length()) {
                    if (temp.getNextElementLink().getData().length() <= string.length()) {
                        Node node = new Node(string);
                        node.setNextElementLink(temp.getNextElementLink());
                        temp.setNextElementLink(node);
                        return;
                    } else {
                        temp = temp.getNextElementLink();
                        continue;
                    }
                }
            }


                /*Если элемент надо вставить вначало*/
            if (conect == false) {
               Node node = new Node(string);
               temp.setNextElementLink(node);
            } else {
                Node node = new Node(string);
                node.setNextElementLink(first);
                first = node;
            }
        }
    }


    public void print() {
        if (isEmpty()) {
            return;
        } else {
            Node node = first;
            while (node != null) {
                System.out.println(node.getData().toString());
                node = node.getNextElementLink();
            }
        }
    }

    public Node removeFirst() {
        Node node = first;
        first = first.getNextElementLink();
        return node;
    }

    public int size() {
        Node node = first;
        int size = 0;
        while (node != null) {
            size++;
            node = node.getNextElementLink();
        }
        return size;
    }

    public void clean() {
        while (!isEmpty()) {
            removeFirst();
        }
    }
}

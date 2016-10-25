package ru.larin.list;

/**
 * Created by mrden on 25.10.2016.
 */
public class Main {
    private static LinkList linkList;
    public static void main(String[] args) {
        linkList = new LinkList();
        String string ="aaaaa6";//6
        String string2 = "aaaa5";//5
        String string3 = "aaaaaaaa9";//9
        String string6 = "bbbbbbbb9";//9
        String string4 = "aaaaaaa8";//8
        String string5 = "aaaaaa7";//7
        String string7 = "aaaaaa7aaaaaa14";//7

        linkList.add(string7);
        linkList.add(string);
        linkList.add(string2);
        linkList.add(string3);
        linkList.add(string6);
        linkList.add(string4);
        linkList.add(string5);
        linkList.print();

    }
}

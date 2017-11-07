package com.loftschool.moneymacker;

public class Item {

    public final static String TYPE_EXPENSE = "expense";
    public final static String TYPE_INCOME = "income";
    public final static String TYPE_UNKNOWN = "unknown";

    public String name;
    public String type;
    public int price;
    public int id;

    public Item(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

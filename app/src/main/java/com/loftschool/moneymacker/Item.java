package com.loftschool.moneymacker;

import java.io.Serializable;

public class Item implements Serializable{

    public final static String TYPE_EXPENSE = "expense";
    public final static String TYPE_INCOME = "income";
    public final static String TYPE_UNKNOWN = "unknown";

    public String name;
    public int price;
    public String type;
    public int id;

    public Item(String name, int price, String type) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}

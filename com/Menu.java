package com;

import java.util.HashMap;
import java.util.Map;

public class Menu {

    private Map<String, Double> items;

    public Menu() {
        items = new HashMap<>();
    }

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public double getPrice(String item) {
        return items.getOrDefault(item, 0.0);
    }

    public Map<String, Double> getItems() {
        return items;
    }
}

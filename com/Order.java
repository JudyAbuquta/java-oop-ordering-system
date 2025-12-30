package com;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private Map<String, Integer> items;
    private String deliveryLocation;
    private String pickupBranch;
    private double deliveryFee;

    public Order() {
        items = new HashMap<>();
    }

    public void addItem(String item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void addDeliveryFee(double fee) {
        deliveryFee += fee;
    }

    public Map<String, Integer> getItems() {
        return items;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryLocation(String location) {
        deliveryLocation = location;
    }

    public void setPickupBranch(String branch) {
        pickupBranch = branch;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public String getPickupBranch() {
        return pickupBranch;
    }
}

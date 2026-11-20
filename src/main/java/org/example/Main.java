package org.example;

class Hospital {
    int id, beds;
    String name, city, contact;

    Hospital(int id, String name, String city, int beds, String contact) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.beds = beds;
        this.contact = contact;
    }

    void display() {
        System.out.println(id + " | " + name + " | " + city + " | Beds: " + beds + " | " + contact);
    }
}

public class Main {
    public static void main(String[] args) {
        Hospital[] hospitals = {
                new Hospital(101, "City Care Hospital", "Bengaluru", 250, "080-22223333"),
                new Hospital(102, "Green Valley Medical", "Mysuru", 180, "0821-4455667"),
                new Hospital(103, "Sunrise Health Center", "Chennai", 300, "044-9988776")
        };

        for (Hospital h : hospitals) {
            h.display();
        }
    }
}
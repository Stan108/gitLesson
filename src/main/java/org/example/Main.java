package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/HH:mm");
        System.out.println("Текущее время: " + format.format(new Date()));
        //
        //
    }
}
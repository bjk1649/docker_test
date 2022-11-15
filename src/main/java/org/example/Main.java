package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import org.example.containerstatus.Eth0;
import org.example.controller.Docker;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) {
        Docker docker = new Docker();
        try {
            docker.run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
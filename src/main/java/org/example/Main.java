package org.example;

import org.example.controller.Docker;

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
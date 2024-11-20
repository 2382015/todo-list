module TodoApp {
    requires java.sql;
    requires spring.context;
    requires spring.beans;
    requires java.xml.crypto;

    opens todoapp;
    opens todoapp.entities;
    opens todoapp.repositories;
    opens todoapp.services;
    opens todoapp.views;
    opens todoapp.config;
}
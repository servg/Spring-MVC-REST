package ru.specialist.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.specialist.graph.GraphConfig;
import ru.specialist.graph.Scene;


public class App {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(GraphConfig.class)) {

            context.getBean(Scene.class).draw();
        } // context.close();

    }

}

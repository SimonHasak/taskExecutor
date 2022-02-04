package sk.taskmanager.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskmanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmanagerApplication.class, args);
    }

}

// uml, diagram systemovy kontext, use case, technicky komponent model
// SOLID principles
// pridanie vlastnej funkcionality, rozmyslaj ako spravit (bez rozsirenie executora rozhrania)
// pozri open source projekty s plugins
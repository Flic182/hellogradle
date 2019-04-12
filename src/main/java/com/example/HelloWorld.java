package com.example;

import lombok.Data;

/**
 * A simple class that stores a person's name and a salutation, combining those
 * to form a greeting.
 *
 * This is a basic project to illustrate the use of Java 10, JUnit5, Gradle,
 * Lombok and JBehave BDD.
 *
 * @author Felicity Hughes
 * @since 10
 */
@Data
public class HelloWorld {
    /**
     * Name of the person to be greeted.
     *
     * @param name Sets the greeted person's name.
     *
     * @return the greeted person's name.
     */
    private String name;
    /**
     * Salutation to use when greeting the person.
     *
     * @param salutation Sets salutation for the greeted person.
     *
     * @return the salutation for the greeted person.
     */
    private String salutation;

    /**
     * Combines the stored salutation and name to create a greeting.
     *
     * @return the salutation, followed by a space, the name and an exclamation
     *         mark.
     */
    public String printGreeting() {
        return getSalutation() + " " + getName() + "!";
    }
}

package com.codexbox.springboot.app.ramdurgaprasad.assessment5;
import java.io.*;
public class Dog implements Serializable {
        String name;
        String breed;
    public Dog(String name, String breed) {
            this.name = name;
            this.breed = breed;
        }
 public void method()
  {
            Dog dog = new Dog(this.name,this.breed);
            try {
                FileOutputStream file = new FileOutputStream("file.txt");
                ObjectOutputStream output = new ObjectOutputStream(file);
                output.writeObject(dog);
                FileInputStream fileStream = new FileInputStream("file.txt");
                ObjectInputStream input = new ObjectInputStream(fileStream);
                Dog newDog = (Dog) input.readObject();
                System.out.println("Dog Name: " + newDog.name);
                System.out.println("Dog Breed: " + newDog.breed);
                output.close();
                input.close();
            }

            catch (Exception e) {
                e.getStackTrace();
            }
        }
    }


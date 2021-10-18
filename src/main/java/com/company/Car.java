package com.company;

import java.util.Objects;

import org.apache.log4j.Logger;

public final class Car implements IDriveCar {

    String typeOfEngine, maximumLoadCapacity;
    private static final Logger LOGGER = Logger.getLogger(Car.class);

    public Car(){
        typeOfEngine = "";
        maximumLoadCapacity = "";
    }

    public Car(String typeOfEngine, String maximumLoadCapacity){
        this.typeOfEngine = typeOfEngine;
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    @Override
    public void roadToTheStorage(Storage storage) {
        String infoMessage = "The car is going to the storage now.";
        LOGGER.info(infoMessage);
        String addressStorage = "The address of storage is " + storage.getAddressOfStorage();
        LOGGER.info(addressStorage);
    }

    @Override
    public void roadToTheClient(Client client) {
        String infoMessage = "The car is going to the client now.";
        LOGGER.info(infoMessage);
        String addressClient = "The address of client is " + client.getAddressOfClient();
        LOGGER.info(addressClient);
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setMaximumLoadCapacity(String maximumLoadCapacity) {
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    public String getMaximumLoadCapacity() {
        return maximumLoadCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeOfEngine='" + typeOfEngine + '\'' +
                ", maximumLoadCapacity='" + maximumLoadCapacity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  Objects.equals(typeOfEngine, car.typeOfEngine) &&
                Objects.equals(maximumLoadCapacity, car.maximumLoadCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfEngine, maximumLoadCapacity);
    }

}

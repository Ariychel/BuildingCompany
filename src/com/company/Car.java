package com.company;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class Car implements TypeOfCar {

    Storage storage = new Storage();
    Client client = new Client();
    String typeOfEngine, maximumLoadCapacity;
    private static final Logger logger = LogManager.getLogger(Car.class);

    public Car(){
        storage.setAddressOfStorage("");
        client.setAddressOfClient("");
        typeOfEngine = "";
        maximumLoadCapacity = "";
    }

    public Car(String addressOfStorage, String addressOfClient, String typeOfEngine, String maximumLoadCapacity){
        storage.setAddressOfStorage(addressOfStorage);
        client.setAddressOfClient(addressOfClient);
        this.typeOfEngine = typeOfEngine;
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    @Override
    public void roadToTheStorage() {

        String messageOne = "The car is going to the storage now.";
        logger.info(messageOne);
        String messageTwo = "The address of storage is " + storage.getAddressOfStorage();
        logger.info(messageTwo);

    }

    @Override
    public void roadToTheClient() {

        String messageOne = "The car is going to the client now.";
        logger.info(messageOne);
        String messageTwo = "The address of client is " + client.getAddressOfClient();
        logger.info(messageTwo);

    }

    @Override
    public void setAddressOfStorage(String addressOfStore) {
        storage.setAddressOfStorage(addressOfStore);
    }

    @Override
    public String getAddressOfStorage() {
        return storage.getAddressOfStorage();
    }

    @Override
    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;

    }

    @Override
    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    @Override
    public void setMaximumLoadCapacity(String maximumLoadCapacity) {
        this.maximumLoadCapacity = maximumLoadCapacity;
    }

    @Override
    public String getMaximumLoadCapacity() {
        return maximumLoadCapacity;
    }

    @Override
    public void setAddressOfClient(String addressOfClient) {
        client.setAddressOfClient(addressOfClient);
    }

    @Override
    public String getAddressOfClient() {
        return client.getAddressOfClient();
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
        return Objects.equals(storage, car.storage) &&
                Objects.equals(client, car.client) &&
                Objects.equals(typeOfEngine, car.typeOfEngine) &&
                Objects.equals(maximumLoadCapacity, car.maximumLoadCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage, client, typeOfEngine, maximumLoadCapacity);
    }

}

package com.company;

public class Car extends Transport implements ServiceStationInterface {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        System.out.println("Обслуживаем "+ getModelName());
        System.out.println("Проверяем двигатель");
    }
}

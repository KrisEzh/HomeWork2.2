package com.company;

public class Truck extends Transport implements ServiceStationInterface {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        System.out.println("Обслуживаем "+ getModelName());
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}




package com.company;

abstract class Transport implements ServiceStationInterface {
    private String modelName;
    private  int wheelsCount;

    public Transport(String modelName,int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
       return wheelsCount; }


    public void updateTyre() {
                 System.out.println("Меняем покрышку");
             }

    public void service() {
        System.out.println("Обслуживаем "+ getModelName());
    }

}

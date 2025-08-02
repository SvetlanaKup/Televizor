package Televizor;

class Televizor {
    private String model;      // Модель телевизора
    private double diagonal;   // Диагональ экрана
    private boolean isOn;      // Включён телевизор или выключен

    // Конструктор, принимающий параметры
    public Televizor(String model, double diagonal) {
        this.model = model;
        this.diagonal = diagonal;
        this.isOn = false;     // Изначально телевизор выключен
    }

    // Методы для изменения состояния (включение/выключение)
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println(model + ": включен");
        } else {
            System.out.println(model + ": уже включен");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println(model + ": выключен");
        } else {
            System.out.println(model + ": уже выключен");
        }
    }

    // Получение текущего статуса телевизора
    public boolean isTurnedOn() {
        return isOn;
    }

    @Override
    public String toString() {
        return "Модель: " + model +
                ", диагональ: " + diagonal + "\"" +
                ", состояние: " + (isOn ? "включён" : "выключен");
    }
}

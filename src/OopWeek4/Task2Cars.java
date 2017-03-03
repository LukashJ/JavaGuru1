package OopWeek4;


public class Task2Cars {
    public static void main (String [] args) {

    }
}

class Cars {

    protected String vinNumber;
    protected String brandCar;
    protected String modelCar;
    protected int yearProduction;
    protected int yearRegistration;
    protected String color;

    public Cars(String vinNumber, String brandCar, String modelCar,
                int yearProduction, int yearRegistration, String color) {
        this.vinNumber = vinNumber;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.yearProduction = yearProduction;
        this.yearRegistration = yearRegistration;
        this.color = color;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public int getYearRegistration() {
        return yearRegistration;
    }

    public String getColor() {
        return color;
    }
}

class PassengerCar extends Cars {
    private int numberDoors;

    public PassengerCar(String vinNumber, String brandCar, String modelCar, int yearProduction,
                        int yearRegistration, String color, int numberDoors) {
        super(vinNumber, brandCar, modelCar, yearProduction, yearRegistration, color);
        this.numberDoors=numberDoors;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    @Override
    public boolean equals(Object aPassengerCar) {
        PassengerCar c = (PassengerCar) aPassengerCar;
        return (getBrandCar().equals(c.getBrandCar()) && getModelCar().equals(c.getModelCar())
                && getYearProduction() == c.getYearProduction() && getNumberDoors()== c.getNumberDoors());
    }

    @Override
    public String toString() {
        return vinNumber + ", " + brandCar + ", " + modelCar + ", " + yearProduction +
                ", " +yearRegistration + ", " + color + ", " + numberDoors ;
    }
}

class Truck extends Cars {
    private int tonnage;

    public Truck(String vinNumber, String brandCar, String modelCar, int yearProduction,
                  int yearRegistration, String color, int tonnage) {
        super(vinNumber, brandCar, modelCar, yearProduction, yearRegistration, color);
        this.tonnage=tonnage;
    }

    public int getTonnage (){
        return tonnage;
    }

    @Override
    public boolean equals(Object aTruck) {
        Truck c = (Truck) aTruck;
        return (getBrandCar().equals(c.getBrandCar()) && getModelCar().equals(c.getModelCar())
                && getYearProduction() == c.getYearProduction() && getTonnage() == c.getTonnage());
    }

    @Override
    public String toString() {
        return vinNumber + ", " + brandCar + ", " + modelCar + ", " + yearProduction +
                ", " +yearRegistration + ", " + color + ", " + tonnage ;
    }

}

class Bus extends Cars {
    private int passengerNumber;

    public Bus(String vinNumber, String brandCar, String modelCar, int yearProduction,
               int yearRegistration, String color, int passengerNumber) {
        super(vinNumber, brandCar, modelCar, yearProduction, yearRegistration, color);
        this.passengerNumber = passengerNumber;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    @Override
    public boolean equals(Object aBus) {
        Bus c = (Bus) aBus;
        return (getBrandCar().equals(c.getBrandCar()) && getModelCar().equals(c.getModelCar())
                && getYearProduction() == c.getYearProduction() && getPassengerNumber() == c.getPassengerNumber());
    }

    @Override
    public String toString() {
        return vinNumber + ", " + brandCar + ", " + modelCar + ", " + yearProduction +
                ", " +yearRegistration + ", " + color + ", " + passengerNumber ;
    }
}
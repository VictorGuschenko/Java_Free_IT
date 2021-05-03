package task26_appliance;

public class PowerSupply {
    String typeCurrent;
    String classEnergy;
    double minVoltage;
    double maxVoltage;
    double operatingVoltage;
    double maxCurrent;
    double powerConsumption;

    public PowerSupply(String typeCurrent, String classEnergy,
                       double minVoltage, double maxVoltage,
                       double operatingVoltage, double maxCurrent,
                       double powerConsumption) {
        this.typeCurrent = typeCurrent;
        this.classEnergy = classEnergy;
        this.minVoltage = minVoltage;
        this.maxVoltage = maxVoltage;
        this.operatingVoltage = operatingVoltage;
        this.maxCurrent = maxCurrent;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "typeCurrent='" + typeCurrent + '\'' +
                ", classEnergy='" + classEnergy + '\'' +
                ", minVoltage=" + minVoltage + "V" +
                ", maxVoltage=" + maxVoltage + "V" +
                ", operatingVoltage=" + operatingVoltage + "V" +
                ", maxCurrent=" + maxCurrent + "A" +
                ", powerConsumption=" + powerConsumption + "W" +
                '}';
    }
}

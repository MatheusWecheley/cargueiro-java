package entities;

public class Cargas {
    private double principal = 833;
    private double aux = 222;
    private double precious = 21;
    private double totalWeight = 0;

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = this.totalWeight + totalWeight;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = this.principal - principal;
    }

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = this.aux - aux;
    }

    public double getPrecious() {
        return precious;
    }

    public void setPrecious(double precious) {
        this.precious = this.precious - precious;
    }
}

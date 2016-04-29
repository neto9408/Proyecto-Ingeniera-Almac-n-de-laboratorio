
package sifrado;

public class DividentStock extends Stock{
    protected double dividens;
     
     @Override

    public double getMarketValue(){
        return super.getMarketValue()+this.dividens;
    }
     public double getDividends() {
        return dividens;
    }

    public void setDividends(double dividends) {
        this.dividens=dividends;
    }

    public int getTotalShares() {
        return totalshares;

    public void setTotalShares(int totalShares) {
        this.totalshares = totalShares;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
   
  }

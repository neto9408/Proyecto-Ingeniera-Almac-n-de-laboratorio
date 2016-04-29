
package sifrado;


public class Stock  extends ShareAsset{
  protected     int totalshares;
  
    public double getMarketValue() {
        return this.totalshares*super.currentPrince;
    }

    @Override
    public double getProfit() {
        return (this.totalshares*super.currentPrince)-super.taltalCost;
    }
    

    public int getTotalShares() {
        return totalshares;
    }

    public void setTotalShares(int totalShares) {
        this.totalshares = totalShares;
    }

    public String getSimbol() {
        return symbol;
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

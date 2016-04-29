
package sifrado;


public class MutualFund extends ShareAsset{
     protected double totalshares;

    @Override
    public double getMarketValue() {
   return totalshares*currentPrince;    
}
}
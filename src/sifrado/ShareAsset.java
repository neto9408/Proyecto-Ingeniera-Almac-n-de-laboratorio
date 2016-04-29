/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sifrado;

/**
 *
 * @author HP
 */
public abstract class ShareAsset implements Asset{
    public String symbol;
    public double taltalCost;
    public double currentPrince;
    @Override
    public double getProfit() {
       return 0;
    }
    
}

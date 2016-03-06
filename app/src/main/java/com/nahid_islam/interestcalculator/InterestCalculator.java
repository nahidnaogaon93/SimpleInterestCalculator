package com.nahid_islam.interestcalculator;

/**
 * Created by Nahid_Islam on 2/28/2016.
 */
public class InterestCalculator {
    private  double principalAmount;
    private  float interestRate;
    private  float timePeriod;

    public InterestCalculator(double principalAmount, float interestRate, float timePeriod){

        setPrincipalAmount(principalAmount);
        setInterestRate(interestRate);
        setTimePeriod(timePeriod);
       }
    public InterestCalculator(){

    }
    public double getPrincipalAmount() {
        return principalAmount;
    }

    public void setPrincipalAmount(double principalAmount) {
        this.principalAmount = principalAmount;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(float timePeriod) {
        this.timePeriod = timePeriod;
    }

    public double calculateInterest(){

        double interestAmount=(interestRate*timePeriod*principalAmount)/100;
        return interestAmount;
    }

    public double calculateTotalAmount(){

         double totalAmount=(interestRate*timePeriod*principalAmount)/100+principalAmount;
         return totalAmount;
    }
}

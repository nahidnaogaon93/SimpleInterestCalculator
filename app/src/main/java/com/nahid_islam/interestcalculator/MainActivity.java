package com.nahid_islam.interestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText principalAmountEt;
    EditText interestRateEt;
    EditText timePeriodEt;
    TextView interestAmountTv;
    TextView totalAmountTv;
    InterestCalculator interestCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        principalAmountEt=(EditText)findViewById(R.id.principalAmount);
        interestRateEt=(EditText)findViewById(R.id.interestRate);
        timePeriodEt=(EditText)findViewById(R.id.timePeriod);
        interestAmountTv=(TextView)findViewById(R.id.interestAmount);
        totalAmountTv=(TextView)findViewById(R.id.totalAmount);

    }
    public  void btnCalculate(View view){
        interestCalculator=new InterestCalculator();
        interestCalculator.setPrincipalAmount(Double.parseDouble(principalAmountEt.getText().toString()));
        interestCalculator.setInterestRate(Float.parseFloat(interestRateEt.getText().toString()));
        interestCalculator.setTimePeriod(Float.parseFloat(timePeriodEt.getText().toString()));
        double interestAmount= interestCalculator.calculateInterest();
        double totalAmount=interestCalculator.calculateTotalAmount();
        interestAmountTv.setText(String.valueOf(interestAmount));
        totalAmountTv.setText(String.valueOf(totalAmount));
    }
}

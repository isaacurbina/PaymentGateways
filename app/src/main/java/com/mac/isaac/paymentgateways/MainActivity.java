package com.mac.isaac.paymentgateways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.go_paypal)
    Button goPaypal;
    @OnClick(R.id.go_paypal)
    public void usePayPal() {
        Intent i = new Intent(this, PaypalActivity.class);
        startActivity(i);
    }
    @Bind(R.id.go_androidpay)
    Button goAndroidPay;
    @OnClick(R.id.go_androidpay)
    public void goAndroidPay() {
        Intent i = new Intent(this, AndroidPayActivity.class);
        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

}

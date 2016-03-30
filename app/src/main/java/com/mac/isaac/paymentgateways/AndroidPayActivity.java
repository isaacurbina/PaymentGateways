package com.mac.isaac.paymentgateways;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AndroidPayActivity extends AppCompatActivity {

    @Bind(R.id.buy_button)
    Button buyButton;
    @OnClick(R.id.buy_button)
    public void buyButtonClick() {

    }
    @Bind(R.id.click_button)
    Button clickButton;
    @OnClick(R.id.click_button)
    public void clickButtonClick() {
        clickButton.setEnabled(false);
        buyButton.setEnabled(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_pay);
        ButterKnife.bind(this);
        clickButton.setEnabled(false);
    }

}

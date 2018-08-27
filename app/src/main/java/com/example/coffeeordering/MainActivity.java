package com.example.coffeeordering;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.fabiomsr.moneytextview.MoneyTextView;

public class MainActivity extends AppCompatActivity {

    private int mSmall = 0;
    private int mMedium = 0;
    private int mLarge = 0;
    private float mTotal = 0;
    private TextView mSmallCount;
    private TextView mMediumCount;
    private TextView mLargeCount;
    private MoneyTextView mTotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSmallCount = (TextView) findViewById(R.id.smallTotal);
        mMediumCount = (TextView) findViewById(R.id.mediumTotal);
        mLargeCount = (TextView) findViewById(R.id.largeTotal);
        mTotalPrice = (MoneyTextView) findViewById(R.id.totalPrice);
    }


    public void smallAdd(View view) {
        mSmall ++;
        mTotal += 3;
        if (mSmallCount != null)
        {
            mSmallCount.setText(Integer.toString(mSmall));
        }
        if (mTotalPrice != null)
        {
            mTotalPrice.setAmount(mTotal);
        }
    }

    public void mediumAdd(View view) {
        mMedium ++;
        mTotal += 3.45;
        if (mMediumCount != null)
        {
            mMediumCount.setText(Integer.toString(mMedium));
        }
        if (mTotalPrice != null)
        {
            mTotalPrice.setAmount(mTotal);
        }
    }

    public void largeAdd(View view) {
        mLarge ++;
        mTotal += 3.90;
        if (mLargeCount != null)
        {
            mLargeCount.setText(Integer.toString(mLarge));
        }
        if (mTotalPrice != null)
        {
            mTotalPrice.setAmount(mTotal);
        }
    }
}

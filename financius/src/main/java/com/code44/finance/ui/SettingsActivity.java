package com.code44.finance.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.code44.finance.R;
import com.code44.finance.ui.currencies.CurrenciesActivity;

public class SettingsActivity extends BaseActivity implements View.OnClickListener {
    public static void start(Context context, View expandFrom) {
        start(context, makeIntent(context, SettingsActivity.class), expandFrom);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setActionBarTitle(R.string.settings);

        // Setup
        findViewById(R.id.currencies_B).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.currencies_B:
                CurrenciesActivity.start(this, view);
                break;
        }
    }
}

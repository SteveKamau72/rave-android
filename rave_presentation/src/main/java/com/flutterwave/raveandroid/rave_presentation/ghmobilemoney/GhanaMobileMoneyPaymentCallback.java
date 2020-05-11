package com.flutterwave.raveandroid.rave_presentation.ghmobilemoney;

import android.support.annotation.Nullable;

public interface GhanaMobileMoneyPaymentCallback {
    void showProgressIndicator(boolean active);

    void onError(String errorMessage, @Nullable String flwRef);

    void onSuccessful(String flwRef);
}
package com.flutterwave.raveandroid.uk;

import com.flutterwave.raveandroid.Payload;
import com.flutterwave.raveandroid.ViewObject;
import com.flutterwave.raveandroid.responses.ChargeResponse;

import java.util.HashMap;

public class NullUkView implements UkContract.View {

    @Override
    public void showToast(String message) {

    }

    @Override
    public void showFetchFeeFailed(String s) {

    }

    @Override
    public void onPaymentError(String message) {

    }

    @Override
    public void showPollingIndicator(boolean active) {

    }

    @Override
    public void showProgressIndicator(boolean active) {

    }

    @Override
    public void onAmountValidationSuccessful(String amountToPay) {

    }

    @Override
    public void displayFee(String charge_amount, Payload payload) {

    }

    @Override
    public void onPaymentFailed(String message, String responseAsJSONString) {

    }

    @Override
    public void onValidationSuccessful(HashMap<String, ViewObject> dataHashMap) {

    }

    @Override
    public void showFieldError(int viewID, String message, Class<?> viewType) {

    }

    @Override
    public void onPollingRoundComplete(String flwRef, String txRef, String encryptionKey) {

    }

    @Override
    public void onPaymentSuccessful(String status, String flwRef, String responseAsString) {

    }

    @Override
    public void showTransactionPage(ChargeResponse response) {

    }
}
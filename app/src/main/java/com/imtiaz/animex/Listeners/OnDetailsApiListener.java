package com.imtiaz.animex.Listeners;

import com.imtiaz.animex.Model.Document;

public interface OnDetailsApiListener {
    void onResponse(Document response);
    void onError(String message);
}

package com.imtiaz.animex.Listeners;

import com.imtiaz.animex.Model.Root;

public interface OnSearchApiListener {
    void Response (Root response);
    void onError(String message);
}

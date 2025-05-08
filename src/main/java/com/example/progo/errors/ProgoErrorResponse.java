package com.example.progo.errors;

import java.time.LocalDateTime;

public class ProgoErrorResponse {
    private String timeStamp;
    private int statusCode;
    private String error;

    public ProgoErrorResponse(int status, String error){
        this.timeStamp = LocalDateTime.now().toString();
        this.statusCode = status;
        this.error = error;
    }
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

}
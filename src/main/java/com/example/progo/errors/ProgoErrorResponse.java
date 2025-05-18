package com.example.progo.errors;

import java.time.LocalDateTime;

/**
 * Represents an error response returned to the client.
 * Contains a timestamp, HTTP status code, and error message.
 */
public class ProgoErrorResponse {
  private String timeStamp;
  
  private int statusCode;
  
  private String error;

  /**
  * Constructs a new ProgoErrorResponse with a message, path, and status code.
  *
  * @param error the error message
  * @param status the HTTP status code
  */
  public ProgoErrorResponse(final int status, final String error) {
    this.timeStamp = LocalDateTime.now().toString();
    this.statusCode = status;
    this.error = error;
  }
  
  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(final String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(final int statusCode) {
    this.statusCode = statusCode;
  }

  public String getError() {
    return error;
  }

  public void setError(final String error) {
    this.error = error;
  }
}

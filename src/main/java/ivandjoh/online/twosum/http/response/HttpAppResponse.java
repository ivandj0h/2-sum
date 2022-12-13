package ivandjoh.online.twosum.http.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public class HttpAppResponse {

    @JsonProperty("status")
    private int status;
    @JsonProperty("message")
    private String message;

    public HttpAppResponse() {}
    public HttpAppResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HttpAppResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}

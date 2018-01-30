package rs.netcast.demo1.responses;

public class DemoResponse {

    String message;

    public DemoResponse() {
    }

    public DemoResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

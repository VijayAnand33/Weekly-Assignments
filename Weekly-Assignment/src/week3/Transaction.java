package week3;

public class Transaction {
    String id;
    double fee;
    String timestamp;

    public Transaction(String id, double fee, String timestamp) {
        this.id = id;
        this.fee = fee;
        this.timestamp = timestamp;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return id + ":" + fee;
    }
}
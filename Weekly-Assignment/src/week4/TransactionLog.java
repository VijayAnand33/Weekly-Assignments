package week4;

public class TransactionLog {
    String accountId;

    public TransactionLog(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return accountId;
    }
}
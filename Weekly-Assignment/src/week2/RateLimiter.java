package week2;

import java.util.*;

class TokenBucket {
    int tokens;
    long lastRefill;

    TokenBucket(int max) {
        tokens = max;
        lastRefill = System.currentTimeMillis();
    }
}

public class RateLimiter {

    static HashMap<String, TokenBucket> clients = new HashMap<>();
    static int LIMIT = 5;

    public static boolean checkRateLimit(String client) {
        clients.putIfAbsent(client, new TokenBucket(LIMIT));
        TokenBucket bucket = clients.get(client);

        if (bucket.tokens > 0) {
            bucket.tokens--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++)
            System.out.println(checkRateLimit("abc123"));
    }
}
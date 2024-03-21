package security;

import java.math.BigInteger;

// Define a Key
public class Key {
    private BigInteger key;
    private BigInteger n;

    public Key(BigInteger key, BigInteger n) {
        this.key = key;
        this.n = n;
    }

    // Getter methods
    public BigInteger getKey() {
        return key;
    }

    public BigInteger getN() {
        return n;
    }

    // Setter methods (optional, if needed)
    public void setKey(BigInteger key) {
        this.key = key;
    }

    public void setN(BigInteger n) {
        this.n = n;
    }

    // toString method (for printing)
    public String toString() {
        return "Key{" +
                "key=" + key +
                ", n=" + n +
                '}';
    }
}

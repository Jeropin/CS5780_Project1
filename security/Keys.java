package security;

// Define Keys (PublicKey, PrivateKey)
public class Keys {
    private Key publicKey;
    private Key privateKey;

    public Keys(Key publicKey, Key privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    // Getter methods
    public Key getPublicKey() {
        return publicKey;
    }

    public Key getPrivateKey() {
        return privateKey;
    }

    // Setter methods (optional, if needed)
    public void setPublicKey(Key publicKey) {
        this.publicKey = publicKey;
    }

    public void setPrivateKey(Key privateKey) {
        this.privateKey = privateKey;
    }

}

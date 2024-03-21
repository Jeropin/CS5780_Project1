package security;

import java.math.BigInteger;
import java.util.Random;

public class RSA {
	public static void main(String[] args) {
//		BigInteger[][] keyPairs = genKeys(10, 10);
		
		Keys serverKeys = genKeys(10,10);
		
		System.out.println(serverKeys.getPublicKey());
		System.out.println(serverKeys.getPrivateKey());
	}
	
	public static void printArray(byte[] data) {
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println();
	}
	
	public static Keys genKeys(int size, int certainty) {
		BigInteger p = new BigInteger(size, certainty, new Random());
		BigInteger q = new BigInteger(size, certainty, new Random());
		BigInteger n = p.multiply(q);
		
		BigInteger thetaN = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		System.out.println(thetaN);
		
		BigInteger e = BigInteger.probablePrime(size, new Random());
		while(thetaN.gcd(e).compareTo(BigInteger.ONE) != 0) {
			e = BigInteger.probablePrime(size, new Random());
		}
		
		BigInteger d = e.modInverse(thetaN);
		
		Key publicKey = new Key(e, n);
		Key privateKey = new Key(d, n);
		
		return new Keys(publicKey, privateKey);
		
	}
	
	public static byte[] cipher(byte[] message, BigInteger[] key) {
		
		byte[] cipherText = (new BigInteger(message).modPow(key[0], key[1])).toByteArray();
		
		return cipherText;
	}
	
}

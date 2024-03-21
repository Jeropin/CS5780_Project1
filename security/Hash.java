package security;

import java.math.BigInteger;


public class Hash {
	public static void main(String[] args) {
		
		int nDataBytes = 3;
		
		byte[] dataBytes = { (byte)0b01100101, (byte)0b10110101};
		int nCheckBytes = 1;
		byte pattern = 123;
		int k = 7;

		int checkSum = checkSum(dataBytes, nDataBytes, nCheckBytes, pattern, k);
		
		System.out.println(checkSum);
		
	}
	
	public static int checkSum(byte[] dataBytes, int nDataBytes, int nCheckBytes, byte pattern, int k) {
		
//		int dataSize = dataBytes.length;
//		int packetSize = nDataBytes + nCheckBytes + 1;
//		int numPackets = dataSize / nDataBytes;
//		byte[] packedBytes = new byte[numPackets * packetSize];
		
		
		int sum = 0;
		for(int i = 0; i < dataBytes.length; i++) {
			sum += (dataBytes[i] & pattern);
		}
		
		int checkSum = (sum * k) % (int) Math.pow(2, 8 * nCheckBytes);
		
		return checkSum;
	}
	
	
	// For testing purposes
	public static void printBinary(byte myByte) {
		int intValue = myByte & 0xFF; // Ensure byte is interpreted as unsigned
		String binaryString = Integer.toBinaryString(intValue);

		System.out.println("Binary representation of myByte: " + binaryString);
	}
	
	// For testing purposes
	public static void printBinary(int myByte) {
		String binaryString = Integer.toBinaryString(myByte);

		System.out.println("Binary representation of myByte: " + binaryString);
	}
}

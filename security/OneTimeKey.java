package security;

public class OneTimeKey {
	public static void main(String[] args) {
//		K = 10100110 00101110 01110101 01010110 10001110
//		byte[] K = {(byte) 0b10100110, (byte) 0b00101110, (byte) 0b01110101, (byte) 0b01010110, (byte) 0b10001110};
//		data = 00000010 01100101 10110101 00000000 11111110
		
		
		byte[] K = "xyz".getBytes();
		byte[] data = {(byte) 0b00000010, (byte) 0b01100101, (byte) 0b10110101, (byte) 0b00000000, (byte) 0b11111110};
	
		System.out.println(xor(K, data));
		
	}
	
	public static byte[] xor(byte[] K, byte[] data) {
		
		byte[] xor = new byte[K.length];
		
		int index = 0;
		
		for(int i = 0; i < K.length / data.length; i++) {
			for(int j = 0; j < data.length; j++) {
				xor[index] = (byte) (K[index] ^ data[j]);
				index++;
			}
		}
		
		return xor;
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

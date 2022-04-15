package prueba;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Prueba {

	public Prueba() {
	}

	public static void main(String[] args) throws IOException {
		String binFilename = "fibo.mv1";
		FileInputStream arch = new FileInputStream(binFilename);
		DataInputStream entrada = new DataInputStream(arch);
		int inst;
		for (int i=0;i<18;i++) {	// Lee el header
			inst = entrada.readInt();
			System.out.println(String.format("%02X %02X %02X %02X",(inst>>24)&0xFF,(inst>>16)&0xFF,(inst>>8)&0xFF,inst&0xFF));
		}
		arch.close();
		
		
	}
		
}

package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("c:\\temp\\in.txt") ; // coloca nome do arquivo
		Scanner sc = null;
		try {
			
			sc = new Scanner (file);
			while(sc.hasNextLine()) { // testar se ainda existe uma nova linha no arquivo
			System.out.println(sc.nextLine());	
			}
		}
		catch (IOException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		finally { // o finali fecha o recurso independente se deu certo o bloco de código ou não
			if(sc != null) { 
				sc.close(); 
			}
		}

	}

}

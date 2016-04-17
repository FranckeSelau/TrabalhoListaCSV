
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFile {
	
	CSVParser parseObject = new CSVParser();
	public void openFile(){
		try {
			FileReader fr = new FileReader("paciente.csv");
			Scanner leitor = new Scanner(fr);
			leitor.useDelimiter("[,\n]");
			CSVParser.parseObject(leitor);
			leitor.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println("ERRO! Arquivo não Encontrado");
		}
		readObject();
	}
	public void readObject(){
		for (Paciente p : PacienteParser.getListaPacientes()) {
			System.out.println(p);
		}
	}
}

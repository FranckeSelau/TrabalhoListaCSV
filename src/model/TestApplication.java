package model;

public class TestApplication {

	public static <T> void main(String[] args) {
		CSVFile<T> leitura = new CSVFile<T>();
		
		leitura.openFile();					
	}
}



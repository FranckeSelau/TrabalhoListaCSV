package model;
import java.util.Scanner;

public interface CSVParser<T> {
	T parseObject (String string);	
}

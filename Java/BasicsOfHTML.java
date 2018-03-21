/**
*    Problem: Basics of HTML
*    URL: http://www.codeabbey.com/index/task_view/basics-of-html
*    Autor: Mykhailo Kruts
*    Date: 21 March 2018
*/

import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.*;
import java.nio.file.*;

public class BasicsOfHTML {
    public static void main (String[] args) throws IOException {
    	Scanner reader = new Scanner(System.in);
    	final String SECRET_VALUE = reader.next();
    	final String FILE_NAME = "simple.html";
		final String SEARCH_VALUE = "######";

        Charset charset = StandardCharsets.UTF_8;
        Path path = Paths.get(FILE_NAME);
        Files.write(path, new String(Files.readAllBytes(path), charset).replace(SEARCH_VALUE, SECRET_VALUE).getBytes(charset));

		reader.close();
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ReplaceChar replaceChar = new ReplaceChar(reader.readLine());
        new Thread(new ThreadClass('a','o',replaceChar),"Thread1").start();
        new Thread(new ThreadClass('a','н',replaceChar),"Thread2").start();
    }
}

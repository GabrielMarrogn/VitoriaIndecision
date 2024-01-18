import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i < a; i++){
            String b = br.readLine();
        }

        System.out.println("Ciencia da Computacao");
    }
}

package dao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    // Attributes
    public List<String> usernameList = new ArrayList<>();

    // Default constructor
    public UserStorage() {

    }

    // Save data to file
    public void storeUserData(List<String> usernames) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            for (String username : usernames) {
                writer.write(username);
                writer.newLine();
            }
            System.out.println("Usuários salvos com sucesso em um arquivo");
        } catch (IOException e) {
            System.err.println("Erro ao armazenar usuários: " + e.getMessage());
        }
    }

    // Get data from file
    public void getUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Updated to handle any number of parts
                usernameList.add(line);
            }
            System.out.println("Dados obtidos com sucesso dos usuários nos arquivos");
        } catch (IOException e) {
            System.err.println("Erro ao obter os dados dos usuários nos arquivos: " + e.getMessage());
        }
    }


    public List<String> return_users(){
        return usernameList;
    }
}

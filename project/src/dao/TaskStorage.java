package dao;

//used libraries
import model.Cryptography;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TaskStorage {

    //attributes
    public List<String> copy_username;
    public List<String> copy_priority;
    public List<String> copy_content;

    //class change it so that no one can read it
    Cryptography cryptography = new Cryptography();

    public TaskStorage(){}

    //update list data
    public void update_lists(
            List<String> username,
            List<String> priority,
            List<String> content
    ){
        copy_username = username;
        copy_content = content;
        copy_priority = priority;
        getFileTask();
    }

    //store data in file
    public void storeFileTask(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("data_task"))){
            for (int i=0;i<copy_username.size();i++){
                writer.write(cryptography.Encrypt(copy_username.get(i))+","+cryptography.Encrypt(copy_priority.get(i))+","+cryptography.Encrypt(copy_content.get(i)));
                writer.newLine();
            }
        }catch (IOException e){System.out.println("");}
    }

    //get the data on file
    public void getFileTask(){
        try(BufferedReader reader = new BufferedReader(new FileReader("data_task"))){
            String line;
            while ((line = reader.readLine())!=null){
                String [] parts = line.split(",");
                if(parts.length ==3){
                    copy_username.add(cryptography.Decrypt(parts[0]));
                    copy_priority.add(cryptography.Decrypt(parts[1]));
                    copy_content.add(cryptography.Decrypt(parts[2]));
                }
            }
        }catch (IOException e){System.out.println("");}
    }
}

package dao;

//used libraries
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

    public TaskStorage(){

    }

    //update list data
    public void update_lists(List<String> username,List<String> priority,List<String> content){
        copy_username = username;
        copy_content = content;
        copy_priority = priority;
        getFileTask();
    }

    //store data in file
    public void storeFileTask(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("data_task.txt"))){
            for (int i=0;i<copy_username.size();i++){
                writer.write(copy_username.get(i)+","+copy_priority.get(i)+","+copy_content.get(i));
                writer.newLine();
            }
        }catch (IOException e){System.out.println("");}
    }

    //get the data on file
    public void getFileTask(){
        try(BufferedReader reader = new BufferedReader(new FileReader("data_task.txt"))){
            String line;
            while ((line = reader.readLine())!=null){
                String [] parts = line.split(",");
                if(parts.length ==3){
                    copy_username.add(parts[0]);
                    copy_priority.add(parts[1]);
                    copy_content.add(parts[2]);
                }
            }
        }catch (IOException e){System.out.println("");}
    }
}

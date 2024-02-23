package model;

//used libraries
import java.util.ArrayList;
import  java.util.List;
public class Task {

    //attributes

    public List<String> tasks = new ArrayList<>();
    public List<String>  taskcontent = new ArrayList<>();
    public int count = 0;

    public Task(){}

    //method for creating tasks
    public void create(String priority,String content){
        taskcontent.add(content);
        tasks.add("\n");
        count+=1;
        String content_task = "Task [ "+count+" ] , "+"Priority[ "+priority+" ] , "+"Content[ "+content+" ]";
        tasks.add(content_task);
        tasks.add("\n");
    }

    //method for deleting tasks
    public void delete(String content) {
        int occurrences = 0;

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).equals(content)) {
                occurrences++;
            }
        }

        if (occurrences == 0) {
            System.out.println("Dado não encontrado");
        } else {
            System.out.println("Total de " + occurrences + " dados deletados");
            tasks.removeIf(task -> task.equals(content));
        }
    }


    public void search(){

    }

    public void deleteAll(){

    }

    //method for showing tasks
    public void print(){
        System.out.println(tasks);
        System.out.println(taskcontent);
    }

}

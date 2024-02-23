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
        String content_task = "Priority[ "+priority+" ] , "+"Content[ "+content+" ]";
        tasks.add(content_task);
        tasks.add("\n");
    }

    //method for deleting tasks
    public void delete(String content) {
        int index=0;
        for(int i=0;i<taskcontent.size();i++){
            String data = taskcontent.get(i);
            if(data.equals(content)){
                break;
            }
            index+=1;
        }
       taskcontent.remove(content);
        tasks.remove(index);
        System.out.println(index);
    }


    public void search(){

    }

    public void deleteAll(){

    }

    //method for showing tasks
    public void print(){
        System.out.println(tasks);

    }

}

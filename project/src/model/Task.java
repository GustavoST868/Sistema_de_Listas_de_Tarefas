package model;

//used libraries
import java.util.ArrayList;
import  java.util.List;
public class Task {

    //attributes that make up the tasks

    public List<String>  priorityList = new ArrayList<>();
    public List<String>  contentList = new ArrayList<>();

    public Task(){}

    //method for creating tasks
    public void create(String priority,String content){
        try{
            priorityList.add(priority);
            contentList.add(content);
        }catch (Exception e){
            System.out.println("Erro na função de criar tarefa");
        }

    }

    //method for deleting tasks
    public void delete(String content) {
        int index = 0;
        try{
            for (String data:contentList){
                if(data.equals(content)){
                    break;
                }else {
                    index+=1;
                }
            }
            contentList.remove(index);
            priorityList.remove(index);
            System.out.println("\nDado apagado\n");
        }catch (Exception e){
            System.out.println("\nErro ao apagar o dado\n");
        }

    }

    //search function
    public void search(String content){
        for (String data:contentList){
            if(data.equals(content)){
                System.out.println("\nDado encontrado");
                return;
            }
        }
        System.out.println("Dado não encontrado");
    }

    //function to delete data
    public void deleteAll(){
        contentList.clear();
        priorityList.clear();
    }

    //method for showing tasks
    public void print(){
        System.out.println("\nTarefas:");
        for(int i=0;i<contentList.size();i++){
            System.out.println("index = "+i+" , priority = "+priorityList.get(i)+", content = "+contentList.get(i));
        }
    }
}

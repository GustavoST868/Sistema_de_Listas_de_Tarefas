package model;

//used libraries
import java.util.ArrayList;
import  java.util.List;
public class Task {

    //attributes that make up the tasks
    public List<String>  username = new ArrayList<>();
    public List<String>  priorityList = new ArrayList<>();
    public List<String>  contentList = new ArrayList<>();

    public Task(){}

    //method for creating tasks
    public void create(String user, String priority,String content){
        try{
            username.add(user);
            priorityList.add(priority);
            contentList.add(content);
        }catch (Exception e){
            System.out.println("Erro na funcao de criar tarefa");
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
            username.remove(index);
            System.out.println("\nDado apagado\n");
        }catch (Exception e){
            System.out.println("\nErro ao apagar o dado\n");
        }

    }

    //search function
    public void search(String content){
        try{
            for (String data:contentList){
                if(data.equals(content)){
                    System.out.println("\nDado encontrado");
                    return;
                }
            }
            System.out.println("Dado nao encontrado");
        }catch (Exception e){
            System.out.println("Erro na pesquisa de tarefas");
        }
    }

    //function to delete data
    public void deleteAll(){
        try{
            contentList.clear();
            priorityList.clear();
            username.clear();
        }catch (Exception e){
            System.out.println("Erro na funcao de deletar tarefas");
        }

    }

    //method for showing tasks
    public void print(){
        try {
            System.out.println("\nTarefas:");
            for(int i=0;i<contentList.size();i++){
                System.out.println("index = "+i+"username = "+username.get(i)+" priority = "+priorityList.get(i)+", content = "+contentList.get(i));
            }
        }catch (Exception e ){
            System.out.println("Erro na funcao de mostrar tarefas");
        }

    }
}

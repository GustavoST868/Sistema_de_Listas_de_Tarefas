package model;

//used libraries
import java.util.ArrayList;
import  java.util.List;
public class Task {

    //attributes that make up the tasks
    public List<String>  username = new ArrayList<>();
    public List<String>  priorityList = new ArrayList<>();
    public List<String>  contentList = new ArrayList<>();
    CheckType checkType = new CheckType();

    public Task(){}

    //method for creating tasks
    public void create(
            String user,
            String priority,
            String content
    ){
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
        if(checkType.checkType(content) == 1 ||checkType.checkType(content) == 3){
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
        }else{
            try{
                contentList.remove(Integer.parseInt(content));
                priorityList.remove(Integer.parseInt(content));
            }catch (Exception e){
                System.out.println("Erro ao tentar apagar o dado");
            }
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
    public void deleteAll(String user){
        try{
            int index = 0;
            for(int i =0 ; i<username.size();i++){
                if(username.get(i).equals(user)){
                    username.remove(index);
                    priorityList.remove(index);
                    contentList.remove(index);
                }
                index+=1;
            }
        }catch (Exception e){
            System.out.println("Erro na funcao de deletar tarefas");
        }
    }

    //method for showing tasks
    public void print(String username_main){
        try {
            if (contentList.isEmpty()) {
                System.out.println("Não há tarefas criadas no momento.");
            } else {
                System.out.println("\n\nTarefas:");
                for (int i = 0; i < contentList.size(); i++) {
                    if (username.get(i).equals(username_main)) {
                        System.out.printf("Índice: %d, Prioridade: %s, Conteúdo: %s%n",
                                i, priorityList.get(i), contentList.get(i));
                    }
                }
                System.out.println("\n\n");
            }
        } catch (Exception e) {
            System.out.println("Erro na função de mostrar tarefas");
        }
    }

    //update list data
    public void updata_user(List<String> user_list_update){
        username = user_list_update;
    }

    //get priority list
    public List<String> getListPriority(){
        try{
            return priorityList;
        }catch (Exception e ){
            System.out.println("Erro na funcao de retornar a lista de prioridade");
            return priorityList;
        }
    }

    //get content list
    public List<String> getListContent(){
        try{
            return contentList;
        }catch (Exception e ){
            System.out.println("Erro na funcao de retornar a lista de conteudo");
            return contentList;
        }
    }

    //get username list
    public List<String> getListUsername(){
        try{
            return username;
        }catch (Exception e){
            System.out.println("Erro na funcao para  retornar a lista de usuarios");
            return username;
        }
    }
}

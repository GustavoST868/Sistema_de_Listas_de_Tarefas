package model;


//used libraries
import java.util.ArrayList;
import  java.util.List;

public class User {

    //attributes that make up the users

    public List<String>  username = new ArrayList<>();


    public User(){

    }

    //method for creating user
    public void create(String user){
        try{
            username.add(user);

        }catch (Exception e){
            System.out.println("Erro ao criar o usuario");
        }

    }

    //method for deleting user
    public void delete(String user){
        try{
            username.remove(user);

        }catch (Exception e ){
            System.out.println("Erro ao remover o usuario");
        }

    }

    //search function
    public void search(String user){
        try{
            for (String data:username){
                if(data.equals(user)){
                    System.out.println("\nUsuário encontrado");
                    return;
                }
            }
            System.out.println("Usuário não encontrado");
        }catch (Exception e){
            System.out.println("Erro ao procurar o usuario");
        }
    }

    //function to delete data
    public void deleteAll(){
        try{
            username.clear();
        }catch (Exception e){
            System.out.println("Erro ao apagar as lista de senha e usuario");
        }
    }

    //method for showing tasks
    public void print(){
        System.out.println("\nUsuarios:");
        for (String s : username) {
            System.out.println(s);
        }
    }

    public List<String> getUsernameList(){
        return username;
    }

    public void pull(List<String> user){
        username = user;
    }


}

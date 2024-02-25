package model;


//used libraries
import java.util.ArrayList;
import  java.util.List;

public class User {

    //attributes that make up the users

    public List<String>  username = new ArrayList<>();
    public List<String>  password = new ArrayList<>();

    public User(){

    }

    //method for creating user
    public void create(String user,String pass){
        try{
            username.add(user);
            password.add(pass);
        }catch (Exception e){
            System.out.println("Erro ao criar o usuario");
        }

    }

    //method for deleting user
    public void delete(String user,String pass){
        try{
            username.remove(user);
            password.remove(pass);
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
            password.clear();
        }catch (Exception e){
            System.out.println("Erro ao apagar as lista de senha e usuario");
        }
    }

    //method for showing tasks
    public void print(){
        System.out.println("\nUsuarios:");
        for(int i=0;i<username.size();i++){
            System.out.println("index = "+i+" , username = "+username.get(i)+", pass = "+password.get(i));
        }
    }
}

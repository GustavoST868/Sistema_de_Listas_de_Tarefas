package dao;

//userd libraries
import java.util.ArrayList;
import  java.util.List;


public class UserStorage {

    //attributes
    public List<String>  usernameList = new ArrayList<>();
    public List<String>  passwordList = new ArrayList<>();

    public  UserStorage(List<String> username,List<String> password){
        usernameList = username;
        passwordList = password;
    }

    public void StoreUserData(){

    }
}

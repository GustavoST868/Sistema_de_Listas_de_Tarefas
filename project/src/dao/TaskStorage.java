package dao;

import java.util.List;

public class TaskStorage {

    public List<String> copy_username;
    public List<String> copy_priority;
    public List<String> copy_content;

    public TaskStorage(){

    }

    public void update_lists(List<String> username,List<String> priority,List<String> content){
        copy_username = username;
        copy_content = content;
        copy_priority = priority;
    }

    public void storeFileTask(){

    }

    public void getFileTask(){

    }

    /*

    public List<String> getListCopyPriority(){

    }

     */


    /*

    public List<String> getListCopyContent(){

    }

     */

}

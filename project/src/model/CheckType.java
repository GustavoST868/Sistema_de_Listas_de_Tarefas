package model;
//class to check the type of the string
public class CheckType {
    //attributes
    public CheckType(){}

    // check the data type
    public int checkType(String input){
        if(input.matches("[a-zA-Z]+")){
            //return  what is text
            return 1;
        }else if(input.matches("\\d+")){
            //return what is number
            return 2;
        }else{
            //return what is compound
            return 3;
        }
    }

}

package model;

//class it so that no one can read it
public class Cryptography {

    //constructor
    public Cryptography(){

    }

    //function to encrypt
    public String Encrypt(String text){
        char[] text_vector  = text.toCharArray();
        try{

            for(int i=0;i< text_vector.length;i++){
                char current_character = text_vector[i];
                if(Character.isLetter(current_character)){
                    if(Character.isUpperCase(current_character)){
                        text_vector[i] = (char) (((current_character - 'A'+3)%26) + 'A');
                    }else{
                        text_vector[i] = (char) (((current_character - 'a'+3)%26) + 'a');
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Erro na funcao de criptografar o texto");
        }
        return new String(text_vector);
    }

    //function to decrypt
    public String Decrypt(String text){
        char[] text_vector = text.toCharArray();
        try{
            for (int i = 0; i < text_vector.length; i++) {
                char current_character = text_vector[i];
                if (Character.isLetter(current_character)) {
                    if (Character.isUpperCase(current_character)) {
                        text_vector[i] = (char) (((current_character - 'A' + 23) % 26) + 'A');
                    } else {
                        text_vector[i] = (char) (((current_character - 'a' + 23) % 26) + 'a');
                    }
                }
            }
        }catch (Exception e){
            System.out.println("Erro na funcao de descriptografar o texto");
        }
        return new String(text_vector);
    }
}

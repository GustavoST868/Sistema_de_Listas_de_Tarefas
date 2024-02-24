import model.Task;

public class Main {
    public static void main(String[] args) {
        //test
        Task task = new Task();
        task.create("Alta","Criar classes");
        task.create("Baixa","Ligar para Camily");
        task.print();
        task.delete("Ligar para Camily");
        task.print();
        boolean result = task.search("Ligar para Camily");
        if(result){
            System.out.println("\nDado encontrado");
        }else {
            System.out.println("\nDado não encontrado");
        }

        task.deleteAll();
        task.print();
    }
}
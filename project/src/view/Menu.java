package view;

//used libraries
import dao.TaskStorage;
import model.Task;
import java.util.Scanner;

public class Menu {

    //attributes and objects
    Scanner scanner = new Scanner(System.in);
    TaskStorage taskStorage = new TaskStorage();
    Task task = new Task();

    public Menu(){}
    //method for creating menu
    public void menu(){

        //transfer data from file to lists
        taskStorage.update_lists(task.getListUsername(),task.getListPriority(),task.getListContent());

        int option;

        //get username
        System.out.println("\nNome do usuário: \t");
        String user = scanner.nextLine();

        //loop to keep the user in the program
        while (true){
            System.out.println("\n\n=============== Menu de Tarefas ===============");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Apagar Tarefa");
            System.out.println("3. Pesquisar Tarefa");
            System.out.println("4. Mostrar Tarefas");
            System.out.println("5. Mudar de usuário");
            System.out.println("6. Deletar todas as tarefas");
            System.out.println("7. Editar tarefa");
            System.out.println("8. Mostrar usuários com tarefas criadas");
            System.out.println("===============================================");

            //get menu option
            option = scanner.nextInt();
            scanner.nextLine();

            try{
                //options menu
                switch (option){
                    case 1:
                        System.out.print("Informe a prioridade: ");
                        String priority = scanner.nextLine();

                        System.out.print("Informe o conteúdo: ");
                        String content = scanner.nextLine();

                        task.create(user,priority,content);
                        break;
                    case  2:
                        System.out.print("Informe o conteúdo: ");
                        String content_two = scanner.nextLine();
                        task.delete(content_two);
                        break;
                    case 3:
                        System.out.print("Informe o conteúdo: ");
                        String content_three = scanner.nextLine();
                        task.search(content_three);
                        break;
                    case 4:
                        task.print(user);
                        break;

                    case 5:
                        System.out.println("\nNome do usuário: ");
                        user = scanner.nextLine();
                        break;
                    case 6:
                        task.deleteAll(user);
                    break;
                    case 7:
                        System.out.println("Informe o conteúdo ou indice da tarefa: ");
                        String content_index = scanner.nextLine();
                        task.edit(content_index);
                        break;
                    case 8:
                        task.printUsers();
                        break;
                    default:
                        System.out.println("Esta opção não é valida!");
                }
            }catch (Exception e){
                System.out.println("Erro no menu de opcoes");
            }

            System.out.println("\nDeseja sair e  salvar os dados? [S/N]");
            String option_one = scanner.nextLine();

            //structure to close the program or not
            if(option_one.equals("S") || option_one.equals("s")){ break;}
        }
        try{
            //store data in file
            taskStorage.storeFileTask();
        }catch (Exception e){
            System.out.println(".");
        }
    }
}

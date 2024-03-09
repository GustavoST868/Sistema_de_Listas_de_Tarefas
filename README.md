# Sistema_de_Gerenciamento_de_Tarefas
Desenvolvendo um sistema de gerenciamento de tarefas.
Classe Cryptography:

  A classe Cryptography desempenha um papel crucial na segurança do sistema, fornecendo métodos para criptografar e descriptografar dados sensíveis. Os métodos Encrypt e Decrypt implementam uma cifra de deslocamento simples, garantindo a proteção dos textos contra leitura não autorizada.

Método Encrypt(String text):

  Criptografa o texto fornecido.
  
Retorna: Uma versão criptografada do texto original.

Método Decrypt(String text):

Descriptografa o texto fornecido.
Retorna: Uma versão descriptografada do texto original.

Classe TaskStorage:

A classe TaskStorage gerencia o armazenamento e a recuperação de tarefas em um arquivo, incorporando segurança por meio da classe Cryptography. Ela inclui métodos para atualizar listas de tarefas, armazenar tarefas de forma segura em um arquivo e recuperar tarefas do arquivo.

Atributos:

copy_username, copy_priority, copy_content: Listas que armazenam cópias dos dados das tarefas.
cryptography: Instância da classe Cryptography para garantir a segurança dos dados.

Método update_lists(List<String> username, List<String> priority, List<String> content):

Atualiza as listas de tarefas com os dados fornecidos e chama o método getFileTask() para garantir a integridade do arquivo.

Método storeFileTask():

Armazena os dados criptografados das tarefas em um arquivo chamado "data_task".

Método getFileTask():

Recupera os dados criptografados das tarefas do arquivo "data_task", decifrando-os e atualizando as listas copy_username, copy_priority, e copy_content.

Classe Task:

A classe Task representa uma tarefa no sistema, oferecendo métodos para criar, excluir, pesquisar, mostrar, atualizar e obter listas de tarefas.

Atributos:

username, priorityList, contentList: Listas que armazenam os dados das tarefas.

Método create(String user, String priority, String content):

Cria uma nova tarefa com os dados fornecidos e a adiciona às listas correspondentes.

Método delete(String content):

Exclui uma tarefa com base no conteúdo fornecido.

Método search(String content):

Procura uma tarefa com base no conteúdo fornecido e imprime se foi encontrada ou não.
Método deleteAll():


Exclui todas as tarefas, limpando as listas.

Método print(String username_main):

Imprime as tarefas associadas ao nome de usuário fornecido.

Método updata_user(List<String> user_list_update):

Atualiza a lista de usuários.

Método getListPriority(), getListContent(), getListUsername():

Retorna as listas de prioridades, conteúdos e nomes de usuário, respectivamente.

Classe Main:

A classe Main é a peça central do programa, contendo o método main que dá início à execução do sistema. Ela cria uma instância da classe Menu e invoca o método menu para apresentar as opções do menu principal de forma elegante.

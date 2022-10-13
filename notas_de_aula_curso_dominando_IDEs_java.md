# Notas de Aula Sobre o Curso "Dominando IDEs JAVA", da DIO.

## IDE Eclipse

### Compilado de comentários sobre atalhos e comandos na IDE Eclipse

- o Ponto no nome do pacote indica os diretórios. Por exemplo: "src.dio" indica que o diretório "dio" está dentro do diretório "src".

- /* comentários em java são feitos entre barras e asteriscos */
- selecionando um bloco inteiro e clicando "ctrl + shift + c" o bloco será todo comentado
- ctrl + m = deixa a janela de edição em tela inteira ou tira da tela inteira

 * ctrl + 3 = pesquisa (lupa)

    * procurar a linguagem e a "perspective" para configurar o ambiente da IDE (caso queira mudar)
    * procurar por "constructor" (generate constructor...) para utilizar um construtor automático com os campos do objeto/class criado  com os campos desejados, como o campo "private tipo variável"
    * "gas" para gerar os getters and setters
    * "equals" para gerar hashcode() and equals()
    * "toString" para gerar o toString()
 * mudar um bloco selecionado de lugar: segurar alt e mover com a seta
 * ctrl + d = apaga a linha de código
 * "sysout" + ctrl + space = para printar
 * ctrl + shift + f = endentação automática (Java roda mesmo sem endentação)
 * ctrl + shift + o = cria o import automático do pacote utilizado caso a importação ainda não tenha sido realizada
 * ctrl + alt + seta para baixo ou para cima = duplica a seleção abaixo ou acima do texto selecionado
 * ctrl + 1 = cria um variável (Assign static new variable)
 * ctrl + 2, L = faz a criação da variável
 * ctrl + shift + t = pesquisar uma classe para abrir
 * ctrl + w = fechar a aba
 * ctrl + shift + w = fechar todas as abas

### Commit e push pela IDE

- Clicar com o botão direito do mouse no diretório desejado > team > share project. 
- Selecionar "Use or create repository...", selecionar o repositório desejado, "create repository" e "finish". (A partir daqui o versionamento/git é inicializado)
- Botão direito > team > commit
- Caso desejar, mudar a perspectiva para tipo Git
- Selecionar a janela "Git Staging"
- Adicionar os arquivos Unstaged desejados para Staged (clicando no símbolo de mais duplo, adiciona toda a área unstaged para staged)
- Escrever a mensagem do commit na janela "Commit Message"
- Clicar em "Commit and push" para fazer o commit e já fazer o push para o repositório remoto. Preencher os dados do repositório remoto (e.g. GitHub) com o link e o que for necessário. (Aqui foi realizado o commit no repositório local, bem como o push para o repositório remoto)
- É possível também importar um projeto: Import project > existing projects  into working space, ou importar de um repositório remoto como o GitHub através do da opção "Clone Git repository"

### Debug

Encontrar e corrigir erros que aparecem no código/programa

- clicar ao lado do número da linha de código que se deseja analisar para deixar uma "bolinha", chamada de break point

- Botão direito > debug as > java application

- Ao rodar o debug, o código será rodado normalmente até o ponto de debug escolhido
- Há a sugestão de mudança de perspectiva para debug
- F5 = entrar no método de funções da linha no break point
- F7 = retorna para a linha que estava
- F6 Pula a próxima linha de código, mostrando os resultados (executando a linha)



## IDE Intellij

Creat project from template: inicia uma aplicação simples Java com o método main (public static void main)

Para atalhos no Intellij: 

- [BASEF](http://www.basef.com.br/index.php/Atalhos_do_IntelliJ_Idea)
- [Jetbrains](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)

### Compilado de comentários sobre atalhos e comandos na IDE Intellij

- selecionar *src* e utilizar o atalho "alt + insert" para selecionar então a criação dos pacotes e classes
- no Intellij não é necessário "ctrl + space", pois os comandos são sugeridos automaticamente
- "sout" é o equivalente do "sysout" para imprimir
- "psvd" para criar o "public static void main", ou apenas digitar "main" que aparecerá a criação do método para dar enter e criar automaticamente
- na opção "add configuration" é possível ajustar as configurações para rodar o programa
- ctrl + shift + F10 = roda o programa pela primeira vez. Após isto, basta o "shift + F10" para rodar novamente
- Alt + insert = para procurar os geradores automáticos de construtores, getters and setters, equals() and hashCode(), toString() ...
- Selecionando um bloco e dando o comando "ctrl + shift + /", o bloco é comentado (/\*bloco\*/)
- ctrl + / = comenta o bloco selecionado linha por linha
- // = comentário na linha, ou por /* "comentário" */
- Assim como no Eclipse, a um objeto criado em um programa que utiliza uma classe externa, necessita a importação do pacote que contém esta classe. o Comando "alt + enter" faz o *import* automático do pacote externo, e caso a classe que o utiliza deixe de aparecer, ou seja comentada, o import do pacote fica equivalente a um comentário.
- ctrl + alt + o = limpa os imports não utilizados no programa
- ctrl + y = deleta uma linha de código
- shift + F6 = refatorar uma classe selecionada (F2 no Eclipse)
- shift + F12 = aumenta ou diminui o editor de texto (ctrl + m no Eclipse)
- ctrl + alt + l = formatação/identação automática
- ctrl + d = duplicar linha
- ctrl + shift + seta para cima/baixo = reposiciona para cima/baixo o bloco selecionado
- ctrl + k = faz o commit de um repositório
- Durante a criação de um construtor, o Intellij indica os atributos, o que o Eclipse não faz.
- alt + enter = durante a criação de uma variável, caso a variável não tenha sido declarada, isto é feito

### Commit e push pela IDE

- Iniciar o repositório GIT: Selecionar a aba "VCS" > "Enable Version Control Integration" > Selecionar o controle de versão desejado (e.g. GIT)
- Fazer o commit: "VCS" > "Commit". Ou utilizar o atalho "ctrl + k"
- Fazer o Push: "VCS" > "push". Ou utilizar o atalho "ctrl + shift + k". Seguir os passos necessários.
- durant o push, selecionar a opção "Push tags: All"

### Debug

O Debug no Intellij segue a mesma lógica descrita anteriormente para o Eclipse, mudando apenas os atalhos dos comandos de análise.





##### :writing_hand: Escrito por: Gustavo Hermógenes



###### Nota: Durante os estudos, percebi que o termo correto para fazer referência ao ato de organizar o código com espaços de parágrafo determinados, usualmente referido como *identação*, é *endentação*.

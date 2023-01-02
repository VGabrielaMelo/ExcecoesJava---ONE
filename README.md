# Java

# Tratamento de Exceções
## Algumas Exceções
- ArithmeticException
- NullPointerException
- StackOverflowError: é um erro da máquina virtual para informar que a pilha de execução não tem mais memória.

## Pilha (Stack) de Execução 
- O primeiro a entrar é o último a sair.

## Hierarquia de exceções 
<p align="center" >
    <img width="400" heigth="400" src="https://arquivo.devmedia.com.br/artigos/Thiago_Varallo/Excecoes_Java/Excecoes_Java2.jpg">
</p>

## Criando exceções 
- A classe precisa herdar "RuntimeException", "Exception", alguma classe que herde "Throwable".
- A classe "Throwable" não pode ser herdada diretamente, pois, ela não trabalha só com exceções e sim com erros tambem, o lado de erros é direcionada para aplicações de maquinas virtuais.

## Try | Catch
- Não é possível ter uma intrução CATCH, sem uma instrução TRY.
   - getMessage()
   - printStackTrace()
## Multi Catch
- 

## Throw / Throws
- Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha (através da palavra reservada throw)
- 

## Finally 
- É opcional quando há bloco catch.
- Sempre será executado (sem ou com exceção).
- É tipicamente utilizado para fechar um recurso como conexão ou transação.

## Try with resourse
- 

## Checked e Unchecked
- Checked: são verificados pelo compilador
Erros que acontecem fora do controle do programa, mas que devem ser tratados pelo desenvolvedor para o programa funcionar.

- Unchecked: não são verificados pelo compilador.
Erros que podem ser evitados se forem tratados e analisados pelo desenvolvedor. Caso haja um tratamento para esse tipo de erro, o programa acaba parando em tempo de execução.

- Error: Usado somente pela Maquina Virtual Java, serve para indicar se existe algum problema de recurso do programa, tornando a execução impossível de continuar.
Não pode ser tratado. 

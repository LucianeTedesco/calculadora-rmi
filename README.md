# Aplicação utilizando Java RMI
Trabalho da disciplina de Sistemas Distribuídos - Aplicação com Java RMI - Calculadora

A aplicação RMI implementada como exemplo é realmente muito simples. Trata-se de uma calculadora que recebe dois inteiros e devolve sua soma. A aplicação cliente se conectará à aplicação servidor, enviará dois valores inteiros e o servidor devolverá a soma dos valores informados. 

### Execução:
1) Setar na variável de ambiente CLASSPATH o valor: 
```bash
<Diretório>\calculadora-rmi\src\br\furb\calculator\server\CalculatorServer.jar
```
2) Iniciar o RMI Registry, através do prompt de comandos: 
```bash
start rmiregistry
```
3) Executar a classe MainServer, através do prompt de comandos, a partir do jar gerado (CalculatorServer.jar):
```bash
cd <Diretório>\calculadora-rmi\src\br\furb\calculator\server\
java -jar CalculatorServer.jar
```
4) Executar a classe MainClient, através do prompt de comandos, a partir do jar gerado (CalculatorClient.jar):
```bash
cd <Diretório>\calculadora-rmi\src\br\furb\calculator\client\
java -jar CalculatorClient.jar
```
***    
### Exemplo de Saída:
Server:
```console
Servidor Calculadora CalculatorServerInterfaceImpl[UnicastServerRef [liveRef: [endpoint:[192.168.47.1:60327](local),objID:[30546c23:16a3dd679c3:-7fff, 2939079328752826600]]]] registrado e pronto para aceitar solicitaç?es.
Somar: A 2 B 5
```
Client:
```console
O objeto servidor Proxy[CalculatorServerInterface,RemoteObjectInvocationHandler[UnicastRef [liveRef: [endpoint:[192.168.47.1:60327](remote),objID:[30546c23:16a3dd679c3:-7fff, 2939079328752826600]]]]] foi encontrado com sucesso.

A soma de 2 + 5 é: 7
```


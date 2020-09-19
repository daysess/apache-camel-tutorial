
# Tutorial do Apache Camel
#### Realizado no youtube por Dinesh Krishnan 
- [Seu link no canal no youtube](https://www.youtube.com/channel/UCS2ex_Z4kjBckbVcSa1ebEA)

## Dicas:

1. Criar projeto maven;
2. Acrescentar a dependencia do apache camel em pom.xml.
    * Acessar o site: 
        - [mvnrepository](https://mvnrepository.com) 
        - Procurar o camel core e pegar a ultima versão.
No exemplo do repositório foi utilizado a versão:
```
<!-- https://mvnrepository.com/artifact/org.apache.camel/camel-core -->
<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-core</artifactId>
    <version>3.5.0</version>
</dependency>
```

## Cada commit no repositório contém os exemplos abaixo:

1. Primeiro exemplo: Olá mundo.
2. Segundo exemplo: Copia de arquivo. 
    - Após criacao da class CopiaArquivo, execute o main para que a pasta output_box seja criada automaticamente. 
    - Cria um arquivo com o nome empty e executa o main da class CopiaArquivo novamente.
    - Você visualizará que o arquivo que chega na pasta input_box será copiado para a pasta output_box. 

3. Terceiro exemplo: Consumir e Produzir
4. Quarto exemplo: Trabalhando com ActiveMQ
    Nesse exemplo é mostrado como criar uma fila e alimenta-la com os dados de um arquivo. 
    Para isso é necessário baixar o apache-activemq (http://activemq.apache.org/activemq-5154-release)
    - Abrir o cmd e dentro da pasta ... apache-activemq-x.xx.x\bin, digitar o codigo: activemq start
    - Acesse: http://localhost:8161/
    - Clique na opção Manage ActiveMQ broker;
    - Informe o usuário: admin, senha: admin;
    - Para criar uma fila, clique em Queues, informe o nome da fila e clique em criar.

    Acesse o portal: https://mvnrepository.com/ e procure a dependencia: camel activemq:

```
<!-- https://mvnrepository.com/artifact/org.apache.camel/camel-activemq -->
<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-activemq</artifactId>
    <version>3.4.0</version>
</dependency>
```

5. Quinto exemplo: Acrescentar objeto na descrição de envio na fila do activemq





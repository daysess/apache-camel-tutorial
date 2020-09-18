
# Tutorial do Apache Camel
#### Realizado no youtube por Dinesh Krishnan

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


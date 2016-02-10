# Minicurso de Java - Módulo I

### Sobre

Informações a respeito do minicurso podem ser encontradas em http://pet.inf.ufsc.br/~jptiz/cursos.

### Padrões

Os códigos-fonte do minicurso adotam os seguintes padrões:

 - Código em inglês, comentários em português
 - Cada trecho de código possui um comentário logo acima explicando o que nele acontece, para fins didáticos

### Compilação

Todos os códigos do minicurso podem ser compilados com:

```sh
$ javac *.java
```

Também é possível criar um projeto nas plataformas Eclipse ou Netbeans, mas isso seria um sobre-esforço desnecessário, visto que os códigos são simples e não lidam com CLASSPATH e outros parâmetros. É mais sugerível utilizar um terminal/command prompt mesmo.

> `javac` não é reconhecido como um comando interno ou externo, programa operável ou arquivo em lotes.

Se a mensagem acima aparecer, significa que:

 - Ou você não possui o JDK instalado;
 - Ou o `javac` não está no PATH.

 No caso de não possuir o JDK instalado (note que ele vem por padrão com o Eclipse e Netbeans), apenas instale-o.
 (Windows) No caso de ter o JDK (ou o Eclipse/Netbeans) instalado e apenas não estar no PATH, localize o arquivo "javac.exe" na sua máquina (geralmente encontra-se em "C:/Program Files/Java/jdk<versão>/bin") e adicione nas variáveis de ambiente, ou execute o comando abaixo antes do `javac *.java` (exemplo para JDK8):

```bat
 $ set path=%path%;C:/Program Files/Java/jdk1.8/bin
```

### Execução

Todos os códigos do minicurso podem ser executados com:

```sh
$ java Main.java
```

### Contato

E-mail: jlz@labmetro.ufsc.br

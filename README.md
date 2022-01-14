# :computer: Sistema de Gestão de Tarefas

Sistema de gestão de tarefas é um projeto desenvolvido usndo spring boot, jsf e postgres. Através dele o usuário pode realizar o cadastro de tarefas, edita-las, marcar como concluidas ou apagar. Ele conta com uma interface desenvolvida usando jsf/primefaces e também pode atuar como uma api rest.


## :toolbox: Tecnologias Utilizadas
- JDK 11
- PostgreSQL
- JSF
- Docker

## :pushpin: Objetivos
- [x] Criar aplicação utilizando JSF
- [x] Utilizar uma persistência em um banco de dados PostgreSQL
- [x] Utilizar JPA
- [ ] Utilizar Testes de unidades
- [x] Publicar projeto no heroku 
- [x] Outros diferencias que julgar conveniente (Swagger)

## Executando Localmente

1. Antes de baixar o projeto, é importante que tenha baixado em sua máquina o docker e o JDK 11 para poder realizar a execução.
2. Após baixar o projeto, você deve acessar o diretorio /docker e executar o comando afim de criar e iniciar um container contendo um banco de dados postgres local e pg4admin.
```
$ Sistema-de-tarefas\docker>docker-compose up 
``` 
3. Com o banco de dados ativado e funcionando, é necessário abrir o projeto no inteliji e baixar as dependências do projeto 
<br/><br/>
![Api Doc](https://i.imgur.com/pk1d27Y.png)


4. Depois de baixar todas as dependencias, basta executar o projeto e esperar que ele inicie. A saída deve ser algo semelhante a isso:
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.2)

2022-01-14 18:27:16.225  INFO 15176 --- [  restartedMain] b.c.s.S.SistemaDeTarefasApplication      : Starting SistemaDeTarefasApplication using Java 17.0.1 on DESKTOP-8E8JV6S with PID 15176 (E:\Projetos\Java Projects\Sistema de Tarefas\Sistema-de-tarefas\target\classes started by Raffael in E:\Projetos\Java Projects\Sistema de Tarefas\Sistema-de-tarefas)
2022-01-14 18:27:16.226  INFO 15176 --- [  restartedMain] b.c.s.S.SistemaDeTarefasApplication      : No active profile set, falling back to default profiles: default
2022-01-14 18:27:16.270  INFO 15176 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2022-01-14 18:27:16.270  INFO 15176 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2022-01-14 18:27:17.025  INFO 15176 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-01-14 18:27:17.068  INFO 15176 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 36 ms. Found 1 JPA repository interfaces.
2022-01-14 18:27:17.780  INFO 15176 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-01-14 18:27:17.792  INFO 15176 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-01-14 18:27:17.792  INFO 15176 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.56]
2022-01-14 18:27:18.045  INFO 15176 --- [  restartedMain] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
2022-01-14 18:27:18.061  INFO 15176 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-01-14 18:27:18.062  INFO 15176 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1792 ms
2022-01-14 18:27:18.137  INFO 15176 --- [  restartedMain] j.e.resource.webcontainer.jsf.config     : Inicializando Mojarra 2.2.20 ( 20190731-0757 59754ac80c05d61848a08939ddd11a324f2345ac) para o contexto ''
2022-01-14 18:27:18.264  INFO 15176 --- [  restartedMain] j.e.r.webcontainer.jsf.application       : JSF1048: Anotações PostConstruct/PreDestroy presentes.  Os métodos ManagedBeans marcados com essas anotações informarão as anotações processadas.
2022-01-14 18:27:18.935  INFO 15176 --- [  restartedMain] .w.PostConstructApplicationEventListener : Running on PrimeFaces 8.0
2022-01-14 18:27:18.936  INFO 15176 --- [  restartedMain] .a.PostConstructApplicationEventListener : Running on PrimeFaces Extensions 8.0.4
2022-01-14 18:27:19.098  INFO 15176 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-01-14 18:27:19.139  INFO 15176 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.3.Final
2022-01-14 18:27:19.268  INFO 15176 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2022-01-14 18:27:19.351  INFO 15176 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-01-14 18:27:19.441  INFO 15176 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-01-14 18:27:19.452  INFO 15176 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.PostgreSQL95Dialect
2022-01-14 18:27:19.902  INFO 15176 --- [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-01-14 18:27:19.909  INFO 15176 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-01-14 18:27:20.377  WARN 15176 --- [  restartedMain] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-01-14 18:27:20.493  INFO 15176 --- [  restartedMain] pertySourcedRequestMappingHandlerMapping : Mapped URL path [/v2/api-docs] onto method [springfox.documentation.swagger2.web.Swagger2Controller#getDocumentation(String, HttpServletRequest)]
2022-01-14 18:27:20.592  INFO 15176 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2022-01-14 18:27:20.750  INFO 15176 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2022-01-14 18:27:20.751  INFO 15176 --- [  restartedMain] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
2022-01-14 18:27:20.764  INFO 15176 --- [  restartedMain] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
2022-01-14 18:27:20.791  INFO 15176 --- [  restartedMain] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
2022-01-14 18:27:20.913  INFO 15176 --- [  restartedMain] b.c.s.S.SistemaDeTarefasApplication      : Started SistemaDeTarefasApplication in 5.007 seconds (JVM running for 5.725)
``` 

Pronto!! O sistema está rodando no servidor local e para acessa-lo, basta ir para o seguinte endereço: localhost:8080/tarefas.jr
 
## :page_with_curl: Documentação para rotas implementadas

### Rotas da aplicação (JSF)
- `localhost:8080/tarefas.jr`: Página contendo a listagem das tarefas cadastradas, bem como as opções de editar, excluir, cadastrar uma nova tarefa ou ver as que foram concluidas. 
<br/><br/>
![Api Doc](https://i.imgur.com/ncp9kgo.png)
<br/><br/>
- `localhost:8080/criar-tarefa.jr`: Página contendo o form de cadastro de uma tarefa.
<br/><br/>
![Api Doc](https://i.imgur.com/VLezcmh.png)
<br/><br/>
- `localhost:8080/editar-tarefa.jr`: Página semelhante ao form de cadastro, porém nela é possivel editar a informação de uma tarefa. O acesso a essa página deve ser feita através do botão na página tarefas.jr, para que ele pegue o id do objeto.
<br/><br/>
![Api Doc](https://i.imgur.com/3zwaXwY.png)
<br/><br/>
- `localhost:8080/tarefas-concluidas.jr`: Página contendo a listagem das tarefas que foram marcadas como concluidas.
<br/><br/>
![Api Doc](https://i.imgur.com/9Z30lEE.png)
<br/><br/>

### Rotas da aplicação API
- Para documentação das rotas da API, foi utilizado o swagger, ele pode ser acessado através do seguinte endereço: `http://localhost:8080/swagger-ui.html#/`
<br/><br/>
![Api Doc](https://i.imgur.com/EpT1VkM.png)
<br/><br/>

### Pgadmin
- O acesso ao pgadmin (executando pelo docker) é feito através do endereço `http://localhost:16543/login?next=%2Fbrowser%2F`
- As credenciais são: Usuario - `admin@linuxhint.com`   |   Senha - `secret` 


## :cloud: Deploy
O projeto está feito deploy na plataforma heroku e para acessa-lo, basta entrar pelo endereço `https://gestao-de-tarefas.herokuapp.com/tarefas-concluidas.jr`. Todas as rotaas mencionadas acima, estão em pleno funcionamento no ambiente que está feio o deploy. A diferença é que para acessar, você deve utilizar `https://gestao-de-tarefas.herokuapp.com/` ao invés de `localhost:8080/`




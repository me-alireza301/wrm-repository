Web Services with Spring 2.5 and Apache CXF 2.0
------------------------------------------------

** (optional) To get the project setup in eclipse run the following: **

mvn eclipse:eclipse

Then open eclipse and select file/import/Existing Projects into Workspace

now everything should be OK in eclipse

compile and deploy in apache tomcat

http://localhost:8080/spring-ws-example/services
http://localhost:8080/spring-ws-example/services/WS?wsdl


-------------------------------------
command for create project with maven
--------------------------------------
mvn archetype:create -DarchetypeGroupId=org.springframework.ws -DarchetypeArtifactId=spring-ws-archetype -DarchetypeVersion=1.5.6 -DgroupId=pe.com.spring.ws.example -DartifactId=spring-ws-example
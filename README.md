# Simple-Servlets
**efter Java EE tutorial**

##1. Skapa katalog med pom.xml på rotnivån
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.acme</groupId>
  <artifactId>trivial-servlets</artifactId>
  <packaging>war</packaging>
  <version>1.0-SNAPSHOT</version>
  <name>Trivial Maven Servlets</name>
  <url>http://maven.apache.org</url>
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
  <dependencies>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>
  </dependencies>
  <build>
    <sourceDirectory>src/main/java</sourceDirectory>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-war-plugin</artifactId>
        <version>2.3</version>
        <configuration>
          <warSourceDirectory>src/main/webapp</warSourceDirectory>
        </configuration>
      </plugin>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.1</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
      </plugin>
    </plugins>
  </build>
 </project>
```
##2. Skapa följande katalog- och filstruktur
<pre>
src
  main
    java
      hello
        Greeting.java
        ResponseServlet.java
    webapp
      resources
        images
            duke.waving.gif
</pre>
        
 ##3. Skapa servletarna i katalogen hello
 <pre>
 package hello;
 @WebServlet("/greeting")
 public class Greeting extends HttpServlet {
 ...
 
 package hello;
 @WebServlet("/response")
 public class ResponseServlet extends HttpServlet {
 ...
 </pre>
 ##4. bilden på Duke i katalogen images
 <pre>
  duke.waving.gif
 </pre>
 
##5. Efter det att servern har startat skriv följande i WebBrowser
<pre>
http://localhost:8080/trivial-servlets-1.0-SNAPSHOT/greeting
</pre>

# Det finns också en del andra servletexempel
1. Den trivialast möjliga servleten (Hello)
1. en som räknar antal gånger som den öär anropad (Counter)
1. samt några som illusterar redirect, post och cookies
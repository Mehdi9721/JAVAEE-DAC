# JAVAEE FROM CDAC
Cookie and Httpsession is important in terms of session managemnet, Cookie will help to identify client even after logoff from session, but seesion maintains current activity while client is connected with server. <br>
## Session
HttpSession session=req.getSession(); <br>


## cookie
Cookie c= new Cookie("name"+,"value"); <br>
to access Cookie, we should store in an array and use foreach loop to getName() from cookies <br> 
Cookie[] c=req.getCookies();

## started learning Spring
### BEANS
beans definition should be written in cofiguration xml file <br>
#### xml
the bean definition for XMl config
``````````````````````````````````````````````````````````````````````````````````````````````````````````````````
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">
  <bean name="car" class="Car"></bean>
   </beans>
``````````````````````````````````````````````````````````````````````````````````````````
####annotation based
for annotation based we also need definition in xml

definition for xml annotation
`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
   xmlns:context="http://www.springframework.org/schema/context"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd
    http://www.springframework.org/schema/tool
    http://www.springframework.org/schema/tool/spring-tool.xsd">
        <context:component-scan base-package="l"></context:component-scan>
        </beans>



# Spring STS
STS-4 --> MAVEN project in Spring starter --> add tools of web and java ee from eclips marketplace in sts else jsp will not created --> add tomcat jasper in dependency for jsp to servlet <br> 
### @SpringBootApplication
this annoted class is a main (Dispatcher servlet)<br>
IT will look for Controller where we marked Controller to a class <br>
and @RequestMapping("/") will map the required method and returns the view.jsp file <br>

# JPA
### set properties dialect <br>
spring.datasource.url=jdbc:mysql://localhost:3306/testhibernate <br>
spring.datasource.username=root <br>
spring.datasource.password=8052608851 <br>
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect <br>

## pom dependency
{ <br>
<?xml version="1.0" encoding="UTF-8"?> <br>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" <br>
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.1.2.RELEASE</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>

	<groupId>com.example</groupId>
	<artifactId>firstBootMVC</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>firstBootMVC</name>
	<description>first project for Spring Boot</description>
	<properties>
		<java.version>1.8</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper -->
<dependency>
    <groupId>org.apache.tomcat</groupId>
    <artifactId>tomcat-jasper</artifactId>
    <version>9.0.14</version>
</dependency>
		<!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.1.0</version>
</dependency>
		
		<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
}



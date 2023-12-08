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
set properties dialect <br>
spring.datasource.url=jdbc:mysql://localhost:3306/testhibernate <br>
spring.datasource.username=root <br>
spring.datasource.password=8052608851 <br>
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect <br>



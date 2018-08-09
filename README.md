# spring-aop-example
A couple of simple examples to demonstrate spring-aop / AspectJ support, utilising the following dependencies;
- org.springframework:spring-aop
- org.springframework:spring-webmvc
- javax.servlet:javax.servlet-api
- org.aspectj:aspectjweaver
- org.apache.logging.log4j:log4j-core

## Running the example
The application is executed using an embedded jetty container. The project requires maven 3.x to run;
```bash
mvn jetty:run
```

Try out the examples below;
- [Aspect around execution](http://localhost:8080/example1)
- [Aspect around annotated method](http://localhost:8080/example2)
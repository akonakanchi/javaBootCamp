# Spring Framework

````
Spring
    - Tight Coupling
    - Loose Coupling
    - Dependency Injection
    - IOC Container
    - Application Context
    - Spring Beans
    - Auto Wiring
    - Component Scan

Advanced Spring
    - Lazy Initialization
    - Bean Scopes
        - prototype
        - Singleton
    - PostConstruct & PreDestroy    
    - Jakarta EE History
    - Jakarta Context and DI
    - XML Configuration
    - Alternatives @Componenet
    - Spring Modules and Projects
````

- **_Spring Container vs Spring Context vs IOC container vs Application Context_**
- **Spring Container or IOC Container**
  - Spring container manages Spring Beans and their lifecycle. Spring container or Context or IOC is all the same.
  - 2 popular type of IOC containers
    1. Bean Factory 
       - Basic Spring Container
    2. Application Context
       - This is Advanced Spring Container with enterprise-specific features.
       - Easy to use in Web-App
       - Easy Internationalization
       - Easy integration with Spring AOP

- **Java Beans vs Spring Beans vs POJO(plain old java object)**
  - JavaBean 
    - Should not have no argument constructor
    - It should have getters and setters
    - It should implement Serializable Interface
  - POJO
    - Any Class that we create are java objects.
    - No constraints
    - Spring Bean
      - Any java object managed by IOC is spring bean
      ````
      - How to List all Beans managed by spring
        - context.getBeanDefinitionNames();
      - Beans with same names or matching names?
        - Making one of the been @Primary
        - or use @Qualifier("Qualifier_name")
      ````

- **Spring Dependency Injections Types**
  - Identifies beans and their dependencies and wire them (IOC is achieved)
  - **_Constructor Injection_**
    - Dependency are set by creating Bean using its Constructor.
    - @Autowired is not mandatory for constructor injection.
    - Constructor based is recommended.
  - **_Setter Injection_**
    - Dependencies are set by calling setter methods on beans.
  - **_Field Injection_**
    - No Setter or Constructor, Dependency is injected using reflection
    - 
## Advanced Spring
- **Lazy Initialization**
  - Default initialization of a bean is called Eager, unless @Lazy is annotated.
  - However, Eager initialization is recommended.
  - Lazy Resolution proxy will be injected instead of actual dependency.
  - If this is used on @Configuration class all the @Bean methods within the @Configuration will be initialized Lazily.
- **Bean Scope**
  - For Prototype a instance of Bean is initialized every time when we make use of it.
  - Whereas for normal class or singleton a bean is created and same bean is used when we make use of the class.
  - Scopes that are available for Web-aware Spring Application Context
      - Request Scope
          - OneObject instance per single HTTP Request
      - Session Scope
          - One Object instance per user HTTP Session
      - Application scope
          - One object instance per web application runtime
      - Websocket Scope
          - One object instance per WebSocket instance
  - **_Java Singleton vs Spring Singleton_**
      - Spring Singleton, One Object instance per Spring IoC Container
      - Java Singleton, One Object instance per JVM
- **PostConstruct and PreDestroy**
  - If we need to execute some logic as soon as the wiring is done then we can use @PostConstruct annotation on the method.
  - After all the execution application need to release resources or do a cleanup use @PreDestroy annotation on the method.
- **Java EE or _Jakarta EE_**
  - J2EE --> Java EE --> Jakarta EE
  - Important Specifications
    - Jakarta Server Pages (JSP)
    - Jakarta Standard Tag Library (JSTL) 
      - set of tag library's to show dynamic info in the web pages
    - Jakarta Enterprise Beans (EJB)
    - Jakarta RESTful Web Service (JAX-RS)
    - Jakarta Bean Validation
    - Jakarta Context and Dependency Injection (CDI)
    - Jakarta Persistence (JPA)
  - Spring 6 and Spring 3 supports Jakarta packages.
- **CDI**
  - CDI is Specification (Interface)
  - Spring framework Implements CDI
  - Important Inject API Annotations
    - Inject(Similar to Autowired)
    - Named(Similar to Component)
    - Qualifier
    - Scope
    - Singleton
- **Spring XML Configuration**
  - Before using Java Configuration i.e Annotations, xml configuration is used to load the Spring Beans
  - ````
    Var Context = ClassPathXmlApplicationContext("XML File Path");
 
## TOP SPRING Annotation

1. @Configuration
   - Indicates that a class declares one or more @Bean methods and maybe processed by Spring container to generate bean definition.
2. @Bean
3. @Component
   - Can be used for class where instance is required.
   - An Instance of the class is managed by Spring framework.
4. @ComponentScan("Package")
   - Scans all the components in that particular package and its sub-package.
   - If the package is not specified it will take current package
5. @Primary
   - A bean should be given preference when Multiple candidates are qualified.
6. @Qualifier("Qualifier_name")
   - A specific bean should be auto-wired (name of the bean can be used as qualifier)
7. @Autowired
8. @Lazy
   - This tag is used if we want Bean to be created only when there is a usage of that class.
   - Can use on any class or method 
9. @Scope
   - @Scope(Value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
   - @Scope(Value=ConfigurableBeanFactory.SCOPE_SINGLETON)
10. @PostConstruct
    - Identifies the method that will be executed after dependency injection is done to perform any Initialization.
    - To load dependencies after wiring is done.
11. @PreDestroy
    - Identifies the method that will receive callback notification to signal that the instance is in the processes of being removed by container.
    - Typically used to release the resource that it has been holding.
    - After all the logic is done for final clean up on method.
14. **Spring Stereotype Annotations**
  - @Component - Generic annotation applicable for any class
      - Base for all Spring Stereotype Annotations
  - Specializations of @Component
      - @Service
          - Indicate that an annotated class has business logic
      - @Controller
          - Indicates that an annotated class is a Controller(e.g Web Controller)
      - @Repository
          - If bean is talking to DB for retrieve/Modify.


# Spring Boot

````
- Spring Initilizer
- Auto Configuration
- Actuator
- developer Tools 
````

- **SpringBoot Starter Projects**
  - Help you get a project up and running easily.
- **SpringBoot Auto Configuration**
  - Spring Boot Auto configuration looks at the class Path and what is the exsisting configuration.

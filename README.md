# springboot-encuesta-api

## Requirements

For building and running the application you need:

- [JDK 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3.8](https://maven.apache.org)

## Running and Installation the application

1. Open a command line in the project folder
2. Install dependencies, using `mvn clean install`
3. Run the api, using `mvn spring-boot:run`
4. Open a browser, and navigate to `http://localhost:8080` and see if work
5. To test the api you can use software like [Postman](https://www.postman.com/)
6. Once postman is open you can create a get request using the route 'http://localhost:8080/encuestas' and execute it, this way you get the polls stored in the Database

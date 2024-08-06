# Developing-Backend-API-Services-Using-Spring-Boot

## 교재 Source
https://github.com/kiekk/book-spring-boot-up-and-running
## 네이버 공유 사이트
http://naver.me/FZ2g7qU6

### Day 1: Introduction to Spring Boot and RESTful API
- Basic concepts and advantages of Spring Boot
- RESTful API design principles
- Spring Boot project structure and configuration
- Http Status
      <br> https://en.wikipedia.org/wiki/List_of_HTTP_status_codes   

### Day 2: Core Features of Spring Boot
- Database integration using Spring Data JPA
- Implementing CRUD (Create, Read, Update, Delete) APIs
- Exception handling and validation

- Http Status Codes

            • 200 OK: This code indicates that the request is successful and the response content is returned to the
            client as appropriate.
            • 201 Created: This code indicates that the request is successful and a new resource is created.
            • 400 Bad Request: This code indicates that the server failed to process the request because of the
            malformed syntax in the request. The client can try again after correcting the request.
            • 401 Unauthorized: This code indicates that authentication is required for the resource. The client can
            try again with appropriate authentication.
            • 403 Forbidden: This code indicates that the server is refusing to respond to the request even if the
            request is valid. The reason will be listed in the body content if the request is not a HEAD method.
            • 404 Not Found: This code indicates that the requested resource is not found at the location specified in
            the request.
            • 500 Internal Server Error: This code indicates a generic error message, and it tells that an unexpected
            error occurred on the server and that the request cannot be fulfilled.
            
            * Spring Boot REST API 애너테이션
            1. @RestController, @GetMapping
            2. Java Bean as JSON
            3. List as JSON
            2. @PathVariable
            3. @RequestParam
            4. @PostMapping, @RequestBody
            5. @PutMapping, @RequestBody
            6. @DeleteMapping
            7. ResponseEntity to Http Response
            8. Spring MVC Controller - @RequestMapping

### Day 3: Security and Authentication
- Securing APIs with Spring Security
- JWT-based authentication and access control
- Integration with OAuth2 and social logins

### Day 4: Advanced Features and Performance Optimization
- Microservices and API Gateway
- Caching and performance optimization strategies
- Asynchronous processing and event-driven development

### Day 5: Project and Deployment
- Scenario-based project development
- Containerization and deployment using Docker
- Deployment using cloud services

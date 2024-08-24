# Project

# ManufacturersDetails

Retrieve a list of number of manufacturer(s) in a given location, with a specific nature of business, and the capability to perform a specific manufacturing process.

## How to Run the Application

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/your-repository-name.git

   git add .

   git commit -m "Initial commit of solution code"

   git push origin main

   3. Set Up the Environment:
   Install Dependencies: Use Maven to install project dependencies. If you’re using Maven, run:
   mvn install

   4.Run the Application:
   For a Spring Boot Application: Use Maven to run the application:
   mvn spring-boot:run

   5. Open a web browser and navigate to http://localhost:8080 (or the port configured in your application properties) to access the application.

   6. In Postman I have used API with GET request where i got the response with JSON data.
   PARAM:
   The URL: http://localhost:8080/api/supplier/query?location=India&natureOfBusiness=medium_scale&manufacturingProcesses=3d_printing&page=0&size=5

    

package API.UserManagement;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class APItest {
    public static void main(String[] args) {
        // Base URI setup
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request and Validation
        given()
                .when()
                .get("/posts/1") // Endpoint to fetch a specific post
                .then()
                .statusCode(200) // Validate HTTP Status Code
                .body("id", equalTo(1)) // Validate response body contains "id": 1
                .body("userId", equalTo(1)) // Validate response body contains "userId": 1
                .body("title", notNullValue()) // Validate title field is not null
                .log().all(); // Log the full responsee
    }
}

package at.htl.karate.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RestaurantResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/restaurant")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}
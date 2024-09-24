package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiRequest {
    public static Response getEndpoint(String endpoint, String bearerToken) {
       return RestAssured.given()
               .header("Authorization", "Bearer" + bearerToken)
               .when()
               .get(endpoint);
    }
    public static void printResponse(Response response) {
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());;
    }
}

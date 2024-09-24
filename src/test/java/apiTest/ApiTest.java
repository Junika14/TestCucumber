package apiTest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTest {

    private static final String BASE_URL = "https://gorest.co.in/public/v2";
    private static final String BEARER_TOKEN ="b3fe00faffe8a167f40c2e589b909ac94889ffefaa58fbe9025f7dc67032f070";

    @Test
    public void testGetUser() {
        String endpoint = BASE_URL + "/users";
        String accessToken = BEARER_TOKEN;
        Response response = ApiRequest.getEndpoint(endpoint,accessToken);
        ApiRequest.printResponse(response);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}

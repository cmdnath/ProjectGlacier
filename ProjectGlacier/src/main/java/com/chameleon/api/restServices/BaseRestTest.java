package com.chameleon.api.restServices;

import static com.chameleon.api.restServices.ResponseCodes.OK;

import com.chameleon.api.APIBaseTest;
import com.chameleon.utils.TestReporter;

public class BaseRestTest extends APIBaseTest {

    protected void validateResponse(RestResponse response) {
        validateResponse(response, OK, null);
    }

    protected void validateResponse(RestResponse response, int expectedErrorCode) {
        validateResponse(response, expectedErrorCode, null);
    }

    protected void validateResponse(RestResponse response, int expectedErrorCode, String expectedErrorMessage) {
        TestReporter.logAPI(response.getStatusCode() != expectedErrorCode, "Validate status code returned [ " + response.getStatusCode() + " ] was the expected value of [ " + expectedErrorCode + " ]", response);
        TestReporter.assertTrue(true, "Validate status code returned [ " + response.getStatusCode() + " ] was the expected value of [ " + expectedErrorCode + " ] ");
        if (expectedErrorMessage != null) {
            TestReporter.assertTrue(response.getResponse().contains(expectedErrorMessage), "Returned response [ " + response.getResponse() + " ] matches expected response [ " + expectedErrorMessage + " ]");
        }
    }

}

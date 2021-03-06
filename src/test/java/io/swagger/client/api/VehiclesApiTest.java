/*
 * DealersAndVehicles
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.VehicleIdsResponse;
import io.swagger.client.model.VehicleResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehiclesApi
 */
@Ignore
public class VehiclesApiTest {

    private final VehiclesApi api = new VehiclesApi();

    
    /**
     * Get a list of all vehicleids in dataset
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdsTest() throws ApiException {
        String datasetId = null;
        VehicleIdsResponse response = api.getIds(datasetId);

        // TODO: test validations
    }
    
    /**
     * Get information about a vehicle
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getVehicleTest() throws ApiException {
        String datasetId = null;
        Integer vehicleid = null;
        VehicleResponse response = api.getVehicle(datasetId, vehicleid);

        // TODO: test validations
    }
    
}

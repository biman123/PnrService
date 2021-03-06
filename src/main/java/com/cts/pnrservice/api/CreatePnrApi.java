/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.cts.pnrservice.api;

import javax.validation.Valid;

import org.springframework.cloud.sleuth.annotation.NewSpan;
//import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.pnrservice.model.CreatePnrFault;
import com.cts.pnrservice.model.CreatePnrRequest;
import com.cts.pnrservice.model.CreatePnrResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T07:29:02.569Z")

@Api(value = "createPnr", description = "the createPnr API")
public interface CreatePnrApi {

    @ApiOperation(value = "Operation CreatePnr", notes = "", response = CreatePnrResponse.class, tags={ "Pnr", })
    @ApiResponses(value = { 
        @ApiResponse(code = 500, message = "", response = CreatePnrFault.class),
        @ApiResponse(code = 200, message = "", response = CreatePnrResponse.class) })
    
//@NewSpan
    @RequestMapping(value = "/createPnr",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    ResponseEntity<CreatePnrResponse> createPnr(@ApiParam(value = "" ,required=true )  @Valid @RequestBody CreatePnrRequest body);

}

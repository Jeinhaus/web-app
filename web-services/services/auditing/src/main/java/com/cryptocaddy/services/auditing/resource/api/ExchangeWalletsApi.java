package com.cryptocaddy.services.auditing.resource.api;

import com.cryptocaddy.services.auditing.resource.model.AuditReport;
import com.cryptocaddy.services.auditing.resource.model.attributes.Exchange;
import com.cryptocaddy.services.common.model.RestErrorInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Jon Waggoner
 * Date: 1/18/2018
 */
@Api(value = "exchangeWallets", description = "Retrieve wallet balances from an exchange")
public interface ExchangeWalletsApi {

    @ApiOperation(value = "Exchange Wallets", notes = "The Exchange Wallets API gets wallet balances for the specified exchange with given an api key and secret", response = AuditReport.class, tags = {"Exchange Wallets"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Add Exchanges Response", response = AuditReport.class),
            @ApiResponse(code = 400, message = "Unexpected Error", response = RestErrorInfo.class)
    })
    @SuppressWarnings("all")
    @RequestMapping(value = "/exchangeWallets",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<AuditReport> getExchangeWallets(@RequestBody Exchange exchange);

}
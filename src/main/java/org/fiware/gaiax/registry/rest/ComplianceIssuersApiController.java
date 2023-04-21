package org.fiware.gaiax.registry.rest;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import lombok.RequiredArgsConstructor;
import org.fiware.gaiax.registry.Configuration;
import org.fiware.gaiax.registry.api.ComplianceIssuersApi;

@Controller
@RequiredArgsConstructor
public class ComplianceIssuersApiController implements ComplianceIssuersApi {

	private final Configuration configuration;

	@Override
	public HttpResponse<Object> complianceIssuersControllerFindAll() {
		return HttpResponse.ok(configuration.getComplianceIssuers());
	}
}

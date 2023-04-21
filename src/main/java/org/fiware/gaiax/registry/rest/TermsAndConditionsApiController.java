package org.fiware.gaiax.registry.rest;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import org.fiware.gaiax.registry.api.TermsAndConditionsApi;

@Controller
public class TermsAndConditionsApiController implements TermsAndConditionsApi {
	@Override
	public HttpResponse<Object> termsAndConditionsControllerGetTermsAndConditions() {
		// do nothing, accept all
		return HttpResponse.ok();
	}
}

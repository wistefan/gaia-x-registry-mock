package org.fiware.gaiax.registry.rest;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import org.fiware.gaiax.registry.api.TrustAnchorApi;
import org.fiware.gaiax.registry.model.TrustAnchorChainRequestDtoVO;
import org.fiware.gaiax.registry.model.TrustAnchorChainUriRequestDtoVO;
import org.fiware.gaiax.registry.model.TrustAnchorRequestDtoVO;

@Controller
public class TrustAnchorApiController implements TrustAnchorApi {

	@Override public HttpResponse<Object> trustAnchorControllerFindTrustAnchor(TrustAnchorRequestDtoVO trustAnchorRequestDtoVO) {
		// do nothing, accept all
		return HttpResponse.ok();
	}

	@Override public HttpResponse<Object> trustAnchorControllerVerifyTrustAnchorChain(
			TrustAnchorChainUriRequestDtoVO trustAnchorChainUriRequestDtoVO) {
		// do nothing, accept all
		return HttpResponse.ok();
	}

	@Override public HttpResponse<Object> trustAnchorControllerVerifyTrustAnchorChainRaw(
			TrustAnchorChainRequestDtoVO trustAnchorChainRequestDtoVO) {
		// do nothing, accept all
		return HttpResponse.ok();
	}
}

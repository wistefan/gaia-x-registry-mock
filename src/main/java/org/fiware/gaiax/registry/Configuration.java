package org.fiware.gaiax.registry;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties("mock")
@Data
public class Configuration {
	private List<String> complianceIssuers = new ArrayList<>();
}

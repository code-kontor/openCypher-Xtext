package io.codekontor.opencypher.xtext.spi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class NullGraphMetaDataProvider implements IGraphMetaDataProvider {

	@Override
	public List<String> getNodeLabels() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getPropertyKeys() {
		return Collections.emptyList();
	}

	@Override
	public List<String> getRelationshipTypes() {
		return Collections.emptyList();
	}
	
	@Override
	public Map<String, String> getFunctions() {
		return Collections.emptyMap();
	}
}

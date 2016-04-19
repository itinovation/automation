package com.softtek.automation;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

public class ExecutionContext {

	private Map<String, Object> internalCache;
	private Map<String, Object> volatilContext;

	@PostConstruct
	public void init() {
		internalCache = new HashMap<String, Object>(ConstantsUtils.CONTEXT_CACHE_SIZE);
		volatilContext = new HashMap<String, Object>();

	}

	public Object getElementFromChache(String key) {
		if (internalCache.size() < ConstantsUtils.CONTEXT_CACHE_SIZE) {
			return internalCache.get(key);
		}
		return internalCache.remove(key);
	}

	public void putElementOnCache() {
		// tbd
	}

	public Object getElement(String key) {
		return this.volatilContext.remove(key);
	}

	public void putElement(String key, Object object) {
		this.volatilContext.put(key, object);
	}
}

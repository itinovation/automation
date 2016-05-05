package com.softtek.automation.steps;

import org.apache.xalan.xsltc.runtime.Constants;
import org.junit.Assert;

import com.softtek.automation.ConstantsUtils;
import com.softtek.automation.ExecutionContext;
import com.softtek.automation.ExecutionResult;

public abstract class AbstractSteps {

	protected ExecutionContext ExecutionContext;

	public ExecutionContext getExecutionContext() {
		return this.ExecutionContext;
	}

	public void setExecutionContext(ExecutionContext executionContext) {
		this.ExecutionContext = executionContext;
	}

	protected Object assertTrue(ExecutionResult execution) {
		Assert.assertTrue(execution.getErrorType() + ": " + execution.getMessage(), execution.isValidResult());
		return execution.getObjectResult();
	}

	protected void assertTrue(boolean result, String message) {
		Assert.assertTrue(message, result);
	}
	
	protected Object assertFalse(ExecutionResult execution) {
		Assert.assertFalse(execution.getMessage(), execution.isValidResult());
		return execution.getObjectResult();
	}

	protected void assertFalse(boolean result, String message) {
		Assert.assertTrue(message, result);
	}
	
	protected void putInVolatileContext(String key, Object object ){		
		ExecutionContext.putElement(key, object);
	}
	
	protected void putInCacheContext(String key, Object object ){		
		ExecutionContext.putElementOnCache(key, object);
	}

	protected Object getFromVolatileContext(String key){
		return ExecutionContext.getElement(key);
	}
	
	protected Object getFromCacheContext(String key){
		return ExecutionContext.getElementFromChache(key);
	}
}

package com.sai.scopes;

import java.util.Map;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class ThreadScope implements Scope {
	
	Map<String,Object> scope=null;
	CustomThreadLocal threadlocale=new CustomThreadLocal();
	

	@Override
	public Object get(String name, ObjectFactory<?> objectfacatory) {
		scope=(Map)threadlocale.get();
		Object obj=scope.get(name);
		
		if(obj==null) {
			obj=objectfacatory.getObject();
			scope.put(name, obj);
		}
		
		
		return null;
	}

	@Override
	public String getConversationId() {
		
		return null;
	}

	@Override
	public void registerDestructionCallback(String arg0, Runnable arg1) {
		

	}

	@Override
	public Object remove(String name) {
		
		Object obj=scope.remove(name);
		
		return obj;
	}

	@Override
	public Object resolveContextualObject(String arg0) {
		
		return null;
	}

}

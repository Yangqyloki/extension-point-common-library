package sap.cx.panda.extensionpoint.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

public class MicroServiceContext
{
	private static Logger logger = LoggerFactory.getLogger(MicroServiceContext.class.getName());

	private static ThreadLocal<Map<String, String>> microServiceContext = ThreadLocal.withInitial(() -> new HashMap<>());


	public static void setValue(String key, String value)
	{

		microServiceContext.get().put(key, value);
	}

	public static String getValue(String key)
	{
		if (CollectionUtils.isEmpty(microServiceContext.get()))
		{
			microServiceContext.set(new HashMap<>());
		}
		return microServiceContext.get().get(key);
	}

	public static void clear()
	{
		microServiceContext.get().clear();
	}

	public static Map getMicroServiceContext()
	{
		return microServiceContext.get();
	}
}

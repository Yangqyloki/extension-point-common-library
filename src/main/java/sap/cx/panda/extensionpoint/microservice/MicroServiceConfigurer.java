package sap.cx.panda.extensionpoint.microservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import sap.cx.panda.extensionpoint.microservice.MicroServiceRequestInterceptor;

@Configuration
public class MicroServiceConfigurer implements WebMvcConfigurer
{

	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(new MicroServiceRequestInterceptor());
	}
}

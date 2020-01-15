package sap.cx.panda.extensionpoint.aspects;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import sap.cx.panda.extensionpoint.microservice.MicroServiceContext;


@Aspect
@Configuration
public class ExtensionPointTemplateAspect
{
	@Around("@annotation(sap.cx.panda.extensionpoint.annotations.ExtensionPointTemplate)")
	public Object extensionPointTemplateAround(ProceedingJoinPoint joinPoint) throws Throwable
	{
		if (StringUtils.isBlank(MicroServiceContext.getValue("tenantId")))
		{
			throw new RuntimeException("tenantId is empty");
		}
		System.out.println(String.format("Before ExtensionPointTemplate, current tenant is: %s", MicroServiceContext.getMicroServiceContext()));
		Object obj = joinPoint.proceed();
		System.out.println(String.format("After ExtensionPointTemplate, current tenant is: %s", MicroServiceContext.getMicroServiceContext()));
		return obj;
	}
}

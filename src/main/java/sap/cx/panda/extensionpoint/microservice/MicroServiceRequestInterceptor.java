package sap.cx.panda.extensionpoint.microservice;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import sap.cx.panda.extensionpoint.microservice.MicroServiceContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MicroServiceRequestInterceptor extends HandlerInterceptorAdapter
{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	{
		MicroServiceContext.setValue("tenantId",request.getHeader("tenantId"));
		MicroServiceContext.setValue("envId",request.getHeader("envId"));
		return true;
	}

	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
	{
		MicroServiceContext.clear();
	}
}

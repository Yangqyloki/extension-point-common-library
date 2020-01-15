package sap.cx.panda.extensionpoint.annotations;

import org.springframework.context.annotation.Import;
import sap.cx.panda.extensionpoint.aspects.ExtensionPointTemplateAspect;
import sap.cx.panda.extensionpoint.configuration.RegisterExtensionPointConfiguration;
import sap.cx.panda.extensionpoint.microservice.MicroServiceConfigurer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({RegisterExtensionPointConfiguration.class, ExtensionPointTemplateAspect.class, MicroServiceConfigurer.class})
public @interface RegisterExtensionPoint
{

}

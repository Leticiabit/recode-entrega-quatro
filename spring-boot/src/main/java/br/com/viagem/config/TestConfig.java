package br.com.viagem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@EnableWebMvc
@Configuration
public class TestConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}

	
	  @Bean public ClassLoaderTemplateResolver secondaryTemplateResolver() {
	  ClassLoaderTemplateResolver secondaryTemplateResolver = new
	  ClassLoaderTemplateResolver();
	  secondaryTemplateResolver.setPrefix("templates/destino/");
	  secondaryTemplateResolver.setSuffix(".html");
	  secondaryTemplateResolver.setTemplateMode(TemplateMode.HTML);
	  secondaryTemplateResolver.setCharacterEncoding("UTF-8");
	  secondaryTemplateResolver.setOrder(1);
	  secondaryTemplateResolver.setCheckExistence(true);
	  
	  return secondaryTemplateResolver;
	  
	  }
	 
}

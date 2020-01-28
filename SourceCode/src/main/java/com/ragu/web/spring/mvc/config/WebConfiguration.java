package com.ragu.web.spring.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("WebConfiguration.getServletConfigClasses()");
		Class conClass = ControlConfig.class;
		Class[] allConfigClasses  = new Class[1];
		allConfigClasses[0] = conClass;
		
		return allConfigClasses;
		}

	@Override
	protected String[] getServletMappings() {
		System.out.println("WebConfiguration.getServletMappings()");
		String root = "/";
		String rootURLs[] = new String[1];
		rootURLs[0] = root;
		
		return rootURLs;
	}

}

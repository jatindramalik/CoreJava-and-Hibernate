package com.siddhu;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        
        return new Class[] {AgentConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        
        return new String[] {"/"};
    }
    
}

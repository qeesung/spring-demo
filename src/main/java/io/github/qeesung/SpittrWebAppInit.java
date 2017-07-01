package io.github.qeesung;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by qeesung on 2017/6/28.
 */
public class SpittrWebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

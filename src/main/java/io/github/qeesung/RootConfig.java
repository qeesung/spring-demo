package io.github.qeesung;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by qeesung on 2017/6/28.
 */

@Configuration
@ComponentScan(basePackages = {"io.github.qeesung"}, excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION, value= EnableWebMvc.class)
})
public class RootConfig {
}

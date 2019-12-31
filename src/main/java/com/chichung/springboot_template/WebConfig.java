package com.chichung.springboot_template;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.chichung.springboot_template.interceptor.MyInterceptor;
import java.util.List;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class WebConfig extends WebMvcConfigurationSupport {

  /**
   * 添加拦截器.
   */
  @Override
  protected void addInterceptors(InterceptorRegistry registry) {
    super.addInterceptors(registry);
    registry.addInterceptor(new MyInterceptor());
  }

  /**
   * JSON引擎替换为fastJSON.
   */
  @Override
  protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    super.configureMessageConverters(converters);
    FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    fastJsonConfig.setSerializerFeatures(
        SerializerFeature.PrettyFormat
    );
    fastConverter.setFastJsonConfig(fastJsonConfig);
    converters.add(fastConverter);
  }
}

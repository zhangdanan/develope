package cn.edu.chzu.smart.home.config;

import cn.edu.chzu.smart.home.service.BedstatusService;
import cn.edu.chzu.smart.home.service.impl.BedstatusServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import javax.servlet.http.HttpServletResponse;

/**
 * 资源配置
 *
 * @author: EarthChen
 * @date: 2018/06/03
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
                .and()
                .authorizeRequests()
                .antMatchers("**").permitAll()
                //为swagger增加，表示不需要权限就可以访问获取接口信息
                .antMatchers("/swagger-ui.html", "/webjars/**", "/v2/**", "/swagger-resources/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }

    @Bean
    public BedstatusService bedstatusService(){
        return new BedstatusServiceImpl();
    }
}
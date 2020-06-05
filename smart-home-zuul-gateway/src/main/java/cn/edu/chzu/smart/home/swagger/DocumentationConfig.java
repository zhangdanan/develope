package cn.edu.chzu.smart.home.swagger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * swagger配置
 *
 * @author: EarthChen
 * @date: 2018/06/21
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {


    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        resources.add(swaggerResource("facility-data-dictionary-server", "/facility-data-dictionary-server/v2/api-docs", "1.0"));
        resources.add(swaggerResource("facility-infrastructure-server", "/facility-infrastructure-server/v2/api-docs", "1.0"));
        resources.add(swaggerResource("facility-payment-server", "/facility-payment-server/v2/api-docs", "1.0"));
        resources.add(swaggerResource("facility-registration-business-server", "/facility-registration-business-server/v2/api-docs", "1.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}




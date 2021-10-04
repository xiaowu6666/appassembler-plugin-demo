package tk.shenyifeng.demo.configure;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;
import java.io.File;

@Configuration
public class MultipartConfig {

    @Bean
    MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        String path = System.getProperty("user.dir") + "/data/tmp";
        File tmpPath = new File(path);
        if (!tmpPath.exists())
            tmpPath.mkdirs();
        factory.setLocation(path);
        return factory.createMultipartConfig();
    }
}

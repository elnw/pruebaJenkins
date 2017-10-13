package learn.spring.ejemplo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {

    @Bean
    public CuentaServiceIF cuentaService() {
        CuentaServiceImpl bean = new CuentaServiceImpl();
        bean.setCuentaDao(cuentaDao() );
        return bean;
    }

    @Bean
    public CuentaIF cuentaDao() {
        CuentaDaoInMemoryImpl bean = new CuentaDaoInMemoryImpl();
        // Inyectar dependencias  ...
        
        return bean;
    }

}

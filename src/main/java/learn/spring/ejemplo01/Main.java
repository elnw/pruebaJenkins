package learn.spring.ejemplo01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        
        // Crear el Contenedor Spring
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanConfig.class);
        
        // Crear el bean
        CuentaServiceIF as = applicationContext.getBean("cuentaService", CuentaServiceImpl.class);
        
        System.out.println("Antes de transferir -> Spring 1");
        System.out.println("Saldo Cta 1 :" + as.getCuenta(1).getSaldo() );
        System.out.println("Saldo Cta 2 :" + as.getCuenta(2).getSaldo() );
        as.transferirDinero(1, 2, 5.0);
        System.out.println("Despues de Transferir");
        System.out.println("Saldo Cta 1 :" + as.getCuenta(1).getSaldo() );
        System.out.println("Saldo Cta 2 :" + as.getCuenta(2).getSaldo() );

    }
}

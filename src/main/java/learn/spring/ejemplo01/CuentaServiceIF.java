package learn.spring.ejemplo01;

public interface CuentaServiceIF {

    public void transferirDinero(
            long cuentaIDOrigen, long cuentaIDDestino, double monto
            );
    
    public void depositarDinero(
            long cuentaID, double monto) throws Exception;
    
    public Cuenta getCuenta(long cuentaID);
}

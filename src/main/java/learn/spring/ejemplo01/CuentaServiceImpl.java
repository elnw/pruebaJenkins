package learn.spring.ejemplo01;

public class CuentaServiceImpl implements CuentaServiceIF {

    private CuentaIF dao;

    public void setCuentaDao(CuentaIF accountDao) {
        this.dao = accountDao;
    }

    @Override
    public void transferirDinero(long cuentaIDOrigen, long cuentaIDDestino, double monto) {
        Cuenta origen = dao.find(cuentaIDOrigen);
        Cuenta destino = dao.find(cuentaIDDestino);
        origen.setSaldo( origen.getSaldo() - monto);
        destino.setSaldo(destino.getSaldo() + monto);
        dao.update(origen);
        dao.update(destino);
    }

    @Override
    public void depositarDinero(long cuentaID, double monto) throws Exception {
        Cuenta account = dao.find(cuentaID);
        account.setSaldo(account.getSaldo() + monto);
        dao.update(account);
    }

    @Override
    public Cuenta getCuenta(long cuentaID) {
        return dao.find(cuentaID);
    }
}

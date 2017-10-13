package learn.spring.ejemplo01;

import java.util.List;

public interface CuentaIF {

    public void insert(Cuenta cuenta);
    public void update(Cuenta cuenta);
    public void update(List<Cuenta> cuentas);
    public void delete(long cuentaID);
    public Cuenta find(long cuentaID);
    public List<Cuenta> find(List<Long> cuentasIDs);
    public List<Cuenta> find(String titular);
    public List<Cuenta> find(boolean locked);
}

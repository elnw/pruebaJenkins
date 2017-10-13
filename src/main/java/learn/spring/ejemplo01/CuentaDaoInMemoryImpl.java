package learn.spring.ejemplo01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CuentaDaoInMemoryImpl implements CuentaIF {
    private Map<Long, Cuenta> m = new HashMap<>();

    public CuentaDaoInMemoryImpl() {
        Cuenta c1 = new Cuenta();
        c1.setId(1L);
        c1.setTitular("Juan");
        c1.setSaldo(10.0);
        
        Cuenta c2 = new Cuenta();
        c2.setId(2L);
        c2.setTitular("Maria");
        c2.setSaldo(20.0);
        
        m.put(c1.getId(), c1);
        m.put(c2.getId(), c2);
    }

    @Override
    public void update(Cuenta cuenta) {
        m.put(cuenta.getId(), cuenta);
    }

    @Override
    public Cuenta find(long cuentaID) {
        return m.get(cuentaID);
    }
    
    //other method implementations

    @Override
    public void insert(Cuenta account) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void update(List<Cuenta> accounts) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(long accountId) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Cuenta> find(List<Long> accountIds) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Cuenta> find(String ownerName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Cuenta> find(boolean locked) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

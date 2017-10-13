package learn.spring.ejemplo01;
import java.util.Date;

public class Cuenta {
    private long id;
    private String titular;
    private double saldo;
    private Date accessTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", titular=" + titular + ", saldo=" + saldo + ", accessTime=" + accessTime + '}';
    }
    
    

}
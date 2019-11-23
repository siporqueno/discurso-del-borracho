package base.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "refranes", schema = "expresiones")
public class Refran {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "expres")
    private String expres;

    @Column(name = "transl")
    private String transl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpres() {
        return expres;
    }

    public void setExpres(String expres) {
        this.expres = expres;
    }

    public String getTransl() {
        return transl;
    }

    public void setTransl(String transl) {
        this.transl = transl;
    }

    public Refran() {
    }

    public Refran(Long id, String expres, String transl) {
        this.id = id;
        this.expres = expres;
        this.transl = transl;
    }

    @Override
    public String toString() {
        return String.format("Refrán: [ id = %d, refrán = %s, traducción = %s]", id, expres, transl);
    }
}

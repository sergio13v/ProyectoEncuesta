/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sergio13v
 */
@Entity
@Table(name = "ENCUESTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encuesta.findAll", query = "SELECT e FROM Encuesta e")
    , @NamedQuery(name = "Encuesta.findByIdEncuesta", query = "SELECT e FROM Encuesta e WHERE e.idEncuesta = :idEncuesta")
    , @NamedQuery(name = "Encuesta.findByNomEncuesta", query = "SELECT e FROM Encuesta e WHERE e.nomEncuesta = :nomEncuesta")
    , @NamedQuery(name = "Encuesta.findByDescripcionEncuesta", query = "SELECT e FROM Encuesta e WHERE e.descripcionEncuesta = :descripcionEncuesta")})
public class Encuesta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ENCUESTA")
    private Long idEncuesta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOM_ENCUESTA")
    private String nomEncuesta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION_ENCUESTA")
    private String descripcionEncuesta;
    @JoinTable(name = "ENCUESTA_PREGUNTA", joinColumns = {
        @JoinColumn(name = "ID_ENCUESTA", referencedColumnName = "ID_ENCUESTA")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_PREGUNTA", referencedColumnName = "ID_PREGUNTA")})
    @ManyToMany
    private List<Pregunta> preguntaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEncuesta")
    private List<Sesion> sesionList;

    public Encuesta() {
    }

    public Encuesta(Long idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public Encuesta(Long idEncuesta, String nomEncuesta, String descripcionEncuesta) {
        this.idEncuesta = idEncuesta;
        this.nomEncuesta = nomEncuesta;
        this.descripcionEncuesta = descripcionEncuesta;
    }

    public Long getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Long idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getNomEncuesta() {
        return nomEncuesta;
    }

    public void setNomEncuesta(String nomEncuesta) {
        this.nomEncuesta = nomEncuesta;
    }

    public String getDescripcionEncuesta() {
        return descripcionEncuesta;
    }

    public void setDescripcionEncuesta(String descripcionEncuesta) {
        this.descripcionEncuesta = descripcionEncuesta;
    }

    @XmlTransient
    public List<Pregunta> getPreguntaList() {
        return preguntaList;
    }

    public void setPreguntaList(List<Pregunta> preguntaList) {
        this.preguntaList = preguntaList;
    }

    @XmlTransient
    public List<Sesion> getSesionList() {
        return sesionList;
    }

    public void setSesionList(List<Sesion> sesionList) {
        this.sesionList = sesionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEncuesta != null ? idEncuesta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encuesta)) {
            return false;
        }
        Encuesta other = (Encuesta) object;
        if ((this.idEncuesta == null && other.idEncuesta != null) || (this.idEncuesta != null && !this.idEncuesta.equals(other.idEncuesta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GlobalSurveys.Entity.Encuesta[ idEncuesta=" + idEncuesta + " ]";
    }
    
}

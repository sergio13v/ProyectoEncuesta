/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GlobalSurveys.Entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sergio13v
 */
@Entity
@Table(name = "SESION_PREGUNTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SesionPreguntas.findAll", query = "SELECT s FROM SesionPreguntas s")
    , @NamedQuery(name = "SesionPreguntas.findByIdSesion", query = "SELECT s FROM SesionPreguntas s WHERE s.sesionPreguntasPK.idSesion = :idSesion")
    , @NamedQuery(name = "SesionPreguntas.findByIdPregunta", query = "SELECT s FROM SesionPreguntas s WHERE s.sesionPreguntasPK.idPregunta = :idPregunta")})
public class SesionPreguntas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SesionPreguntasPK sesionPreguntasPK;
    @JoinColumn(name = "ID_SESION", referencedColumnName = "ID_SESION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sesion sesion;
    @JoinColumn(name = "ID_PREGUNTA", referencedColumnName = "ID_PREGUNTA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pregunta pregunta;
    @JoinColumn(name = "ID_RESPUESTA", referencedColumnName = "ID_RESPUESTA")
    @ManyToOne
    private Respuesta idRespuesta;

    public SesionPreguntas() {
    }

    public SesionPreguntas(SesionPreguntasPK sesionPreguntasPK) {
        this.sesionPreguntasPK = sesionPreguntasPK;
    }

    public SesionPreguntas(long idSesion, long idPregunta) {
        this.sesionPreguntasPK = new SesionPreguntasPK(idSesion, idPregunta);
    }

    public SesionPreguntasPK getSesionPreguntasPK() {
        return sesionPreguntasPK;
    }

    public void setSesionPreguntasPK(SesionPreguntasPK sesionPreguntasPK) {
        this.sesionPreguntasPK = sesionPreguntasPK;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public Respuesta getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Respuesta idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sesionPreguntasPK != null ? sesionPreguntasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionPreguntas)) {
            return false;
        }
        SesionPreguntas other = (SesionPreguntas) object;
        if ((this.sesionPreguntasPK == null && other.sesionPreguntasPK != null) || (this.sesionPreguntasPK != null && !this.sesionPreguntasPK.equals(other.sesionPreguntasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GlobalSurveys.Entity.SesionPreguntas[ sesionPreguntasPK=" + sesionPreguntasPK + " ]";
    }
    
}

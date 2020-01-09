package GlobalSurveys.Entity;

import GlobalSurveys.Entity.Encuesta;
import GlobalSurveys.Entity.SesionPreguntas;
import GlobalSurveys.Entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T20:27:25")
@StaticMetamodel(Sesion.class)
public class Sesion_ { 

    public static volatile SingularAttribute<Sesion, Date> fecha;
    public static volatile SingularAttribute<Sesion, Long> idSesion;
    public static volatile SingularAttribute<Sesion, Usuario> idUsuario;
    public static volatile ListAttribute<Sesion, SesionPreguntas> sesionPreguntasList;
    public static volatile SingularAttribute<Sesion, Encuesta> idEncuesta;

}
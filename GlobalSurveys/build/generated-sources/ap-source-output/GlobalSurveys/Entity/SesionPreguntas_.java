package GlobalSurveys.Entity;

import GlobalSurveys.Entity.Pregunta;
import GlobalSurveys.Entity.Respuesta;
import GlobalSurveys.Entity.Sesion;
import GlobalSurveys.Entity.SesionPreguntasPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T20:05:37")
@StaticMetamodel(SesionPreguntas.class)
public class SesionPreguntas_ { 

    public static volatile SingularAttribute<SesionPreguntas, SesionPreguntasPK> sesionPreguntasPK;
    public static volatile SingularAttribute<SesionPreguntas, Sesion> sesion;
    public static volatile SingularAttribute<SesionPreguntas, Respuesta> idRespuesta;
    public static volatile SingularAttribute<SesionPreguntas, Pregunta> pregunta;

}
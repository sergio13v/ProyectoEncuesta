package GlobalSurveys.Entity;

import GlobalSurveys.Entity.Pregunta;
import GlobalSurveys.Entity.SesionPreguntas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T20:27:25")
@StaticMetamodel(Respuesta.class)
public class Respuesta_ { 

    public static volatile ListAttribute<Respuesta, SesionPreguntas> sesionPreguntasList;
    public static volatile SingularAttribute<Respuesta, String> respuesta;
    public static volatile SingularAttribute<Respuesta, Long> idRespuesta;
    public static volatile SingularAttribute<Respuesta, Pregunta> idPregunta;

}
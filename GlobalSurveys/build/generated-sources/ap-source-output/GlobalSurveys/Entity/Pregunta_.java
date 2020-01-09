package GlobalSurveys.Entity;

import GlobalSurveys.Entity.Encuesta;
import GlobalSurveys.Entity.Respuesta;
import GlobalSurveys.Entity.SesionPreguntas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T20:11:23")
@StaticMetamodel(Pregunta.class)
public class Pregunta_ { 

    public static volatile ListAttribute<Pregunta, SesionPreguntas> sesionPreguntasList;
    public static volatile ListAttribute<Pregunta, Respuesta> respuestaList;
    public static volatile ListAttribute<Pregunta, Encuesta> encuestaList;
    public static volatile SingularAttribute<Pregunta, Long> idPregunta;
    public static volatile SingularAttribute<Pregunta, String> pregunta;

}
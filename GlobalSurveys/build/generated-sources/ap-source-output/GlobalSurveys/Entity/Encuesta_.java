package GlobalSurveys.Entity;

import GlobalSurveys.Entity.Pregunta;
import GlobalSurveys.Entity.Sesion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-09T20:11:23")
@StaticMetamodel(Encuesta.class)
public class Encuesta_ { 

    public static volatile SingularAttribute<Encuesta, String> descripcionEncuesta;
    public static volatile SingularAttribute<Encuesta, Long> idEncuesta;
    public static volatile ListAttribute<Encuesta, Sesion> sesionList;
    public static volatile SingularAttribute<Encuesta, String> nomEncuesta;
    public static volatile ListAttribute<Encuesta, Pregunta> preguntaList;

}
package base.repositories;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ExpressionRepository {

    private List<String> expres;

    public List<String> getExpres() {
        return expres;
    }

    @PostConstruct
    public void init() {
        expres = new ArrayList<>();
        expres.add("Los niños son la esperanza del mundo.");
        expres.add("¡Somos hijos del maltrato!");
        expres.add("Lo cortés no quita lo valiente. Учтивость храбрости не помеха.");
        expres.add("¡A lo hecho pecho! Что сделано, то сделано.");
        expres.add("Estás arando en el mar. Ты пашешь песок. Чтобы выразить то, что человек занимается чем-то бесполезным.");
        expres.add("La trampa está dondequiera!");
        expres.add("¡Con la iglesia hemos topado!");
        expres.add("¡Todo tiene su porque!");
        expres.add("¡Causa y efecto!");
        expres.add("¡Deja que te coja! Ну погоди!");
        expres.add("¡Feliz navidad! ¡Feliz Fin de año y próspero año nuevo! ¡Felicidades!");
        expres.add("No hay mal que por bien no venga. Нет худа без добра.");
        expres.add("No quiero cantidad, quiero calidad.");
        expres.add("Todo en la vida tiene sus pros y sus contras.");
        expres.add("Lo que fue y ya no es, es como si nunca hubiera sido.");
        expres.add("Se ha metido en camisa de once varas.");
        expres.add("Vete para el manicomio!");
        expres.add("Más vale tarde que nunca. Лучше поздно, чем никогда.");
        expres.add("Una sola golondrina no hace verano.");
        expres.add("Al que madruga Dios le ayuda.");
        expres.add("¡Vete al diablo! Иди к черту!");
        expres.add("De tal palo tal astilla. Яблочко от яблоньки недалеко падает.");
        expres.add("¡Ya está bien! ¿no?");
        expres.add("No sólo de pan vive el hombre.");
        expres.add("La voluntad vale oro.");
        expres.add("¡Vete a freir esparragos!");
        expres.add("Más vale pájaro en mano que ciento volando.");
        expres.add("¡Donde pone el ojo pone la bala!");
        expres.add("Muchas gallinas pocos huevos.");
        expres.add("Hay que tener sentido de humor y no humor en los sentidos.");
        expres.add("No callan verdad ni dicen mentiras.");
        expres.add("Y tanto que le lo dije. Я тебе говорил.");
        expres.add("¡Tropecé de nuevo con la misma piedra!");
        expres.add("La política no cabe en la azucarera.");
        expres.add("El vivo vive del bobo.");
        expres.add("No es lo mismo decir que hacer.");
        expres.add("El río revuelto ganancia de pescadores.");
        expres.add("La suerte es el pretexto de los fracasados.");
        expres.add("Al Cesar lo que es del Cesar. Цезарю - цезарево.");
        expres.add("No cantes victoria antes de tiempo.");
        expres.add("El Dios aprieta, pero no ahoga.");
        expres.add("En el teatro de la vida siempre debemos tener dos jabas una para ganar la otra para perder.");
        expres.add("El mejor amigo del hombre es una jaba.");
        expres.add("Esto sucede hasta en las mejores familias. Со всеми бывает.");
        expres.add("Ladrón que roba a ladrón tiene cien años de perdón.");
        expres.add("Le pagaron con su propia moneda. Ему отплатили тем же.");
        expres.add("El oficio que cambia de casaca no es confiable.");
        expres.add("No hay mal que dure 100 años, ni cuerpo que lo resiste.");
        expres.add("Cada loco con su tema. Каждый сходит с ума по своему.");
        expres.add("La pobreza no es un vicio.");
        expres.add("Debajo del sol nada es extraño.");
        expres.add("No hay ni perritos ni gallitos. (Estoy solo sin niños pequeños y sin animales.)");
    }
}

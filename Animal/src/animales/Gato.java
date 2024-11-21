package animales;

public class Gato extends Felino {

    @Override
    public String getNombreCientifico(){
        return "Gato: ";
    }

    @Override
    public String getSonido(){
        return "Gato: su sonido es el maullido";
    }

    @Override
    public String getAlimentos(){
        return "Gato: su alimentación son los ratones";
    }

    @Override
    public String getHabitad(){
        return "Gato: Su habitad es doméstica";
    }
}

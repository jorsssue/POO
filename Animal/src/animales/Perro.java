package animales;


public class Perro extends Canido {

    @Override
    public String getNombreCientifico(){
        return "Perro: Canis Lupus Familiaris";
    }

    @Override
    public String getSonido(){
        return "Perro: su sonido es el ladrido";
    }

    @Override
    public String getAlimentos(){
        return "Perro: su alimentación es carnívora";
    }

    @Override
    public String getHabitad(){
        return "Perro: Su habitad es doméstica";
    }
}


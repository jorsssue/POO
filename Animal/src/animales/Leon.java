package animales;

public class Leon extends Felino {
    
    @Override
    public String getNombreCientifico(){
        return "León: ";
    }

    @Override
    public String getSonido(){
        return "León: su sonido es el ladrido";
    }

    @Override
    public String getAlimentos(){
        return "León: su alimentación es carnívora";
    }

    @Override
    public String getHabitad(){
        return "León: Su habitad es doméstica";
    }
}

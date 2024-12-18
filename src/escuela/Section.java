package escuela;

import java.util.ArrayList;

public class Section {
    private String NRC;
    private ArrayList<Student> arrayStu;

    public Section() {
        this.NRC = "21761";
        arrayStu = new ArrayList<>();
    }

    public void addStudent(Student st) {
        arrayStu.add(st);
        System.out.println("Estudiante Agregado");
    }

    public void searchStudent(int id) {
        for (int i = 0; i < arrayStu.size(); i++) {
            if (id == arrayStu.get(i).getId()) {
                System.out.println("Id: " + arrayStu.get(i).getId());
                System.out.println("Nombre: " + arrayStu.get(i).getName());
                System.out.println("Edad: " + arrayStu.get(i).getAge());
                System.out.println("Genero: " + arrayStu.get(i).getGender());
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        for (Student st : arrayStu) {
            if (st.getId() == id) {
                arrayStu.remove(st);
            }
        }
        System.out.println("Estudiante eliminado");
    }

    public void printByGender(String gender) {
        for (Student st : arrayStu) {
            if (st.getGender().equalsIgnoreCase(gender)){
                System.out.println(st.getName());
            }
        }
        
    }

    @Override
    public String toString() {
        return "Section [NRC=" + NRC + ", arrayStu=" + arrayStu + "]";
    }

    
}

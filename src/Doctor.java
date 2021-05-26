import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Doctor {
    
    JSONObject DDoc = new JSONObject();
    JSONArray DocList = new JSONArray();
    JSONObject Auxiliar = new JSONObject(); 
    String Nombre;
    String Matricula;
    String Especialidad;

    public Doctor(String Nombre, String Matricula, String Especialidad) {
        this.Nombre = Nombre;
        this.Matricula = Matricula;
        this.Especialidad = Especialidad;
    }

    public Doctor() {
    }

    public JSONObject getListDoc() {
        return this.DDoc;
    }

    public void setListDoc(JSONObject DDoc) {
        this.DDoc = DDoc;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMatricula() {
        return this.Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getEspecialidad() {
        return this.Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }


    public void create(){

        DDoc.put("Nombre", this.Nombre);
        DDoc.put("Matricula", this.Matricula);
        DDoc.put("Especialidad", this.Especialidad);
        Auxiliar.put("Doctore", DDoc);
        DocList.add(Auxiliar);
    }
 

    public void cut(){


        DDoc.remove(Nombre);
        DDoc.remove(Matricula);
        DDoc.remove(Especialidad);
        

    }

    public void subido() {

        try(FileWriter file = new FileWriter("Doctor.json")){

            file.write(DocList.toJSONString());
            file.flush();
            
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(DocList);
    }

}

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Cita{


    JSONObject Citas = new JSONObject();
    JSONArray CitasList = new JSONArray();
    JSONObject AuxiliarCitas = new JSONObject();
    String DoctorCita,PacienteCita,Fecha,Hora,MotivoCita;

    public Cita(String DoctorCita, String PacienteCita, String Fecha, String Hora, String MotivoCita) {

        this.DoctorCita = DoctorCita;
        this.PacienteCita = PacienteCita;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.MotivoCita = MotivoCita;
    }
    
    public Cita() {
    }
    


    public JSONObject getCitas() {
        return this.Citas;
    }

    public void setCitas(JSONObject Citas) {
        this.Citas = Citas;
    }

    public JSONArray getCitasList() {
        return this.CitasList;
    }

    public void setCitasList(JSONArray CitasList) {
        this.CitasList = CitasList;
    }

    public JSONObject getAuxiliarCitas() {
        return this.AuxiliarCitas;
    }

    public void setAuxiliarCitas(JSONObject AuxiliarCitas) {
        this.AuxiliarCitas = AuxiliarCitas;
    }

    public String getDoctorCita() {
        return this.DoctorCita;
    }

    public void setDoctorCita(String DoctorCita) {
        this.DoctorCita = DoctorCita;
    }

    public String getPacienteCita() {
        return this.PacienteCita;
    }

    public void setPacienteCita(String PacienteCita) {
        this.PacienteCita = PacienteCita;
    }

    public String getFecha() {
        return this.Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return this.Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getMotivoCita() {
        return this.MotivoCita;
    }

    public void setMotivoCita(String MotivoCita) {
        this.MotivoCita = MotivoCita;
    }
    
    
    public void createC(){

        Citas.put("Doctor", this.DoctorCita);
        Citas.put("Paciente", this.PacienteCita);
        Citas.put("Fecha", this.Fecha);
        Citas.put("Hora", this.Hora);
        Citas.put("Motiivo", this.MotivoCita);
        AuxiliarCitas.put("Cliente", Citas);
        CitasList.add(AuxiliarCitas);
         
    }

    public void cutt(){


        Citas.remove(DoctorCita);
        Citas.remove(PacienteCita);
        Citas.remove(PacienteCita);
        Citas.remove(Fecha);
        Citas.remove(Hora);

    

    }

    public void addC() {



        try(FileWriter file = new FileWriter("Citas.json")){

            file.write(CitasList.toJSONString());
            file.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
        
        System.out.println("Subida a la base de datos" + CitasList);
    }

  

}


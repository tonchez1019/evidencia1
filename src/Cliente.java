import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Cliente {

    JSONObject DClient = new JSONObject();
    JSONArray CList = new JSONArray();
    JSONObject AuxiliarC = new JSONObject();

    String NombreC;
    String MatriculaC;

    public Cliente() {
    }

    public Cliente(String NombreC, String Matriculac) {
        this.NombreC = Matriculac;
        this.MatriculaC = Matriculac;
    }

    public JSONObject getDClient() {
        return this.DClient;
    }

    public void setDClient(JSONObject DClient) {
        this.DClient = DClient;
    }

    public JSONArray getCList() {
        return this.CList;
    }

    public void setCList(JSONArray CList) {
        this.CList = CList;
    }

    public JSONObject getAuxiliarC() {
        return this.AuxiliarC;
    }

    public void setAuxiliarC(JSONObject AuxiliarC) {
        this.AuxiliarC = AuxiliarC;
    }

    public String getNombreC() {
        return this.NombreC;
    }

    public void setNombreC(String NombreC) {
        this.NombreC = NombreC;
    }

    public String getMatriculaC() {
        return this.MatriculaC;
    }

    public void setMatriculaC(String MatriculaC) {
        this.MatriculaC = MatriculaC;
    }

    public void createC() {

        DClient.put("NombreCliente", this.NombreC);
        DClient.put("MatriculaCliente", this.MatriculaC);
        AuxiliarC.put("Cliente", DClient);
        CList.add(AuxiliarC);

    }

    public void cutC() {

        DClient.remove(NombreC);
        DClient.remove(MatriculaC);

    }


    public void subido() {
        try (FileWriter file = new FileWriter("D:/tareas/computacion en java/programas/evidencia/actividad/Cliente.json")) {

            file.write(CList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(CList);
    }
}

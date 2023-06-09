/*Clase CondicionesDePeso que contienen la informacion 
 * sobre laas condiciones de peso
 */
package cimc;

/**
 *
 * @author user
 */
public class CondicionesDePeso {

    protected String bajoPeso;
    protected String obesidad;
    protected String obesividadMordiba;
    protected String desnutricion;
    protected String pesoNormal;
    protected String sobrePeso;

    
    //contructor que asigana valore de tipo String a los atributos
    //con la informacion saca de internet sobre las condiciones de peso
    public CondicionesDePeso() {
        this.bajoPeso = "tu bajo peso podría hacer disminuir "
                + "\ntus defensas inmunitarias. "
                + "\nTe aconsejamos una dieta equilibrada "
                + "\ny ejercicio para ganar peso y aumentar "
                + "\ntu masa de muscular.";

        this.obesidad = "Tu exceso de peso te pone "
                + "\nen peligro para un problema "
                + "\ncardíaco, diabetes, hipertensión, "
                + "\nenfermedad de vesícula y algunos"
                + "\ncánceres. Deberías perder peso "
                + "\ncambiando de dieta y haciendo más "
                + "\nejercicio y debes consultar a "
                + "\nun médico, ya que conlleva"
                + "\nriesgos para tu salud.";

        this.desnutricion = "Tienes una cantidad baja de grasa"
                + "\nen el ncuerpo. Tus defensas "
                + "\ninmunitarias npodrían disminuir."
                + "\nDeberías visitar a un"
                + "\nnasegurarte que estás bien, "
                + "\nya que podría nser nun criterio de "
                + "\nhospitalización. "
                + "\nTe aconsejamos nuna dieta "
                + "\nequilibrada y ejercicio "
                + "\npara ganar peso y aumentar "
                + "\ntu masa de muscular.";

        this.obesividadMordiba = "La obesidad mórbida es la forma más"
                + "\ntemible del exceso de peso pues "
                + "\nademás de disminuir la expectativa"
                + "\nde vida causa discapacidad, "
                + "\nminusvalía y problemas de exclusión"
                + "\nsocial debes consultar a un médico,"
                + "\nya que conlleva riesgos para tu "
                + "\nsalud es importante realizar "
                + "\nun planteamiento médico riguroso para"
                + "\nllevar al enfermo a un peso razonable"
                + "\nnunos de etos tratamientos es."
                + "\nTratamiento Dietético Hipocalorico:"
                + "\ncomo piedra angular, con la realización"
                + "\nde una dieta personal e "
                + "\nintransferible que "
                + "\nse adapte a las características "
                + "\nindividuales de cada enfermo.";

        this.pesoNormal = "Tu IMC es ideal. Tienes una cantidad"
                + "\nsana nde grasa en el cuerpo, que es"
                + "\nasociado con una vida más larga, y bajas"
                + "\nposibilidades de enfermedad grave."
                + "\nCoincidencia o no, la ngente percibe las"
                + "\npersonas con este IMC más atractivas"
                + "\nestéticamente.";

        this.sobrePeso = "Estás aumentando el riesgo de "
                + "\nenfermedades"
                + "\ncon tu peso actual. Realiza una"
                + "\nalimentación planificada y equilibrada."
                + "\nHaz ejercicio físico regular mediante"
                + "\nalgún tipo de práctica deportiva. ";

    }

    
    
    //metodos que retornan la condicion de peso y lainformacion
    //segun el Imc
    public String obesidadMordiba() {
        return "Obesidad mordiba";
    }

    public String obesidad() {
        return "obesidad";
    }

    public String sobrepesoLeve() {
        return "Sobrepeso leve";
    }

    public String pesoNormal() {
        return "Peso normal";
    }

    public String desnutricion() {
        return "Desnutrició";
    }

    public String pesoBajo() {
        return "Peso bajo";
    }

    public String getBajoPeso() {
        return bajoPeso;
    }

    public String getObesidad() {
        return obesidad;
    }

    public String getObesividadMordiba() {
        return obesividadMordiba;
    }

    public String getDesnutricion() {
        return desnutricion;
    }

    public String getPesoNormal() {
        return pesoNormal;
    }

    public String getSobrePeso() {
        return sobrePeso;
    }
}

public class Estudiante {

    private String id;
    private String primerNombre;
    private String apellidoPaterno;
    private String email;
    private String genero;
    private String trabajo;
    private String diasLibres;
    private String extracurricular;
    private String sesionesSemanales;
    private String carrera;
    private String puntajeMatematicas;
    private String puntajeCiencias;
    private String puntajeFisica;
    private String puntajeQuimica;
    private String puntajeBiologia;
    private String puntajeIngles;
    private String puntajeGeografia;
    private double promedio;


    public Estudiante(String id, String primerNombre, String apellidoPaterno, String email, String genero, String trabajo, String diasLibres, String extracurricular, String sesionesSemanales, String carrera, String puntajeMatematicas, String puntajeCiencias, String puntajeFisica, String puntajeQuimica, String puntajeBiologia, String puntajeIngles, String puntajeGeografia, double promedio) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.email = email;
        this.genero = genero;
        this.trabajo = trabajo;
        this.diasLibres = diasLibres;
        this.extracurricular = extracurricular;
        this.sesionesSemanales = sesionesSemanales;
        this.carrera = carrera;
        this.puntajeMatematicas = puntajeMatematicas;
        this.puntajeCiencias = puntajeCiencias;
        this.puntajeFisica = puntajeFisica;
        this.puntajeQuimica = puntajeQuimica;
        this.puntajeBiologia = puntajeBiologia;
        this.puntajeIngles = puntajeIngles;
        this.puntajeGeografia = puntajeGeografia;
        this.promedio = promedio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getDiasLibres() {
        return diasLibres;
    }

    public void setDiasLibres(String diasLibres) {
        this.diasLibres = diasLibres;
    }

    public String getExtracurricular() {
        return extracurricular;
    }

    public void setExtracurricular(String extracurricular) {
        this.extracurricular = extracurricular;
    }

    public String getSesionesSemanales() {
        return sesionesSemanales;
    }

    public void setSesionesSemanales(String sesionesSemanales) {
        this.sesionesSemanales = sesionesSemanales;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuntajeMatematicas() {
        return puntajeMatematicas;
    }

    public void setPuntajeMatematicas(String puntajeMatematicas) {
        this.puntajeMatematicas = puntajeMatematicas;
    }

    public String getPuntajeCiencias() {
        return puntajeCiencias;
    }

    public void setPuntajeCiencias(String puntajeCiencias) {
        this.puntajeCiencias = puntajeCiencias;
    }

    public String getPuntajeFisica() {
        return puntajeFisica;
    }

    public void setPuntajeFisica(String puntajeFisica) {
        this.puntajeFisica = puntajeFisica;
    }

    public String getPuntajeQuimica() {
        return puntajeQuimica;
    }

    public void setPuntajeQuimica(String puntajeQuimica) {
        this.puntajeQuimica = puntajeQuimica;
    }

    public String getPuntajeBiologia() {
        return puntajeBiologia;
    }

    public void setPuntajeBiologia(String puntajeBiologia) {
        this.puntajeBiologia = puntajeBiologia;
    }

    public String getPuntajeIngles() {
        return puntajeIngles;
    }

    public void setPuntajeIngles(String puntajeIngles) {
        this.puntajeIngles = puntajeIngles;
    }

    public String getPuntajeGeografia() {
        return puntajeGeografia;
    }

    public void setPuntajeGeografia(String puntajeGeografia) {
        this.puntajeGeografia = puntajeGeografia;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }





    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", primerNombre='" + primerNombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", email='" + email + '\'' +
                ", genero='" + genero + '\'' +
                ", trabajo='" + trabajo  + '\'' +
                ", diasLibres='" + diasLibres + '\'' +
                ", extracurricular='" + extracurricular + '\'' +
                ", sesionesSemanales='" + sesionesSemanales + '\'' +
                ", carrera='" + carrera + '\'' +
                ", puntajeMatematicas='" + puntajeMatematicas + '\'' +
                ", puntajeCiencias='" + puntajeCiencias + '\'' +
                ", puntajeFisica='" + puntajeFisica + '\'' +
                ", puntajeQuimica='" + puntajeQuimica + '\'' +
                ", puntajeBiologia='" + puntajeBiologia + '\'' +
                ", puntajeIngles='" + puntajeIngles + '\'' +
                ", puntajeGeografia='" + puntajeGeografia + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}

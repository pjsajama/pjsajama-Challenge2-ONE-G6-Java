public class ResultadosConversion {
    private String codigoBase;
    private String codigoObjetivo;
    private double tasaConversion;
    private double resultadoConversion;

    public ResultadosConversion(Conversion conversion) {
        this.codigoBase = conversion.base_code();
        this.codigoObjetivo = conversion.target_code();
        this.tasaConversion = Double.parseDouble(conversion.conversion_rate());
        this.resultadoConversion = Double.parseDouble(conversion.conversion_result());
    }

    @Override
    public String toString() {
        return "ResultadosConversion{" +
                "codigoBase='" + codigoBase + '\'' +
                ", codigoObjetivo='" + codigoObjetivo + '\'' +
                ", tasaConversion=" + tasaConversion +
                ", resultadoConversion=" + resultadoConversion +
                '}';
    }

    public String getCodigoBase() {
        return codigoBase;
    }

    public void setCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }

    public String getCodigoObjetivo() {
        return codigoObjetivo;
    }

    public void setCodigoObjetivo(String codigoObjetivo) {
        this.codigoObjetivo = codigoObjetivo;
    }

    public double getTasaConversion() {
        return tasaConversion;
    }

    public void setTasaConversion(double tasaConversion) {
        this.tasaConversion = tasaConversion;
    }

    public double getResultadoConversion() {
        return resultadoConversion;
    }

    public void setResultadoConversion(double resultadoConversion) {
        this.resultadoConversion = resultadoConversion;
    }


}

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        String codigo1;
        String codigo2;
        String montoString;
        String json;
        ConversionMonedas conversionMonedas;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ResultadosConversion resultadosConversion;
        ArrayList<ResultadosConversion> resultadosConversions;
        Conversion conversion;

        while (opcion != 9) {
            System.out.println("**************************************************");
            System.out.println("      Bienvenidos/as al Convesor de Monedas");
            System.out.println(" ");
            System.out.println("   1) Dolar Americano =>> Peso Argentino");
            System.out.println("   2) Dolar Americano =>> Real Brasileño");
            System.out.println("   3) Dolar Americano =>> Peso Chileno");
            System.out.println("   4) Peso Argentino =>> Dolar Americano");
            System.out.println("   5) Peso Argentino =>> Real Brasileño");
            System.out.println("   6) Peso Argentino =>> Peso Chileno");
            System.out.println("   7) Real Brasileño =>> Dolar Americano");
            System.out.println("   8) Real Brasileño =>> Peso Argentino");
            System.out.println("   9) SALIR =>> ");
            System.out.println("**************************************************");
            System.out.println("Ingrese una opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    codigo1 = "USD";
                    codigo2 = "ARS";
                    System.out.println("Ingrese el monto: ");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " dolares americanos son: ");
                        System.out.println(conversion + " pesos argentinos");

                        //conversion = gson.fromJson(json, ResultadosConversion.class);
                        //System.out.println("prueba" + Conversion.getcodigoBase());
                        //JsonObject jsonObject =gson.fromJson(json, JsonObject.class);
                        //JsonArray jsonArray = jsonObject.getAsJsonArray("results");
                        //System.out.println(jsonArray.size() + (jsonArray.size() == 1 ? "resultado" : "resultados"));
                        /*
                        resultadosConversions =new ArrayList<>();
                        for (int i = 0; i < jsonArray.size(); i++) {
                            conversion =gson.fromJson(jsonArray.get(i), Conversion.class);
                            resultadosConversion = new ResultadosConversion(conversion);
                            resultadosConversions.add(resultadosConversion);
                        }
                        System.out.println(gson.toJson(resultadosConversions));
                        */
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    codigo1 = "USD";
                    codigo2 = "BRL";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " dolares americanos son: ");
                        System.out.println(conversion + " reales brasileños");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    codigo1 = "USD";
                    codigo2 = "CLP";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " dolares americanos son: ");
                        System.out.println(conversion + " pesos chilenos");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    codigo1 = "ARS";
                    codigo2 = "USD";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " pesos argentinos son: ");
                        System.out.println(conversion + " dolares americanos");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 5:
                    codigo1 = "ARS";
                    codigo2 = "BRL";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " pesos argentinos son: ");
                        System.out.println(conversion + " reales brasileños");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 6:
                    codigo1 = "ARS";
                    codigo2 = "CLP";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " pesos argentinos son: ");
                        System.out.println(conversion + " pesos chilenos");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 7:
                    codigo1 = "BRL";
                    codigo2 = "USD";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " reales brasileños son: ");
                        System.out.println(conversion + " dolares americanos");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 8:
                    codigo1 = "BRL";
                    codigo2 = "ARS";
                    System.out.println("Ingrese el monto");
                    montoString = String.valueOf(teclado.nextDouble());
                    try {
                        conversionMonedas = new ConversionMonedas(codigo1,codigo2,montoString);
                        json = conversionMonedas.getRespuestaJson();
                        conversion = gson.fromJson(json, Conversion.class);
                        System.out.println("El monto de " + montoString + " reales brasileños son: ");
                        System.out.println(conversion + " pesos argentinos");
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 9:
                    System.out.println("Saliendo de la Aplicacion.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
}

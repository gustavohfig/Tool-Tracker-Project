/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author NEX
 */
public class Util {

    public static int obtemNum(String texto) {
        Pattern pattern = Pattern.compile("\\d+");

        // Criar um objeto Matcher
        Matcher matcher = pattern.matcher(texto);

        // Concatenar os números encontrados em uma única sequência
        StringBuilder numeros = new StringBuilder();
        while (matcher.find()) {
            numeros.append(matcher.group());
        }

        return Integer.parseInt(numeros.toString().equals("") ? "0" : numeros.toString());

    }

    public static LocalDate converterData(String data) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatter);

    }

    public static String converterData(LocalDate localDate) {
        // Definir o padrão de formatação desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Converter LocalDate para String formatada
        return localDate.format(formatter);

    }

    /* public static Date converterData (LocalDate localDate){
        
   }*/
    public static LocalDate converterData(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1; // Mês começa em 0, então adicionamos 1
        int ano = calendar.get(Calendar.YEAR);

        return LocalDate.of(ano, mes, dia);

    }

    public static boolean verficarNumnoTexto(String texto) {
        int numero = obtemNum(texto);
        return numero == 0;
    }

    public static String converterPreco(BigDecimal preco) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');

        DecimalFormat decimalFormat = new DecimalFormat("R$ ###,###.##", symbols);
        decimalFormat.setParseBigDecimal(true);

        return decimalFormat.format(preco);
    }


    /*public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        Date d = new Date();
        
       // int numero = obtemNum("String 1");
        
        //System.out.println(numero);
    } */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brayan
 */
public class Calculadora {
    public static void main(String[] args) {
        
        CalculadoraCasio c= new CalculadoraCasio(
                "CASIO", "Casio", "3 ft","Azul","ZTE4T \n "
        );
        System.out.println(c.nombre);
        System.out.println(c.fabricante);
        System.out.println(c.tamaño);
        System.out.println(c.color);
        System.out.println(c.modelo);
  
         CalculadoraKenko k= new CalculadoraKenko(
            "KENKO", "Kenko", "5 ft","Negra","ZTE2E \n "
        );
        System.out.println(k.nombre1);
        System.out.println(k.fabricante1);
        System.out.println(k.tamaño1);
        System.out.println(k.color1);
        System.out.println(k.modelo1);
        CalculadoraDeli d= new CalculadoraDeli(
            "DELI", "Deli", "7 ft","Verde","ZT25E" 
        );
        System.out.println(d.nombre2);
        System.out.println(d.fabricante2);
        System.out.println(d.tamaño2);
        System.out.println(d.color2);
        System.out.println(d.modelo2);
}
public class CalculadoraCasio {
       public String nombre;
        String fabricante;
        String tamaño;
        String color;
        String modelo;
    public CalculadoraCasio(String nombre, String fabricante, String tamaño, String color, String modelo) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.tamaño = tamaño;
        this.color = color;
        this.modelo = modelo;
    }
    }
public class CalculadoraKenko {
       public String nombre1;
        String fabricante1;
        String tamaño1;
        String color1;
        String modelo1;
public CalculadoraKenko(String nombre1, String fabricante1, String tamaño1, String color1, String modelo1) {
        this.nombre1 = nombre1;
        this.fabricante1 = fabricante1;
        this.tamaño1 = tamaño1;
        this.color1 = color1;
        this.modelo1 = modelo1;
    }
}   
public class CalculadoraDeli {
       public String nombre2;
        String fabricante2;
        String tamaño2;
        String color2;
        String modelo2;
public CalculadoraDeli(String nombre2, String fabricante2, String tamaño2, String color2, String modelo2) {
        this.nombre2 = nombre2;
        this.fabricante2 = fabricante2;
        this.tamaño2 = tamaño2;
        this.color2 = color2;
        this.modelo2 = modelo2;
    }
}
 
}

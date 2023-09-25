package Persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Persona Persona1= new Persona("Micaela", "Gutierrez",45224490);
       Persona1.setPeso(53.00);
       Persona1.setAltura(1.64);
       Persona1.setSexo('F');
       Persona1.setEdad(19);
       Persona1.setFechaNacimiento(LocalDate.of(2003,9,24));

       //En estado

        System.out.println(Persona1.getEstado() ? "Se encuentra en estado" : "Se encuentra fuera de estado");

       //Cumpleaños
        System.out.println(Persona1.getCumpleAnios() ? "Hoy cumple años!!!" : "Hoy no es su cumpleaños :(");

       //Mayor de edad
        System.out.println(Persona1.getMayorEdad() ? "Es mayor de edad" :"Es menor de edad");

        //Votar
        System.out.println(Persona1.getVotar() ? "Está habilitado para votar" : "No está habilitado para votar");

        //Validar edad
        System.out.println(Persona1.validarEdad() ? "La edad es correcta" : "La edad es incorrecta");

        //Datos de la Persona
        System.out.println("Datos completos de la persona:");
       Persona1.getPersona();
        }
    }

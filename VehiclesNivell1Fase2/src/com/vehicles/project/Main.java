package com.vehicles.project;

import java.util.*;
import java.util.Scanner;

    public class Main {

	public static void main(String[] args) throws Exception{
		
            Scanner lector = new Scanner(System.in);
		
            System.out.println("Escriu la matrícula del cotxe: ");
            String matricula = lector.nextLine();
		
            System.out.println("Escriu la marca del cotxe: ");
            String marca = lector.nextLine();
		
            System.out.println("Específica el color del cotxe: ");
            String color = lector.nextLine();
		
            Car car1 = new Car(matricula, marca, color);
		
            System.out.println("Escriu la marca de les rodes del darrere: ");
            String marcaRodaDarrere = lector.nextLine();
		
            System.out.println("Escriu el diàmetre de les rodes del darrere: ");
            double diametreRodaDarrere = lector.nextDouble();
            lector.nextLine();
		
            Wheel rodaDarrere = new Wheel(marcaRodaDarrere, diametreRodaDarrere);
				
            System.out.println("Escriu la marca de les rodes del davant: ");
            String marcaRodaDavant = lector.nextLine();
		
            System.out.println("Escriu el diàmetre de les rodes del davant: ");
            double diametreRodaDavant = lector.nextDouble();
            lector.nextLine();
		
            Wheel rodaDavant = new Wheel(marcaRodaDavant, diametreRodaDavant);

            List<Wheel> rodesDavant = new ArrayList<>();
            rodesDavant.add(rodaDavant);
            rodesDavant.add(rodaDavant);
		
            List<Wheel> rodesDarrere = new ArrayList<>();
            rodesDarrere.add(rodaDarrere);
            rodesDarrere.add(rodaDarrere);
		
            car1.addWheels(rodesDavant, rodesDarrere);
		
            System.out.println(car1.toString());
		
            lector.close();
	}
    
    }

    
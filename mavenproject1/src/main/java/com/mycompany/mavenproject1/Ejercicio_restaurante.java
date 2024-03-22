package com.mycompany.mavenproject1;
import java.util.Scanner;


public class Ejercicio_restaurante {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Customer administrative= new Customer(CustomerRole.ADMINISTRATIVE, "1", "Pepito Perez");
        Customer student= new Customer(CustomerRole.STUDENT, "1", "Pepito Perez");
        administrative.sellFood();
        student.sellFood();
        
        
        Menu menu = new Menu();
        
        Food breakfast1= new Food(DishType.BREAKFAST, "huevos fritos",2400, "huevos, sal, primienta", 20 );
        Food breakfast2= new Food(DishType.BREAKFAST, "Caldo",2400, "carne, papa, platano", 20 );
        Food lunch1= new Food(DishType.LAUNCH, "pastas",2400, "pastas, albondiga, arroz", 20 );
        
        menu.addFood(breakfast1);
        menu.addFood(breakfast2);
        menu.addFood(lunch1);
    }
}



/*Food food1= new Food("calentado",1,20,"Breakfast");
        Food food2= new Food("Arroz chino",2,20,"Launch");
        Food food3= new Food("Pepito",3,20,"Dinner");
        
        System.out.println("Ingrese si es:");
        System.out.println("1.Estudiante");
        System.out.println("2.Docente");
        System.out.println("3.Administrativo");
        
        int role;
        role=sc.nextInt();
        
        switch(role){
            case 1:
        System.out.println("El valor de su comida sera:" + "2.400");
        System.out.println("¿Que desea comprar?");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        break;
            case 2:
        System.out.println("El valor de su comida sera:" + "8.400");
        System.out.println("¿Que desea comprar?");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        break;
            case 3:
        System.out.println("El valor de su comida sera:" + "8.400");
        System.out.println("¿Que desea comprar?");
        System.out.println("1.Desayuno");
        System.out.println("2.Almuerzo");
        System.out.println("3.Cena");
        break;
            
        
        }
    */
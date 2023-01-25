import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sheep sheep1 = new Sheep(6.3,4,"Male","Soy");
        Sheep sheep2 = new Sheep(6.3,4,"Male","Soy");
        Sheep sheep3 = new Sheep(6.3,4,"Male","Soy");
        Sheep sheep4 = new Sheep(6.3,4,"Male","Soy");

        Cow cow1 = new Cow(14.3,4,"Male","Bob");
        Cow cow2 = new Cow(14.3,4,"Male","Bob");
        Cow cow3 = new Cow(14.3,4,"Male","Bob");
        Cow cow4 = new Cow(14.3,4,"Male","Bob");
        Cow cow5 = new Cow(14.3,4,"Male","Bob");
        Cow cow6 = new Cow(14.3,4,"Male","Bob");

        Horse horse1 = new Horse(30.2,7,"Female","Mus");
        Horse horse2 = new Horse(30.2,7,"Female","Mus");
        Horse horse3 = new Horse(30.2,7,"Female","Mus");


        Farm  farm = new Farm("Osh",new Cow[]{cow1,cow2,cow3,cow4,cow5},new Horse[]{horse1,horse2},new Sheep[]{sheep1,sheep2,sheep3},"Timur");
        Farm farm2 = new Farm("Osh",new Cow[] {cow6},new Horse[] {horse3},new Sheep[]{sheep4},"Meder");

        System.out.println(farm);
        System.out.println(farm2 );



        }
    }
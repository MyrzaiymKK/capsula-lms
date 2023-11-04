import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    University university1 = new University();
    university1.setName("KGTU");
    university1.setFound(1920);
    university1.setDirector("Japarov");

    University university2 = new University();
    university2.setName("Manas");
    university2.setFound(2000);
    university2.setDirector("Omer");
    University[] univ = {university1,university2};
               //
    School school1 = new School();
    school1.setName("Vakkera");
    school1.setDirector("Ryskulova");
    school1.setChildren(1200);

    School school2 = new School();
    school2.setName("Kant");
    school2.setChildren(760);
    school2.setDirector("Kydyrmyshova");
    School[] schools = {school1,school2};
              //
    Car car1 = new Car();
    car1.setMarka("lexus");
    car1.setYear(2003);
    car1.setCost(18000);

    Car car2 = new Car();
    car2.setMarka("Sonata");
    car2.setYear(2010);
    car2.setCost(10000);
    Car[] cars = {car1,car2};
              //
    Person person1 = new Person();
    person1.setName("Mika");
    person1.setAge(20);
    person1.setCountry("Kyrgyzstan");

    Person person2 = new Person();
    person2.setName("Jigit");
    person2.setAge(21);
    person2.setCountry("Kyrgyzstan");
    Person[] persons = {person1,person2};

        for (University university : univ) {
            System.out.println(university.getUniInfo());
        }
        for (School sch : schools){
            System.out.println(sch.getSchInfo());
        }
        for (Car carr : cars){
            System.out.println( STR."""
                Марка: \{carr.getMarka()}
                Год: \{carr.getYear()}
                Цена: \{carr.getCost()}
                """);
        }
        for (Person per : persons){
            System.out.println(STR."""
                Имя: \{per.getName()}
                Возраст: \{per.getAge()}
                Страна: \{per.getCountry()}
                """);
        }


        }
    }

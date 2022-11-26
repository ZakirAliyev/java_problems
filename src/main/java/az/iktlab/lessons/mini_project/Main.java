package az.iktlab.lessons.mini_project;

public class Main {

    public static void main(String[] args) {

        Human mother = new Human("Vito","Karleone");
        Human father = new Human("Jane","Karleone");
        Pet pet = new Pet(Species.DOG,"Rock", (short) 5, (short) 75,new String[]{"eat, drink, sleep"});
        Family family = new Family(mother,father);
        String[][] schedule = {
                {DayOfWeek.MONDAY.name(),  "Singing..."},
                {DayOfWeek.THURSDAY.name(),  "Singing..."},
                {DayOfWeek.WEDNESDAY.name(),  "Singing..."},
                {DayOfWeek.THURSDAY.name(),  "Singing..."},
                {DayOfWeek.FRIDAY.name(),  "Singing..."},
                {DayOfWeek.SATURDAY.name(),  "Singing..."},
                {DayOfWeek.SUNDAY.name(),  "Singing..."}};
        Human human = new Human("Michael","Karleone",1977,(short)9,schedule,family);

        Human mother1 = new Human("Raqsana","Aliyeva");
        Human father1 = new Human("Aga","Aliyev");
        Pet pet1 = new Pet(Species.CAT,"Piston", (short) 2, (short) 25,new String[]{"run, climb, cirmaq"});
        Family family1 = new Family(mother1,father1);
        String[][] schedule1 = {
                {DayOfWeek.MONDAY.name(),  "1th work..."},
                {DayOfWeek.TUESDAY.name(),  "2nd work..."},
                {DayOfWeek.WEDNESDAY.name(),  "3rd work..."},
                {DayOfWeek.THURSDAY.name(),  "4th work..."},
                {DayOfWeek.FRIDAY.name(),  "5th work..."},
                {DayOfWeek.SATURDAY.name(),  "6th work..."},
                {DayOfWeek.SUNDAY.name(),  "7th work..."}};
        Human human1 = new Human("Zakir","Aliyev",2004,(short)100,schedule1,family1);

        System.out.println(human);
        System.out.println();
        System.out.println(pet);
        System.out.println();
        System.out.println(pet1);
        System.out.println();
        System.out.println(human1);
        System.out.println();

//        for (int i = 0; i < 1_000_000; i++) {
//            new Human();
//        }


    }
}

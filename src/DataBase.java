import java.util.ArrayList;

public class DataBase {



    public static ArrayList<Student> studentslist=new ArrayList<>();
    public static ArrayList<Course> courseslist=new ArrayList<>();

    static
    {
        studentslist.add(new Student("Kumar", 1,"Jaffna"));
        studentslist.add(new Student("Miller", 2,"Galle"));
        studentslist.add(new Student("Piri", 3,"Colombo"));
        studentslist.add(new Student("Kinch", 4,"Hatton"));
        studentslist.add(new Student("Niro", 5,"Batti"));
        studentslist.add(new Student("Kopi", 6,"Trinco"));
        studentslist.add(new Student("Siva", 7,"Vavuniya"));
        studentslist.add(new Student("Sutha", 8,"Mannar"));
        studentslist.add(new Student("Thanu", 9,"Kandy"));
        studentslist.add(new Student("Thuva", 10,"Ampara"));

        courseslist.add(new Course(100,"HARDWARE","6months"));
        courseslist.add(new Course(101,"NETWORK","6months"));
        courseslist.add(new Course(102,"SOFTWARE","8months"));
        courseslist.add(new Course(103,"ENGLISH","4months"));
        courseslist.add(new Course(104,"ARDUINO","3months"));
        courseslist.add(new Course(105,"CAD","4months"));
        courseslist.add(new Course(106,"MECHANIC","6months"));
        courseslist.add(new Course(107,"ELECTRICAL","8months"));
        courseslist.add(new Course(108,"CIVIL","12months"));
        courseslist.add(new Course(109,"SINHALA","3months"));
    }



}

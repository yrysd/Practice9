import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.fullName = "Aidana Ibraimova";
        student.gender = "girl";
        student.age = 20;
        student.id = 1;
        student.group = "Java 8";

        Student student1 = new Student();
        student1.fullName = "Kanubek uulu Baiel";
        student1.gender = "boy";
        student1.age = 23;
        student1.id = 2;
        student1.group = "Java 8";


        Student student2 = new Student();
        student2.fullName = "Chorobekov Almaz";
        student2.gender = "boy";
        student2.age = 18;
        student2.id = 3;
        student2.group = "Java 8";


        Student student3 = new Student();
        student3.fullName = "Sultan Beisheev";
        student3.gender = "boy";
        student3.age = 23;
        student.group = "Java 8";
        student3.id = 4;


        Student student4 = new Student();
        student4.fullName = "Samira Nurmat kyzy";
        student4.gender = "girl";
        student4.age = 19;
        student4.id = 5;
        student4.group = "Java 8";


        Student student5 = new Student();
        student5.fullName = "Agakhan Kalambekov";
        student5.gender = "boy";
        student5.age = 22;
        student5.id = 6;
        student5.group = "Java 8";

        Student student6 = new Student();
        student6.fullName = "Iliaz Sariev";
        student6.age = 27;
        student6.gender = "boy";
        student6.id = 7;
        student6.group = "Java 8";

        Student student7 = new Student();
        student7.fullName = "Saltanat Nematilla kyzy";
        student7.age = 18;
        student7.gender = "girl";
        student7.id = 8;
        student7.group = "Java 8";

        Student student8 = new Student();
        student8.fullName = "Ilim";
        student8.age = 18;
        student8.gender = "boy";
        student8.id = 9;
        student8.group = "Java 8";

        Student student9 = new Student();
        student9.fullName = "Nurseyit Sadirov";
        student9.age = 16;
        student9.gender ="boy";
        student9.id = 10;
        student9.group = "Java 8";

        Student student10 = new Student();
        student10.fullName = "Alibek";
        student10.age = 19;
        student2.gender = "boy";
        student10.id = 11;
        student10.group = "Java 8";

        Student student11 = new Student();
        student11.fullName = "Syimyk";
        student11.age = 22;
        student11.gender = "boy";
        student11.id = 12;
        student11.group = "Java 8";

        Student student12 = new Student();
        student12.fullName = "Altynai Toktorova";
        student12.age = 18;
        student12.gender = "girl";
        student12.id = 13;
        student12.group = "Java 8";

        Student student13 = new Student();
        student13.fullName = "Nabi Masaliev";
        student13.age = 19;
        student13.gender = "boy";
        student13.id = 14;
        student13.group = "Java 8";

        Student student14 = new Student();
        student14.fullName = "Keldibek Omurzakov";
        student14.age = 22;
        student14.gender = "boy";
        student14.id = 15;
        student14.group = "Java 8";

        Student student15 = new Student();
        student15.fullName = "Erkinbek Koshaliev";
        student15.age = 27;
        student15.gender = "boy";
        student15.id = 16;
        student15.group = "Java 8";

        Student student16 = new Student();
        student16.fullName = "Altynbek Sadirov";
        student16.age = 25;
        student16.gender = "boy";
        student16.id = 17;
        student16.group = "Java 8";

        Student student17 = new Student();
        student17.fullName = "Sanjar Abdymomunov";
        student17.age = 18;
        student17.gender = "boy";
        student17.id = 18;
        student17.group = "Java 8";

        Student student18 = new Student();
        student18.fullName = "Nuradil Dzholdoshov";
        student18.age = 23;
        student18.gender = "boy";
        student18.id = 21;
        student18.group = "Java 8";

        Student student19 = new Student();
        student19.fullName = "Amangaldieva Ainazik";
        student19.age = 19;
        student19.gender = "gurl";
        student19.id = 19;
        student19.group = "Java 8";







        while (true){

            System.out.println("________________________________________________________________________");
            System.out.println("ID: 1.2.3.4.5.6.7.8.9.10.11.12.13.14.15.16.17.18.19.20");
            System.out.println("Write a ID: ");
            int id= scanner.nextInt();
            switch (id){
                case 1:
                    student.getInfo();
                    break;
                case 2:
                    student1.getInfo();
                    break;
                case 3:
                    student2.getInfo();
                    break;
                case 4:
                    student3.getInfo();
                    break;
                case 5:
                    student4.getInfo();
                    break;
                case 6:
                    student5.getInfo();
                    break;
                case 7:
                    student6.getInfo();
                    break;
                case  8:
                    student7.getInfo();
                    break;
                case 9:
                    student8.getInfo();
                    break;
                case 10:
                    student9.getInfo();
                    break;
                case 11:
                    student10.getInfo();
                    break;
                case 12:
                    student11.getInfo();
                    break;
                case 13:
                    student12.getInfo();
                    break;
                case  14:
                    student13.getInfo();
                    break;
                case 15:
                    student14.getInfo();
                    break;
                case 16:
                    student15.getInfo();
                    break;
                case 17:
                    student16.getInfo();
                    break;
                case 18:
                    student17.getInfo();
                    break;
                case 19:
                    student18.getInfo();
                    break;
                case 20:
                    student19.getInfo();
                    break;
                default:
                    System.out.println("Such is no ID!");
            }
        }























    }
}
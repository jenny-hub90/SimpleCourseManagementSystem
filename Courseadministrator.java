    package Coursemanagementsystem;

    import java.io.*;
    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.Scanner;
    public class Courseadministrator {

        public Courseadministrator() throws IOException { //Constructor for taking name, last name, email and phone

            String Firstname;
            String Lastname;
            String Email;
            int Phone;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name:");
            Firstname = input.nextLine();

            System.out.println("Enter your lastname");
            Lastname = input.nextLine();

            System.out.println("Enter your Email");
            Email = input.nextLine();

//            System.out.println("Enter your Phone");
//            Phone = input.nextInt();

            System.out.println(Firstname+ " " + Lastname + " "  + Email);

            //calling method

            insert();
            Module();
            instructor();
            changecoursename();
            changemodulename();
            Reportcard();
            ViewStudentmarksobtain();

            System.out.println(Firstname+ " " + Lastname + " "  + Email );
            //creating a file called courseadministrator.txt to store name of the student and their enrolled faculty

            BufferedWriter writer = new BufferedWriter(new FileWriter("Courseadministrator.txt"));
            writer.write("\n"+Firstname+" " + Lastname+"\n");
            writer.write("StudentID:"+Email+"\n");
//            writer.write("Faculty:"+Phone+"\n");

            writer.close();

        }

        //method to add faculty using collection of data i.e. array list
        // method to add and remove Faculty
        public void insert() {


            ArrayList<String> Faculty=new ArrayList<String>(); //Creating arraylist
            Faculty.add("BIT");//Adding object in arraylist
            Faculty.add("BCA");
            Faculty.add("BBA");
            //Printing the arraylist object
            System.out.println(Faculty);
            Faculty.remove("BCA");
            System.out.println(Faculty);
        }

        //method to add and remove module using arraylist
        public void Module(){
            ArrayList<String> module=new ArrayList<String>(); //Creating arraylist
            module.add("Java");//Adding object in arraylist
            module.add("C++");
            module.add("Python");
            //Printing the arraylist object
            System.out.println(module);
            module.remove("Java");
            System.out.println(module);

    }

        //method to add and remove instructor using arraylist
        public void instructor(){
            ArrayList<String> instructor=new ArrayList<String>(); //Creating arraylist
            instructor.add("Prasanna Madhuri");//Adding object in arraylist
            instructor.add("Nithya Dev");
            instructor.add("Shyam Shivani");
            instructor.add("Pauline Talbot");
            instructor.add("Mason Quinn");
            instructor.add("Pallav Sandip");
            instructor.add("Caoimhe Cherry");
            instructor.add("Madhav Prakash");


            //Printing the arraylist object
            System.out.println(instructor);
            instructor.remove("Java");
            System.out.println(instructor);

        }


    //method to change coursename using arraylist and set method to change coursename
        public void changecoursename() {

        ArrayList<String> list = new ArrayList<String>();
        list.add("BIM");
        list.add("BCA");
        list.add("BBA");
        list.add("BIT");
        list.set(1, "BSC");
        for (int i = 0; i < list.size(); i++) {

            {
                System.out.println(list.get(i));
            }
        }
    }

        //method to change modulename using arraylist and set method to change modulename
        public void changemodulename() {

            ArrayList<String> list = new ArrayList<String>();
            list.add("Java");
            list.add("Python");
            list.add("C++");
            list.add("Big Data");
            list.set(1, "App Development");
            for (int i = 0; i < list.size(); i++) {

                {
                    System.out.println(list.get(i));
                }
            }
        }

        //method to make reportcard using user input scanner and storing it input file name Reportcard.txt
        public void Reportcard() throws IOException {

            BufferedWriter writer = new BufferedWriter(new FileWriter("Reportcard.txt",true));
            String Studentname;

            int Java, Python, Cplusplus, BigData, Total;
                double Percentage;
                Scanner sc = new Scanner(System.in);
            System.out.println("Enter the full name of Student");
            Studentname= sc.nextLine();
                System.out.println("Enter the marks of 4 Subjects");
                Java = sc.nextInt();
                Python = sc.nextInt();
                Cplusplus = sc.nextInt();
                BigData=  sc.nextInt();
                Total = Java+ Python+ Cplusplus + BigData;
                Percentage = Total / 4;
            System.out.println("Enter the Remark:");
                    System.out.println(Studentname + " "+Total+" "+ Percentage);
                    writer.write("\n"+Studentname+"\n");
                    writer.write("Marks obtained in"+" "+"Java"+":"+Java+"\n");
                    writer.write("Marks obtained in"+" "+"Python"+":"+Python+"\n");
                    writer.write("Marks obtained in"+" "+"Cplusplus"+":"+Cplusplus+"\n");
                    writer.write("Marks obtained in"+" "+"BigData"+":"+BigData+"\n");
                    writer.write("Total marks obtained"+" "+Total+"\n");
                    writer.write("Total percentage obtained"+" "+Percentage+"\n");

                    writer.close();

        }

                //method to cancel course
                public void cancelcourse (){

                    HashSet <String> Cancel = new HashSet<String> ();
                    Cancel.add("BIM");
                    Cancel.add("MBA");
                    Cancel.add("BSC");
                    System.out.println("Sorry this courses are not available at the moment:\n"+Cancel );


                    HashSet <String> Available = new HashSet<String> ();
                    Available.add("BIT");
                    Available.add("BBA");
                    System.out.println("Courses available are:\n"+Available);

                };

        //reading file marks.txt to view the student marks obtain

        public void ViewStudentmarksobtain() throws IOException {

            File file = new File("Marks.txt");
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
        }

        //main method
                public static void main (String[]args) throws IOException{

                    //creating object of main classcouseadministrator
                    Courseadministrator a = new Courseadministrator();
                    a.cancelcourse();
        }
        }



        package Coursemanagementsystem;

        import java.io.*;
        import java.util.Scanner;
        public class Instructor {


            public Instructor() throws IOException {
                //method call

                InstructorInformation();
                MarksObtain();

            }

            public void InstructorInformation()throws IOException

        {
                //Declaration of variables
                int Id;
                String Firstname;
                String Lastname;
                int Level;

                Scanner input = new Scanner(System.in);
                System.out.println("Enter your Firstname:");
                Firstname = input.nextLine();

                System.out.println("Enter your Lastname");
                Lastname = input.nextLine();

                System.out.println("Enter your Id");
                Id = input.nextInt();

                System.out.println("Enter your Level");
                Level = input.nextInt();

                System.out.println(Firstname + " " + Lastname + " " + Id + " " + Level);

               //creating a file named Instructor.txt to store information about instructor

            System.out.println(Firstname+ " " + Lastname + " "  + Id + " " + Level);
            BufferedWriter writer = new BufferedWriter(new FileWriter("Instructor.txt",true));
            writer.write("\n"+Firstname+" " + Lastname+"\n");
            writer.write("ID:"+Id+"\n");
            writer.write("Level:"+Level+"\n");

            writer.close();

            }

            //method to store student name and marks obtained in four different module and storing it into filename Marks.txt
            public void MarksObtain()throws IOException



            {

                BufferedWriter writer = new BufferedWriter(new FileWriter("Marks.txt",true));
                Scanner Studentname = new Scanner(System.in);
                System.out.println("Enter the Name of the Student");
                String Student = Studentname.nextLine();
                Scanner one = new Scanner(System.in);
                System.out.println("Enter marks in Java:");
                int a = one.nextInt();
                Scanner two = new Scanner(System.in);
                System.out.println("Enter marks in Python:");
                int b = two.nextInt();
                Scanner three = new Scanner(System.in);
                System.out.println("Enter marks in Cplusplus:");
                int c = three.nextInt();
                Scanner four = new Scanner(System.in);
                System.out.println("Enter marks in Big Data:");
                int d = two.nextInt();
                writer.write("Marks obtained by:"+Student+"\n");

                writer.write("Java:"+a+"\n");
                writer.write("Python:" +b+ "\n");
                writer.write("C++:"+c+ "\n");
                writer.write("Big Data:" +d+ "\n");
                writer.close();
            }


      public static void main(String[] args) throws IOException{
          // Main Method
        //Creating object of the main class Instructor
          Instructor Ins= new Instructor();
            }
            }



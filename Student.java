    package Coursemanagementsystem;

    import java.io.*;
    import java.util.Scanner;
    public class Student {

        //Declaration of variable
        private String Faculty;
        public Student() throws IOException {
            //Method call
                StudentInformation();
                viewInstructor();
                OptCourse();
        }

        //Constructor to store the student firstname, lastname, level and id
        public void StudentInformation () throws IOException
            {
                int Id;
                String Firstname;
                String Lastname;
                int Level;

                Scanner input = new Scanner(System.in);
                System.out.println("Enter your Firstname:");
                Firstname = input.nextLine();

                System.out.println("Enter your Lastname");
                Lastname = input.nextLine();

                System.out.println("Enter your Faculty");
                Faculty = input.nextLine();

                System.out.println("Enter your Id");
                Id = input.nextInt();

                System.out.println("Enter your Level");
                Level = input.nextInt();

                //creating a file named Student.txt to store information about the student

                System.out.println(Firstname+ " " + Lastname + " "  + Faculty + " "+ Id +" "+ Level);
                BufferedWriter writer = new BufferedWriter(new FileWriter("Student.txt",true));
                writer.write("\n"+Firstname+" " + Lastname+"\n");
                writer.write("StudentID:"+Id+"\n");
                writer.write("Faculty:"+Faculty+"\n");
                writer.write("StudentLevel:"+Level+"\n");
                writer.close();
            }

                //Method to choose optional course when in level 6 gives you the option to select between two course or else mandatory
                public void OptCourse(){
                int stdLevel ;
                Scanner optional= new Scanner (System.in);
                    System.out.println("Enter the level of student");
                    stdLevel = optional.nextInt();
                    if (stdLevel==6){
                        System.out.println("You have to choose between two optional course; They are:\n1.Cloud Computing \n2.DBA ");
                        Scanner optsubject = new Scanner (System.in);
                        System.out.println("Enter you have choosed:");
                        int std= optsubject.nextInt();
                    } else {
                        System.out.println("Every courses are mandatory");
                    }
                }

    // Reading file to display information of Instructor

                public void viewInstructor() throws IOException {

                File file = new File("Instructor.txt");
                FileReader read = new FileReader(file);
                BufferedReader br = new BufferedReader(read);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);

                }
            }


        public static void main(String[] args) throws IOException {
            // Main Method
            //Creating object of the main class Student

            Student Std= new Student();
        }

        }







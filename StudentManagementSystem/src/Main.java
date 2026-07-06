import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("   STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("====================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    Student student = new Student(id, name, age, course, email);

                    dao.addStudent(student);
                    break;

                case 2:

                    dao.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    dao.searchStudent(searchId);
                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String updateName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int updateAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String updateCourse = sc.nextLine();

                    System.out.print("Enter New Email: ");
                    String updateEmail = sc.nextLine();

                    Student updateStudent = new Student(
                            updateId,
                            updateName,
                            updateAge,
                            updateCourse,
                            updateEmail
                    );

                    dao.updateStudent(updateStudent);
                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);
                    break;

                case 6:

                    System.out.println("\n====================================");
                    System.out.println(" Thank You for Using the System!");
                    System.out.println("====================================");
                    break;

                default:

                    System.out.println("❌ Invalid Choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

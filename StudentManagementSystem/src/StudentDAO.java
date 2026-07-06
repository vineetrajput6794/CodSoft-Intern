import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {

    Connection con = DBConnection.getConnection();

    // Add Student
    public void addStudent(Student student) {

        String sql = "INSERT INTO students(id, name, age, course, email) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getCourse());
            ps.setString(5, student.getEmail());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("\n✅ Student Added Successfully.");
            }

        } catch (SQLException e) {
            System.out.println("❌ Error Adding Student.");
            e.printStackTrace();
        }
    }

    // View All Students
    public void viewStudents() {

        String sql = "SELECT * FROM students";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n========= STUDENT LIST =========");

            while (rs.next()) {

                System.out.println("----------------------------");
                System.out.println("ID      : " + rs.getInt("id"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Age     : " + rs.getInt("age"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("Email   : " + rs.getString("email"));
            }

            System.out.println("----------------------------");

        } catch (SQLException e) {
            System.out.println("❌ Error Fetching Students.");
            e.printStackTrace();
        }
    }

    // Search Student
    public void searchStudent(int id) {

        String sql = "SELECT * FROM students WHERE id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\n===== Student Found =====");
                System.out.println("ID      : " + rs.getInt("id"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("Age     : " + rs.getInt("age"));
                System.out.println("Course  : " + rs.getString("course"));
                System.out.println("Email   : " + rs.getString("email"));

            } else {
                System.out.println("❌ Student Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update Student
    public void updateStudent(Student student) {

        String sql = "UPDATE students SET name=?, age=?, course=?, email=? WHERE id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getCourse());
            ps.setString(4, student.getEmail());
            ps.setInt(5, student.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Student Updated Successfully.");
            } else {
                System.out.println("❌ Student ID Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete Student
    public void deleteStudent(int id) {

        String sql = "DELETE FROM students WHERE id=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("✅ Student Deleted Successfully.");
            } else {
                System.out.println("❌ Student ID Not Found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
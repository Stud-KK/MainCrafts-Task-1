import model.Student;

import java.io.*;
import java.util.*;

public class fileManager {

    private static final String FILE_NAME = "students.txt";

    // Save student to file
    public static void saveStudent(Student student) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(student.toFileString() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving student data.");
        }
    }

    // Load students from file
    public static List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return students;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                students.add(Student.fromFileString(line));
            }
        } catch (IOException e) {
            System.out.println("Error reading student data.");
        }

        return students;
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Course {
    private HashMap<Integer, String> courseDetails = new HashMap<>();
    private HashMap<Integer, String> courseTeachers = new HashMap<>();
    private HashMap<Integer, String> courseDescriptions = new HashMap<>();
    private HashMap<Integer, Integer> courseMarks = new HashMap<>();
    private HashMap<Integer, Character> courseGrades = new HashMap<>();
    private LinkedHashMap<Integer, Integer> topRanks = new LinkedHashMap<>();

    
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    

    public Course() {
        
        courseDetails.put(101, "Mathematics");
        courseDetails.put(102, "Physics");
        courseDetails.put(103, "Chemistry");

        courseTeachers.put(101, "Ms. Nirmala Devi M");
        courseTeachers.put(102, "Mr. Suresh P");
        courseTeachers.put(103, "Mr. Madhurai Veeran S");

        courseDescriptions.put(101, "An advanced course in Mathematics covering algebra, calculus, and geometry.");
        courseDescriptions.put(102, "A comprehensive course in Physics including mechanics, thermodynamics.");
        courseDescriptions.put(103, "Detailed study of Chemistry including organic, inorganic, and physical chemistry.");
    }

    public void printCourseDetails() {
        System.out.printf("%-10s %-30s\n", "Course ID", "Course Name");
        System.out.println("-------------------------------------------");
        
        for (Map.Entry<Integer, String> entry : courseDetails.entrySet()) 
        {
            System.out.printf("%-10d %-30s\n", entry.getKey(), entry.getValue());
        }
    }

    public void printCourseTeachers() {
        System.out.printf("%-10s %-30s %-30s\n", "Course ID", "Course Name", "Teacher");
        System.out.println("---------------------------------------------------------------");
        
        for (Map.Entry<Integer, String> entry : courseTeachers.entrySet()) 
        {
            System.out.printf("%-10d %-30s %-30s\n", entry.getKey(), courseDetails.get(entry.getKey()), entry.getValue());
        }
    }

    public void printCourseDescriptions() {
        System.out.printf("%-10s %-30s %-50s\n", "Course ID", "Course Name", "Description");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        
        for (Map.Entry<Integer, String> entry : courseDescriptions.entrySet())
        {
            System.out.printf("%-10d %-30s %-50s\n", entry.getKey(), courseDetails.get(entry.getKey()), entry.getValue());
        }
    }

    public void inputMarks(Scanner scanner)
    {
        System.out.println("Enter student ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter marks for student ID " + studentId + ":");
        int marks = scanner.nextInt();
        scanner.nextLine(); 

        courseMarks.put(studentId, marks);
        calculateGrade(studentId, marks);
    }

    private void calculateGrade(int studentId, int marks)
    {
        char grade;
        if (marks >= 90) 
        {
            grade = 'A';
        }
        else if (marks >= 80) 
        {
            grade = 'B';
        } 
        else if (marks >= 70) 
        {
            grade = 'C';
            
        } 
        else if (marks >= 60)
        {
            grade = 'D';
        } 
        else 
        {
            grade = 'F';
        }
        courseGrades.put(studentId, grade);
    }

    private String getGradeColor(char grade) 
    {
        switch (grade) {
            case 'A':
                return ANSI_GREEN;
            case 'B':
                return ANSI_BLUE;
            case 'C':
                return ANSI_YELLOW;
            case 'D':
                return ANSI_PURPLE;
            case 'F':
                return ANSI_RED;
            default:
                return ANSI_RESET;
        }
    }

    public void printCourseMarksAndGrades() 
    {
        System.out.printf("%-10s %-10s %-10s\n", "Student ID", "Marks", "Grade");
        System.out.println("---------------------------------");
        for (Map.Entry<Integer, Integer> entry : courseMarks.entrySet()) 
        {
            int studentId = entry.getKey();
            int marks = entry.getValue();
            char grade = courseGrades.get(studentId);
            String color = getGradeColor(grade);
            System.out.printf("%-10d %-10d %s%-10c%s\n", studentId, marks, color, grade, ANSI_RESET);
        }
    }

    public void determineTopRanks() {
        List<Map.Entry<Integer, Integer>> sortedStudents = new ArrayList<>(courseMarks.entrySet());

        
        for (int i = 0; i < sortedStudents.size() - 1; i++) 
        {
            for (int j = 0; j < sortedStudents.size() - i - 1; j++) 
            {
                if (sortedStudents.get(j).getValue() < sortedStudents.get(j + 1).getValue()) {
                    
                    Map.Entry<Integer, Integer> temp = sortedStudents.get(j);
                    sortedStudents.set(j, sortedStudents.get(j + 1));
                    sortedStudents.set(j + 1, temp);
                }
            }
        }

        topRanks.clear();
        int rank = 1;
        for (Map.Entry<Integer, Integer> entry : sortedStudents) {
            if (rank > 3) break;
            topRanks.put(rank, entry.getKey());
            rank++;
        }
    }


    public void printTopRanks() {
        determineTopRanks();
        System.out.printf("%-10s %-10s\n", "Rank", "Student ID");
        System.out.println("--------------------");
        for (Map.Entry<Integer, Integer> entry : topRanks.entrySet()) {
            System.out.printf("%-10d %-10d\n", entry.getKey(), entry.getValue());
        }
    }
}
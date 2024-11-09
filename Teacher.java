import java.util.HashMap;
import java.util.Map;

public class Teacher {
    
    private HashMap<Integer, String> teacherdetails = new HashMap<>();
    private HashMap<String, String> qualification = new HashMap<>();
    private HashMap<String, String> subject = new HashMap<>();
    private Attendance attendance;

    public Teacher(Student student) {
        
        teacherdetails.put(1567, "Nirmala Devi M");
        teacherdetails.put(1678, "Suresh P");
        teacherdetails.put(1983, "Madhurai Veeran S");  
        teacherdetails.put(1657, "Sumathi V");
        teacherdetails.put(1356, "Vikram R");
        teacherdetails.put(8753, "Parvathi A");
        teacherdetails.put(4578, "Ambika K");
        teacherdetails.put(9876, "Sathya N");
        teacherdetails.put(3456, "Harish M");
        teacherdetails.put(9235, "Vinoth B");
        teacherdetails.put(2154, "Meena S");
        teacherdetails.put(7634, "Anu Radha R");
        
        qualification.put("Nirmala Devi M", "Ph.D in Mathematics");
        qualification.put("Suresh P", "M.Sc in Physics");
        qualification.put("Madhurai Veeran S", "Ph.D in Chemistry");
        qualification.put("Sumathi V", "M.A in English");
        qualification.put("Vikram R", "M.E in Computer Science");
        qualification.put("Parvathi A", "M.Sc in Biology");
        qualification.put("Ambika K", "M.Com");
        qualification.put("Sathya N", "Ph.D in Economics");
        qualification.put("Harish M", "M.P.Ed");
        qualification.put("Vinoth B", "M.C.A");
        qualification.put("Meena S", "M.B.A");
        qualification.put("Anu Radha R", "M.A in History");
        
        subject.put("Nirmala Devi M", "Tamil");
        subject.put("Suresh P", "Physics");
        subject.put("Madhurai Veeran S", "Mathematics");
        subject.put("Sumathi V", "Computer Science");
        subject.put("Vikram R", "Science");
        subject.put("Parvathi A", "History");
        subject.put("Ambika K", "Chemistry");
        subject.put("Sathya N", "English");
        subject.put("Harish M", "Accounts");
        subject.put("Vinoth B", "Social Studies");
        subject.put("Meena S", "Commerce");
        subject.put("Anu Radha R", "Economics");

        attendance = new Attendance(student);
    }

    public void getTeacherIdAndName() 
    {
        System.out.printf("%-10s %-20s\n", "ID", "Name");
        System.out.println("-------------------------------");
        
        for (Map.Entry<Integer, String> entry : teacherdetails.entrySet()) 
        {
            System.out.printf("%-10d %-20s\n", entry.getKey(), entry.getValue());
        }
    }
    
    public int getTeacherCount() 
    {
        return teacherdetails.size();
    }

    public void getQualifications() 
    {
        System.out.printf("%-20s %-30s\n", "Name", "Qualification");
        System.out.println("------------------------------------------------");
        
        for (Map.Entry<String, String> entry : qualification.entrySet())
        {
            System.out.printf("%-20s %-30s\n", entry.getKey(), entry.getValue());
        }
    }

    public void getTeachingsub() 
    {
        System.out.printf("%-20s %-20s\n", "Name", "Subject");
        System.out.println("-------------------------------------------");
        
        for (Map.Entry<String, String> entry : subject.entrySet()) 
        {
            System.out.printf("%-20s %-20s\n", entry.getKey(), entry.getValue());
        }
    }

    public void markAttendanceForTenth(int id) 
    {
        attendance.markAttendanceForTenth(id);
    }

    public void markAttendanceForEleventh(int id)
    {
        attendance.markAttendanceForEleventh(id);
    }

    public void markAttendanceForTwelfth(int id)
    {
        attendance.markAttendanceForTwelfth(id);
    }

    public void printTenthAttendance()
    {
        attendance.printTenthAttendance();
    }

    public void printEleventhAttendance()
    {
        attendance.printEleventhAttendance();
    }

    public void printTwelfthAttendance()
    {
        attendance.printTwelfthAttendance();
    }
}
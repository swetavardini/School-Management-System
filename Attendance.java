import java.util.HashMap;
import java.util.Map;

public class Attendance {
	
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	private static final String ANSI_CYAN = "\u001B[36m";
	private static final String ANSI_RESET = "\u001B[0m";
    
    private HashMap<Integer, Integer> tenthAttendance = new HashMap<>();
    private HashMap<Integer, Integer> eleventhAttendance = new HashMap<>();
    private HashMap<Integer, Integer> twelfthAttendance = new HashMap<>();
    
    private Student student;

    public Attendance(Student student) 
    {
        this.student = student;
        getAttendance();
    }

    private void getAttendance() 
    {
        for (Integer id : student.getTenth().keySet()) 
        {
            tenthAttendance.put(id, 0);
        }
        for (Integer id : student.getEleventh().keySet()) 
        {
            eleventhAttendance.put(id, 0);
        }
        for (Integer id : student.getTwelfth().keySet())
        {
            twelfthAttendance.put(id, 0);
        }
    }

    public void markAttendanceForTenth(int id) 
    {
        if (tenthAttendance.containsKey(id)) 
        {
            tenthAttendance.put(id, tenthAttendance.get(id) + 1);
        } 
        else 
        {
            System.out.println("Student ID not found in 10th class.");
        }
    }

    public void markAttendanceForEleventh(int id)
    {
        if (eleventhAttendance.containsKey(id))
        {
            eleventhAttendance.put(id, eleventhAttendance.get(id) + 1);
        }
        else 
        {
            System.out.println("Student ID not found in 11th class.");
        }
    }

    public void markAttendanceForTwelfth(int id) 
    {
        if (twelfthAttendance.containsKey(id)) 
        {
            twelfthAttendance.put(id, twelfthAttendance.get(id) + 1);
        }
        else 
        {
            System.out.println("Student ID not found in 12th class.");
        }
    }

    public void printTenthAttendance() 
    {
        System.out.printf(ANSI_CYAN+"%-10s %-2s %-22s %-5s\n", "ID", " ", "Name", "Attendance"+ANSI_RESET );
        System.out.println("---------------------------------------------");
        
        for (Map.Entry<Integer, Integer> entry : tenthAttendance.entrySet()) 
        {
            
            String color = (entry.getValue() == 1) ? GREEN : RED;
            
            System.out.printf("%-10d %-2s %-20s %s%-10d%s\n", entry.getKey(), "-",student.getTenth().get(entry.getKey()), color, entry.getValue(), RESET);
                              
        }
    }

    public void printEleventhAttendance() 
    {
    	System.out.printf(ANSI_CYAN+"%-10s %-2s %-22s %-5s\n", "ID", " ", "Name", "Attendance"+ANSI_RESET );
        System.out.println("---------------------------------------------");
        
        for (Map.Entry<Integer, Integer> entry : eleventhAttendance.entrySet()) 
        {
            
            String color = (entry.getValue() == 1) ? GREEN : RED;
            
            System.out.printf("%-10d %-2s %-20s %s%-10d%s\n", entry.getKey(), "-", student.getEleventh().get(entry.getKey()), color, entry.getValue(), RESET);
                              
                              
        }
    }

    public void printTwelfthAttendance()
    {
    	System.out.printf(ANSI_CYAN+"%-10s %-2s %-22s %-5s\n", "ID", " ", "Name", "Attendance"+ANSI_RESET );
        System.out.println("---------------------------------------------");
        
        for (Map.Entry<Integer, Integer> entry : twelfthAttendance.entrySet()) 
        {
           
            String color = (entry.getValue() == 1) ? GREEN : RED;
            System.out.printf("%-10d %-2s %-20s %s%-10d%s\n",  entry.getKey(), "-",  student.getTwelfth().get(entry.getKey()), color, entry.getValue(), RESET);
                              
        }
    }

}

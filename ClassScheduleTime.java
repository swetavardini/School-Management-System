import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassScheduleTime {

   
    public static void showScheduleMenu(Scanner inp) {
        boolean scheduleMenu = true;
        while (scheduleMenu) {
            System.out.println("");
            System.out.println("Class Schedule");
            System.out.println("1. View Weekly Schedule");
            System.out.println("2. View Schedule for Specific Day");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int scheduleOption = inp.nextInt();
            inp.nextLine();

            switch (scheduleOption) {
                case 1:
                    printWeeklySchedule();
                    break;
                case 2:
                    System.out.print("Enter the day (e.g., Monday): ");
                    String day = inp.nextLine();
                    printScheduleForDay(day);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scheduleMenu = false;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }

    public static void printWeeklySchedule()
    {
        System.out.println("Weekly Schedule for Class 10:");
        printSchedule(MondayScheduleten());
        printSchedule(TuesdayScheduleten());
        printSchedule(WednesdayScheduleten());
        printSchedule(ThursdayScheduleten());
        printSchedule(FridayScheduleten());

        System.out.println("\nWeekly Schedule for Class 11:");
        printSchedule(MondayScheduleeleven());
        printSchedule(TuesdayScheduleeleven());
        printSchedule(WednesdayScheduleeleven());
        printSchedule(ThursdayScheduleeleven());
        printSchedule(FridayScheduleeleven());

        System.out.println("\nWeekly Schedule for Class 12:");
        printSchedule(MondayScheduletwelve());
        printSchedule(TuesdayScheduletwelve());
        printSchedule(WednesdayScheduletwelve());
        printSchedule(ThursdayScheduletwelve());
        printSchedule(FridayScheduletwelve());
    }

    public static void printScheduleForDay(String day) {
        switch (day.toLowerCase())
        {
            case "monday":
                System.out.println("Monday's Schedule:");
                printSchedule(MondayScheduleten());
                printSchedule(MondayScheduleeleven());
                printSchedule(MondayScheduletwelve());
                break;
            case "tuesday":
                System.out.println("Tuesday's Schedule:");
                printSchedule(TuesdayScheduleten());
                printSchedule(TuesdayScheduleeleven());
                printSchedule(TuesdayScheduletwelve());
                break;
            case "wednesday":
                System.out.println("Wednesday's Schedule:");
                printSchedule(WednesdayScheduleten());
                printSchedule(WednesdayScheduleeleven());
                printSchedule(WednesdayScheduletwelve());
                break;
            case "thursday":
                System.out.println("Thursday's Schedule:");
                printSchedule(ThursdayScheduleten());
                printSchedule(ThursdayScheduleeleven());
                printSchedule(ThursdayScheduletwelve());
                break;
            case "friday":
                System.out.println("Friday's Schedule:");
                printSchedule(FridayScheduleten());
                printSchedule(FridayScheduleeleven());
                printSchedule(FridayScheduletwelve());
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }
    }

    public static void printSchedule(LinkedHashMap<String, String> schedule) 
    {
        System.out.printf("%-40s %-30s\n", "Time Slot", "Subject & Teacher");
        System.out.println("----------------------------------------------------------------");
        for (Map.Entry<String, String> entry : schedule.entrySet()) {
            System.out.printf("%-40s %-30s\n", entry.getKey(), entry.getValue());
        }
    }

    private static LinkedHashMap<String, String> MondayScheduleten() 
    {
        LinkedHashMap<String, String> mon = new LinkedHashMap<>();
        mon.put("Period 1 |(9 AM - 9:45 AM)", "Science (Mrs.Sushma)");
        mon.put("Period 2 |(9:45 AM - 10:30 AM)", "Maths (Mrs.Niranjana)");
        mon.put("BREAK |", "(10:30 AM - 10:45 AM)");
        mon.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        mon.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        mon.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        mon.put("Period 5 |(1:15 PM - 2:00 PM)", "Science");
        return mon;
    }

    private static LinkedHashMap<String, String> TuesdayScheduleten() 
    {
        LinkedHashMap<String, String> tues = new LinkedHashMap<>();
        tues.put("Period 1 |(9 AM - 9:45 AM)", "Science (Mrs.Sushma)");
        tues.put("Period 2 |(9:45 AM - 10:30 AM)", "Maths (Mrs.Niranjana)");
        tues.put("BREAK |", "(10:30 AM - 10:45 AM)");
        tues.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        tues.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        tues.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        tues.put("Period 5 |(1:15 PM - 2:00 PM)", "Science");
        return tues;
    }

    private static LinkedHashMap<String, String> WednesdayScheduleten()
    {
        LinkedHashMap<String, String> wed = new LinkedHashMap<>();
        wed.put("Period 1 |(9 AM - 9:45 AM)", "Science (Mrs.Sushma)");
        wed.put("Period 2 |(9:45 AM - 10:30 AM)", "Maths (Mrs.Niranjana)");
        wed.put("BREAK |", "(10:30 AM - 10:45 AM)");
        wed.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        wed.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        wed.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        wed.put("Period 5 |(1:15 PM - 2:00 PM)", "Science");
        return wed;
    }

    private static LinkedHashMap<String, String> ThursdayScheduleten()
    {
        LinkedHashMap<String, String> thurs = new LinkedHashMap<>();
        thurs.put("Period 1 |(9 AM - 9:45 AM)", "Science (Mrs.Sushma)");
        thurs.put("Period 2 |(9:45 AM - 10:30 AM)", "Maths (Mrs.Niranjana)");
        thurs.put("BREAK |", "(10:30 AM - 10:45 AM)");
        thurs.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        thurs.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        thurs.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        thurs.put("Period 5 |(1:15 PM - 2:00 PM)", "Science");
        return thurs;
    }

    private static LinkedHashMap<String, String> FridayScheduleten()
    {
        LinkedHashMap<String, String> fri = new LinkedHashMap<>();
        fri.put("Period 1 |(9 AM - 9:45 AM)", "Science (Mrs.Sushma)");
        fri.put("Period 2 |(9:45 AM - 10:30 AM)", "Maths (Mrs.Niranjana)");
        fri.put("BREAK |", "(10:30 AM - 10:45 AM)");
        fri.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        fri.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        fri.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        fri.put("Period 5 |(1:15 PM - 2:00 PM)", "Science");
        return fri;
    }

    private static LinkedHashMap<String, String> MondayScheduleeleven() {
        LinkedHashMap<String, String> mon = new LinkedHashMap<>();
        mon.put("Period 1 |(9 AM - 9:45 AM)", "Physics (Mr. Anand)");
        mon.put("Period 2 |(9:45 AM - 10:30 AM)", "Chemistry (Mrs. Latha)");
        mon.put("BREAK |", "(10:30 AM - 10:45 AM)");
        mon.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        mon.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        mon.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        mon.put("Period 5 |(1:15 PM - 2:00 PM)", "Mathematics");
        return mon;
    }

    private static LinkedHashMap<String, String> TuesdayScheduleeleven() {
        LinkedHashMap<String, String> tues = new LinkedHashMap<>();
        tues.put("Period 1 |(9 AM - 9:45 AM)", "Physics (Mr. Anand)");
        tues.put("Period 2 |(9:45 AM - 10:30 AM)", "Chemistry (Mrs. Latha)");
        tues.put("BREAK |", "(10:30 AM - 10:45 AM)");
        tues.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        tues.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        tues.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        tues.put("Period 5 |(1:15 PM - 2:00 PM)", "Mathematics");
        return tues;
    }

    private static LinkedHashMap<String, String> WednesdayScheduleeleven() {
        LinkedHashMap<String, String> wed = new LinkedHashMap<>();
        wed.put("Period 1 |(9 AM - 9:45 AM)", "Physics (Mr. Anand)");
        wed.put("Period 2 |(9:45 AM - 10:30 AM)", "Chemistry (Mrs. Latha)");
        wed.put("BREAK |", "(10:30 AM - 10:45 AM)");
        wed.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        wed.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        wed.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        wed.put("Period 5 |(1:15 PM - 2:00 PM)", "Mathematics");
        return wed;
    }

    private static LinkedHashMap<String, String> ThursdayScheduleeleven() {
        LinkedHashMap<String, String> thurs = new LinkedHashMap<>();
        thurs.put("Period 1 |(9 AM - 9:45 AM)", "Physics (Mr. Anand)");
        thurs.put("Period 2 |(9:45 AM - 10:30 AM)", "Chemistry (Mrs. Latha)");
        thurs.put("BREAK |", "(10:30 AM - 10:45 AM)");
        thurs.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        thurs.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        thurs.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        thurs.put("Period 5 |(1:15 PM - 2:00 PM)", "Mathematics");
        return thurs;
    }

    private static LinkedHashMap<String, String> FridayScheduleeleven() {
        LinkedHashMap<String, String> fri = new LinkedHashMap<>();
        fri.put("Period 1 |(9 AM - 9:45 AM)", "Physics (Mr. Anand)");
        fri.put("Period 2 |(9:45 AM - 10:30 AM)", "Chemistry (Mrs. Latha)");
        fri.put("BREAK |", "(10:30 AM - 10:45 AM)");
        fri.put("Period 3 |(10:45 AM - 11:30 AM)", "Tamil");
        fri.put("Period 4 |(11:30 AM - 12:15 PM)", "English");
        fri.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        fri.put("Period 5 |(1:15 PM - 2:00 PM)", "Mathematics");
        return fri;
    }

    private static LinkedHashMap<String, String> MondayScheduletwelve() {
        LinkedHashMap<String, String> mon = new LinkedHashMap<>();
        mon.put("Period 1 |(9 AM - 9:45 AM)", "Biology (Mrs. Priya)");
        mon.put("Period 2 |(9:45 AM - 10:30 AM)", "Physics (Mr. Anand)");
        mon.put("BREAK |", "(10:30 AM - 10:45 AM)");
        mon.put("Period 3 |(10:45 AM - 11:30 AM)", "English");
        mon.put("Period 4 |(11:30 AM - 12:15 PM)", "Mathematics");
        mon.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        mon.put("Period 5 |(1:15 PM - 2:00 PM)", "Chemistry");
        return mon;
    }

    private static LinkedHashMap<String, String> TuesdayScheduletwelve() {
        LinkedHashMap<String, String> tues = new LinkedHashMap<>();
        tues.put("Period 1 |(9 AM - 9:45 AM)", "Biology (Mrs. Priya)");
        tues.put("Period 2 |(9:45 AM - 10:30 AM)", "Physics (Mr. Anand)");
        tues.put("BREAK |", "(10:30 AM - 10:45 AM)");
        tues.put("Period 3 |(10:45 AM - 11:30 AM)", "English");
        tues.put("Period 4 |(11:30 AM - 12:15 PM)", "Mathematics");
        tues.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        tues.put("Period 5 |(1:15 PM - 2:00 PM)", "Chemistry");
        return tues;
    }

    private static LinkedHashMap<String, String> WednesdayScheduletwelve() {
        LinkedHashMap<String, String> wed = new LinkedHashMap<>();
        wed.put("Period 1 |(9 AM - 9:45 AM)", "Biology (Mrs. Priya)");
        wed.put("Period 2 |(9:45 AM - 10:30 AM)", "Physics (Mr. Anand)");
        wed.put("BREAK |", "(10:30 AM - 10:45 AM)");
        wed.put("Period 3 |(10:45 AM - 11:30 AM)", "English");
        wed.put("Period 4 |(11:30 AM - 12:15 PM)", "Mathematics");
        wed.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        wed.put("Period 5 |(1:15 PM - 2:00 PM)", "Chemistry");
        return wed;
    }

    private static LinkedHashMap<String, String> ThursdayScheduletwelve() 
    {
        LinkedHashMap<String, String> thurs = new LinkedHashMap<>();
        thurs.put("Period 1 |(9 AM - 9:45 AM)", "Biology (Mrs. Priya)");
        thurs.put("Period 2 |(9:45 AM - 10:30 AM)", "Physics (Mr. Anand)");
        thurs.put("BREAK |", "(10:30 AM - 10:45 AM)");
        thurs.put("Period 3 |(10:45 AM - 11:30 AM)", "English");
        thurs.put("Period 4 |(11:30 AM - 12:15 PM)", "Mathematics");
        thurs.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        thurs.put("Period 5 |(1:15 PM - 2:00 PM)", "Chemistry");
        return thurs;
    }

    private static LinkedHashMap<String, String> FridayScheduletwelve() 
    {
        LinkedHashMap<String, String> fri = new LinkedHashMap<>();
        fri.put("Period 1 |(9 AM - 9:45 AM)", "Biology (Mrs. Priya)");
        fri.put("Period 2 |(9:45 AM - 10:30 AM)", "Physics (Mr. Anand)");
        fri.put("BREAK |", "(10:30 AM - 10:45 AM)");
        fri.put("Period 3 |(10:45 AM - 11:30 AM)", "English");
        fri.put("Period 4 |(11:30 AM - 12:15 PM)", "Mathematics");
        fri.put("LUNCH BREAK |", "(12:15 PM - 1:15 PM)");
        fri.put("Period 5 |(1:15 PM - 2:00 PM)", "Chemistry");
        return fri;
    }
    }
import java.util.Scanner;

public class School {

    public static void main(String[] args) {

        boolean val = true;
        Scanner stu = new Scanner(System.in);
        Student obj1 = new Student();
        Teacher obj2 = new Teacher(obj1);
        Course courseObj = new Course();
        ClassScheduleTime scheduleObj = new ClassScheduleTime();

        while (val) {
            System.out.println("❤ Welcome to CodeCraft Academy ❤");
            System.out.println("----------------------------------");
            System.out.println("1. Students details");
            System.out.println("2. Teachers details");
            System.out.println("3. Course details");
            System.out.println("4. Class Schedule");
            System.out.println("5. Exit");
            System.out.println("Enter your Choice :");

            int option1 = stu.nextInt();
            stu.nextLine();

            if (option1 == 1) {
                boolean studentMenu = true;
                while (studentMenu) {
                    System.out.println("");
                    System.out.println("Students details");
                    System.out.println("*~*~**~");
                    System.out.println("1. New Admission");
                    System.out.println("2. View student ID & student name");
                    System.out.println("3. View Total Strength");
                    System.out.println("4. Total classes");
                    System.out.println("5. Exit");
                    System.out.println("Enter your choice:");

                    int stuval = stu.nextInt();
                    stu.nextLine();

                    switch (stuval) {
                        case 1:
                            System.out.println("");
                            System.out.println("Welcome to Admission Block");
                            System.out.println("---------------------------");
                            System.out.println("Select a class:");
                            System.out.println("----------------");
                            System.out.println("1. 10th standard");
                            System.out.println("2. 11th standard");
                            System.out.println("3. 12th standard");
                            
                            int selclass = stu.nextInt();
                            stu.nextLine();
                            
                            System.out.println("Enter student ID:");
                            int stuid = stu.nextInt();
                            stu.nextLine();
                            
                            System.out.println("Enter student Name:");
                            String stuname = stu.nextLine();

                            if (selclass == 1) {
                                
                                if (!obj1.getTenth().containsKey(stuid)) 
                                {
                                    obj1.addStudentToTenth(stuid, stuname);
                                    System.out.println("Admission process successfully finished ❤");
                                } 
                                else 
                                {
                                    System.out.println("Student ID already exists.");
                                }
                            } 
                            else if (selclass == 2)
                            {
                                if (!obj1.getEleventh().containsKey(stuid))
                                {
                                    obj1.addStudentToEleventh(stuid, stuname);
                                    System.out.println("Admission process successfully finished ❤");
                                }
                                else {
                                    System.out.println("Student ID already exists.");
                                }
                                
                            } 
                            else if (selclass == 3) 
                            {
                                if (!obj1.getTwelfth().containsKey(stuid))
                                {
                                    obj1.addStudentToTwelfth(stuid, stuname);
                                    System.out.println("Admission process successfully finished ❤");
                                } 
                                else {
                                    System.out.println("Student ID already exists.");
                                }
                            } 
                            else
                            {
                                System.out.println("Invalid class selection.");
                            }
                            break;

                        case 2:
                            System.out.println("");
                            System.out.println("Student details");
                            System.out.println("---------------");
                            System.out.println("Kindly select a class:");
                            System.out.println("1. 10th class");
                            System.out.println("2. 11th class");
                            System.out.println("3. 12th class");
                            System.out.println("Enter your choice:");
                            int stuval1 = stu.nextInt();
                            
                            if (stuval1 == 1) {
                                System.out.println("");
                                obj1.printTenthDetails();
                            } else if (stuval1 == 2) {
                                System.out.println("");
                                obj1.printEleventhDetails();
                            } else if (stuval1 == 3) {
                                System.out.println("");
                                obj1.printTwelfthDetails();
                            } else {
                                System.out.println("Invalid option");
                            }
                            break;

                        case 3:
                            System.out.println("");
                            System.out.println("Total strength of 10th Standard: " + obj1.getTenthtot());
                            System.out.println("Total strength of 11th Standard: " + obj1.getEleventhtot());
                            System.out.println("Total strength of 12th Standard: " + obj1.getTwelfthtot());
                            break;

                        case 4:
                            System.out.println("");
                            System.out.println("Totally three classes ");
                            System.out.println("----------------------");
                            System.out.println("1) 10th class");
                            System.out.println("2) 11th class");
                            System.out.println("3) 12th class");
                            break;

                        case 5:
                            System.out.println("Exiting..🗝");
                            System.out.println("");
                            studentMenu = false;
                            break;

                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                }
            }
            else if (option1 == 2)
            { 
                boolean teacherval=true;
                
                while(teacherval) {
                System.out.println("");   
                System.out.println("Teachers details");
                System.out.println("*~*~**~");
                System.out.println("1. View Teachers ID & Name");
                System.out.println("2. Total Strength of Staff count");
                System.out.println("3. Qualifications");
                System.out.println("4. Taken subjects");
                System.out.println("5. Mark attendance");
                System.out.println("6. View attendance");
                System.out.println("7. Exit");
                System.out.println("Enter your choice:");
                int tea = stu.nextInt();
                stu.nextLine();
                
                switch(tea) {
                
                case 1:
                    System.out.println("");
                    System.out.println("Teacher ID and Name");
                    System.out.println("--------------------");
                    obj2.getTeacherIdAndName();
                    break;
                
                case 2:
                    System.out.println("");
                    System.out.println("Total");
                    System.out.println("------");
                    System.out.println("Total staff count is: " + obj2.getTeacherCount());
                    break;
                
                case 3:
                    System.out.println("");
                    System.out.println("Qualifications");
                    System.out.println("---------------");
                    obj2.getQualifications();
                    break;
                    
                case 4:
                	System.out.println("");
                	System.out.println("Teaching Subject");  
                	System.out.println("-----------------");
                	obj2.getTeachingsub();
                    break;
                    
                case 5:
                	System.out.println("");
                	System.out.println("Select class to mark attendance:");
                	System.out.println("--------------------------------");
                    System.out.println("1. 10th class (ID 111 to 130)");
                    System.out.println("2. 11th class (ID 211 to 230)");
                    System.out.println("3. 12th class (ID 311 to 330)");
                    System.out.println("Enter option :");
                    int attendanceClass = stu.nextInt();
                    System.out.println("Enter student ID to mark attendance:");
                    int attendanceId = stu.nextInt();
                    stu.nextLine();
                    
                    if (attendanceClass == 1)
                    {
                        obj2.markAttendanceForTenth(attendanceId);
                        
                        System.out.println("'"+attendanceId+"'"+" Attendance marked");
                    }
                    else if (attendanceClass == 2)
                    {
                        obj2.markAttendanceForEleventh(attendanceId);
                        
                        System.out.println("'"+attendanceId+"'"+" Attendance marked");
                    } 
                    else if (attendanceClass == 3)
                    {
                        obj2.markAttendanceForTwelfth(attendanceId);
                        
                        System.out.println("'"+attendanceId+"'"+" Attendance marked");
                    } 
                    else 
                    {
                        System.out.println("Invalid class selection.");
                    }
                    break;
                    
                case 6:
                	System.out.println("");
                	System.out.println("Select class to view attendance:");
                	System.out.println("--------------------------------");
                    System.out.println("1. 10th class");
                    System.out.println("2. 11th class");
                    System.out.println("3. 12th class");
                    int viewAttendanceClass = stu.nextInt();
                    
                    if (viewAttendanceClass == 1) 
                    {
                    	System.out.println("10th class Attendance Register");
                    	System.out.println("--------------------------------");
                        obj2.printTenthAttendance();
                    } 
                    else if (viewAttendanceClass == 2) 
                    {
                    	System.out.println("11th class Attendance Register");
                    	System.out.println("--------------------------------");
                        obj2.printEleventhAttendance();
                    } 
                    else if (viewAttendanceClass == 3)
                    {
                    	System.out.println("12th class Attendance Register");
                    	System.out.println("--------------------------------");
                        obj2.printTwelfthAttendance();
                    } else {
                        System.out.println("Invalid class selection.");
                    }
                    break;


                case 7:
                    System.out.println("Exiting..🗝");
                    System.out.println("");
                    teacherval = false;
                    break;
               

                default:
                    System.out.println("Invalid option");
                    break;
                }
            }
            
            } 
            else if (option1 == 3)
            {
            	boolean courseval=true;
            	
            	while(courseval)
            	{
            	System.out.println("");
                System.out.println("Course details");
                System.out.println("*~*~**");
                System.out.println("1. Course ID & Name");
                System.out.println("2. Course Specialized Teachers");
                System.out.println("3. Course Description");
                System.out.println("4. Enter a student mark");
                System.out.println("5. Marks & Grade");
                System.out.println("6. Top Ranks");
                System.out.println("7.  Exit");
                System.out.println("Enter your choice:");
                
                int cval=stu.nextInt();
                
                switch(cval) {
                
                case 1:
                	System.out.println("");
                	
                	courseObj.printCourseDetails();
                	break;
                case 2:
                	System.out.println("");
                	System.out.println("Course Specialized Teachers");
                	System.out.println("---------------------------");
                	courseObj.printCourseTeachers();
                	break;
                case 3:
                	System.out.println("");
                	System.out.println("Course Description");
                	System.out.println("-------------------");
                	courseObj.printCourseDescriptions();
                	break;
                case 4:
                	System.out.println("");
                	courseObj.inputMarks(stu);
                	
                	break;
                case 5:
                	
                	System.out.println("");
                	System.out.println("Marks & Grade");
                	System.out.println("--------------");
                	courseObj.printCourseMarksAndGrades();
                	break;
                	
                case 6:
                	System.out.println("");
                	System.out.println("Top Ranks");
                	System.out.println("---------");
                	courseObj.printTopRanks();
                	break;
                case 7:
                    System.out.println("Exiting....🗝");
                    System.out.println("");
                    courseval =false;
                    break;    	
                default:
                	System.out.println("Invalid option");
                	break;
                
                 }
            	}
            } 
            else if (option1 == 4)
            	
            {
            	 System.out.println("Enter access code:");
            	 String accessCode=stu.nextLine();
            	 if(accessCode.equals("12345")) {
            		 
            	 
            
            	 boolean scheduleMenu = true;
                 while (scheduleMenu) {
                     System.out.println("");
                     System.out.println("Class Schedule");
                     System.out.println("1. View Weekly Schedule");
                     System.out.println("2. View Schedule for Specific Day");
                     System.out.println("3. Exit");
                     System.out.print("Enter your choice: ");

                     int scheduleOption =stu.nextInt();
                     stu.nextLine();

                     switch (scheduleOption) {
                         case 1:
                        	 System.out.println("");
                             scheduleObj.printWeeklySchedule();
                             
                             break;
                         case 2:
                        	 System.out.println("");
                             System.out.print("Enter the day (e.g., Monday): ");
                             String day = stu.nextLine();
                             scheduleObj.printScheduleForDay(day);
                             break;
                         case 3:
                             scheduleMenu = false;
                             System.out.println("Exit....🗝");
                             System.out.println("");
                             break;
                         default:
                             System.out.println("Invalid option.");
                             break;
                     }
                 }
             
         }
            	 else {
            		 System.out.println("Invalid access code");
            		 }
            	 }
 
            else if (option1 == 5)
            {
            	System.out.println("");
                System.out.println("Exit");
                System.out.println("*~*~**");
                val = false;
            }
        }
        
        
        System.out.println("");
        System.out.println("\nFEEDBACK FORM");
        System.out.println("---------------");
        System.out.println("\nSelect any option:  ");
        System.out.println("1. Manual feedback");
        System.out.println("2. User Choice");
        int feed = stu.nextInt();
        stu.nextLine();
        
        
        if (feed == 1) 
        {   
        	System.out.println("");
        	System.out.println("Enter your feedback for the day: ");
        	String fe = stu.nextLine();
        	System.out.println("ThankYou for your feedback");
        	System.out.println("");
        }else if(feed==2) {

        	System.out.println("Select any option");
        	System.out.println("------------------");
        	System.out.println("1. Outstanding");
        	System.out.println("2. Good");
        	System.out.println("3. Average");
        	System.out.println("4. Poor");
        	int f = stu.nextInt();
        	stu.nextLine();
        	System.out.println("\nThankYou for your feedback");


    }
        else {
        	System.out.println("Invalid option");
        }
        stu.close();
      }
 }
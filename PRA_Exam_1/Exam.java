package PRA_Exam_1;


import java.util.*;

class Course
{
    private int Course_Id;
    private String Course_Name;
    private String Course_Admin;
    private int Quiz;
    private int Handson;

    Course(int Course_Id,String Course_Name,String Course_Admin,int Quiz,int Handson)
    {
        this.Course_Id = Course_Id;
        this.Course_Name = Course_Name;
        this.Course_Admin = Course_Admin;
        this.Quiz = Quiz;
        this.Handson = Handson;
    }

    public int getCourse_Id() {
        return Course_Id;
    }

    public void setCourse_Id(int course_Id) {
        Course_Id = course_Id;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public String getCourse_Admin() {
        return Course_Admin;
    }

    public void setCourse_Admin(String course_Admin) {
        Course_Admin = course_Admin;
    }

    public int getQuiz() {
        return Quiz;
    }

    public void setQuiz(int quiz) {
        Quiz = quiz;
    }

    public int getHandson() {
        return Handson;
    }

    public void setHandson(int handson) {
        Handson = handson;
    }
}

public class Exam {
    public static void main(String args[])
    {
        System.out.println("Hello Prajeesh...");
        System.out.println("Enter Some Details..");
        int ArraySize = 4;

        Scanner in = new Scanner(System.in);
        Course[] courses = new Course[ArraySize];

        // Loop to accept input for 4 courses
        for(int i=0;i<ArraySize;i++)
        {
            System.out.println(" ");
            System.out.println("Enter The Course ID : ");
            int course_id = in.nextInt();in.nextLine();

            System.out.println(" ");
            System.out.println("Enter Your Course Name : ");
            String course_name = in.nextLine();

            System.out.println(" ");
            System.out.println("Enter The Course Admin Name : ");
            String course_admin = in.nextLine();

            System.out.println(" ");
            System.out.println("Enter The Number Of Quiz : ");
            int course_quiz = in.nextInt();in.nextLine();

            System.out.println(" ");
            System.out.println("Enter The Handson Here : ");
            int course_handson = in.nextInt();in.nextLine();

            // Creating and storing the Course object in the array
            courses[i] = new Course(course_id,course_name,course_admin,course_quiz,course_handson);
        }


        System.out.println(" ");
        System.out.println(courses + " Hello");

        // Creating and storing the Course object in the array
        System.out.println("Enter the Admin : ");
        String ad = in.nextLine();

        // Creating and storing the Course object in the array
        System.out.println("Enter The HandSon");
        int hand = in.nextInt();

        // Call to findAvgOfQuizByAdmin method and storing result
        int ans = FindAvgOfQuizByAdmin(courses,ad);

        // Checking if the average quiz score is found and printing the result
        if (ans != 0)
        {
            System.out.println(ans); // Print average if found
        }else {
            System.out.println("Sorry No Course Found.."); // If no course matches the admin
        }

        // Call to sortCourseByHandsOn method and storing result
        Course[] ans2 = sortCourseByHandsOn(courses,hand);

        // Checking if any courses match the criteria and printing course names
        if (ans2 != null)
        {
            for (int d=0;d<ans2.length;d++)
            {
                System.out.println(ans2[d].getCourse_Name());
            }
        }else {
            System.out.println("Sorry No Course Available Based on Your Attributes...");
        }
    }

    // Static method to find the average quiz score for a given course admin
    public static int FindAvgOfQuizByAdmin(Course course[],String admins)
    {
        int sum = 0,count = 0;

        // Looping through the array of Course objects
        for (int p=0;p<course.length;p++)
        {
            // Checking if course admin matches the input admin (case-insensitive)
            if(course[p].getCourse_Admin().equalsIgnoreCase(admins))
            {
                sum = sum + course[p].getQuiz(); // Add quiz score to the sum
                count++; // Increment count of matching courses
            }

        }

        // If at least one course is found, calculate and return the average
        if (count > 0)
        {
            int avg = sum/count;
            return avg; // Return the integer average of quiz scores
        }
        else {
            return 0; // Return 0 if no courses found for the admin
        }

    }

    // Static method to filter and sort courses by handson count
    public static Course[] sortCourseByHandsOn(Course course[],int threadsHold)
    {
        //CREATING THE ARRAY LIST TO SORT THE VALUE BASED ON HANDSON
        List<Course> FilteredCources = new ArrayList();

        //LOOP TO ADD LESS VALUE IN THE FILTEREDCOURSES ARRAY LIST
        for (int a=0;a < course.length;a++)
        {
            if (course[a].getHandson() < threadsHold)
            {
                FilteredCources.add(course[a]); // WHILE COURSE IS MATCHING THEN IT WILL BE ADDING IN THE LIST
            }
        }

        // Sorting the filtered courses by handson count in ascending order
        Collections.sort(FilteredCources, new Comparator<Course>() {

            @Override
            public int compare(Course o1, Course o2) {
                return Integer.compare(o1.getHandson(), o2.getHandson());
            }

        });

        // If there are matching courses, convert the list to an array and return it
        if (!FilteredCources.isEmpty())
        {
            return FilteredCources.toArray(new Course[0]); // Return null if no courses match the threshold

        }else {

            return null;
        }


    }
}

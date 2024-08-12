public class Student {

    private String name;
    private String regno;
    private int year;
    private String sex;
    private String dob;
    private int marks1;
    private int marks2;
    private int marks3;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getDob() {
        return dob;
    }

    public void setDob(int year,int month,int day) {
        this.dob = "year :"+year+"  month :"+month+"  day :"+day;
    }


    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }


    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }


    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public void setMarks(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int[] getMarks() {
        return new int[]{marks1, marks2, marks3};
    }
    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }


    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }


    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + regno);
        System.out.println("Year: " + year);
        System.out.println("Sex: " + sex);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
    }
}

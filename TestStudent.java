public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sandaruwan");
        student.setRegno("2022sp157");
        student.setYear(1);
        student.setSex("Male");
        student.setDob(2001,07,25);
        student.setMarks(85, 95, 88);
//        int[] marks = student.getMarks();
//        System.out.println("Marks 1: " + marks[0]);
//        System.out.println("Marks 2: " + marks[1]);
//        System.out.println("Marks 3: " + marks[2]);

//        student.displayStudentInfo();
        System.out.println(student.getDob());
    }
}

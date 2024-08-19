public class StudentDriver {
    public static void main(String[] args) {
        Student john = new Student();
        System.out.println(john.getid());

        Student chai = new Student("6521612","chai","N");
        System.out.println(chai.getfirstname()+" "+chai.getlastname());
        System.out.println(chai.getid());
//        System.out.println(chai.getMajor());
        chai.setMajor("DDI");
        System.out.println(chai.getMajor());
        chai.setScoore(100);
        System.out.println(chai);
        System.out.println(chai.calcualteGrade());
        System.out.println(john.calcualteGrade());
    }
}

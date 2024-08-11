package second;

class Student {
    private int id;
    private String name;
    private int age;
    private int grade;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        
        this.age = age;
    }
    public Student(int id, String name, int age, int grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    
    public static void main(String[] args) {
      
        Student student1 = new Student(1, "priya");
        student1.displayStudent();
        
        Student student2 = new Student(2, "sri", 20);
        student2.displayStudent();
        
        Student student3 = new Student(3, "manisha", 22, 12);
        student3.displayStudent();
    }
}


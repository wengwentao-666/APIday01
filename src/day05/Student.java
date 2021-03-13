package day05;   // 不同包不是父子       可用public
                 // 不同包但是是父子关系  可用 public   protected
                 // 同包不是父子         可用 public   protected default
                 // 同包是父子          可用 public  protected default  private

public class Student extends Person {
    int score;
    public Student(String name){
        super(name);
    }
    public Student(){
        super("志向");   // 给父类写方法
    }

    public static void main(String[] args) {
        Student a1 = new Student();
        System.out.println(a1.name);
        a1.sleep();
    }
}

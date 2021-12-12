package class_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("홍길동", 20, 175, 70, "20170101", 1, 4.5);
		Student student2 = new Student("이순신", 20, 175, 70, "20170101", 1, 4.5);
		student1.show();
		student2.show();
		Student[] students = new Student[100];
		for(int i = 0; i < 100; i++)
		{
			students[i] = new Student("홍길동", 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}
		Teacher teacher1 = new Teacher("김홍중", 27, 175, 70, "20140001", 3000000, 5);
		teacher1.show();
		
	}

}

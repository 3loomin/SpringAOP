package spring.aop;

import spring.aop.entity.Exam;
import spring.aop.entity.NewExam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new NewExam(1,1,1,1);
		
		
		System.out.printf("total is %d",exam.total());

	}

}

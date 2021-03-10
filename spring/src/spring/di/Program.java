package spring.di;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {
	public static void main(String[] args) {
		//ExamConsole console = new InlineExamConsole(exam);
		/*
		Exam exam = new NewExam(); //부품1
		ExamConsole console = new GridExamConsole();//부품2
		
		
		console.setExam(exam);//결합 
		스프링 지시서로 변환!!
		*/
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//ExamConsole console = (ExamConsole) context.getBean("console");
		Exam exam=context.getBean(Exam.class);
		System.out.println(exam.toString());
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewExam(1,1,1,1));
		//for (Exam e : exams)
		//	System.out.println(e);
		
		
	}
}

package spring.di.entity;

public class NewExam implements Exam {
	private int kor;
	private int eng;
	private int math;
	private int com;
	
	public NewExam() {
		
	}
	
	
	public NewExam(int kor, int eng, int math, int com) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}


	@Override
	public String toString() {
		return "NewExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}


	@Override
	public int total() {
		return kor+eng+math+com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public float avg() {
		return total()/4.0f;
	}

}

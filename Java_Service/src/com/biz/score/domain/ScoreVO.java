package com.biz.score.domain;

public class ScoreVO 
{
	private final int maxClassCnt = 3;
	private String num;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	
	
	public int getMaxClassCnt()
	{
		return maxClassCnt;
	}
	
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
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
}

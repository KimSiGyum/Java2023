package s0904;

import java.util.Scanner;

public class RobotRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("로봇 선택: ");
		Scanner s = new Scanner(System.in);
		String myRobot = s.next();
		
		Race race1 = new Race("A");
		Race race2 = new Race("B");
		Race race3 = new Race("C");
		
		race1.start();
		race2.start();
		race3.start();
		
		
	}

}



class Race extends Thread{
	static int score = 0;
	int myscore = 0;
	String name;
	Race(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(name.equals("A")) {
				System.out.println("A");
			}
			else if(name.equals("B")) {
				System.out.println("\tB");
			}
			else if(name.equals("C")) {
				System.out.println("\t\tC");
			}
		}
		score = score + 1;
		myscore = score;
		System.out.println(name + "가 결승선에 도착함");
		System.out.println(name + ": "+ myscore + "등");
	}
}
package s0904;

public class SingleThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.print("* ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(". ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

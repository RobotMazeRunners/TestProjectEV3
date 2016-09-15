package main;

//Will implement the logic/actions conducted by the Movement (motors) object.
public class MovementThread implements Runnable {
	
	Robot rbt;
	
	public MovementThread(Robot rbt){
		this.rbt = rbt;
	}

	@Override
	public void run() {
		try {
			while (rbt.active){
				rbt.forward();
				rbt.checkActive();
				Thread.sleep(500);
			}
		} catch (Exception ex) {
			
		}
	}

}

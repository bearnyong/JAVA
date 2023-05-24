package section03.abstaction;

public class Car {
	/* 시동을 켜거나 끄거나, 앞으로 가거나 멈추거나 하는 행동은 시동이 걸려있는지의 상태를 확인해야 한다.
	 * 즉 메소드 간에 서로 공유해야 하는 속성이 존재한다.
	 * 그것을 필드에 작성할 것이다.*/

	private boolean isOn;
	private int speed;
	
	public void startUp() {
		if(isOn) {
			System.out.println("이미 시동이 걸려 있습니다.");
			
		} else {
			this.isOn = true;
			System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
		}
	}
	
	
	public void go() {
		if(isOn)
		{
			System.out.println("차가 앞으로 움직입니다.");
			this.speed += 10;
			} else {
				System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
			}
	}
	
	public void stop() {
		if(isOn) {
			if(this.speed>0) {
				this.speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
			}else {
				System.out.println("차의 시동이 걸려있지 않았습니다. 시동을 먼저 걸어주세여.");
			}
		}
	}
	
	public void turnoff() {
		/* 시동이 걸려있는 상태인 경우 시동을 끄고, 이미 꺼진 상태라면 이미 꺼져있다고 출력한다.
		 * 달리고 있는 상태인 경우 우선 차를 멈추라고 안내한다.*/
		
		if(isOn) {
			if(speed>0) {
				System.out.println("달리는 상태에서는 시동을 끌 수 없습니다. 차를 우선 멈춰주세요");
			}else {
				this.isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하시려면 시동을 켜주세요");
			}
		}else {
			System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해 주세요.");
		}
	}
}

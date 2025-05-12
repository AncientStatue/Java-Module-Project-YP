public class Race {
	private String leadingCarName = "";
	private int distanceLeaderWent = 0;
	private final int time = 24;
	public void findLeader(Car car) {
		int distance = this.time * car.speed;
		if(distance > this.distanceLeaderWent) {
			this.leadingCarName = car.name;
		}
	}
	public String getLeadingCarName() {
		return this.leadingCarName;
	}
}

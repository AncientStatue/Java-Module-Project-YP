public class Race {
	String leadingCarName = "";
	int distanceLeaderWent = 0;
	int time = 24;
	public String findLeader(String name, int speed) {
		int distance = this.time * speed;
		if(distance > this.distanceLeaderWent) {
			this.leadingCarName = name;
			return this.leadingCarName;
		} else {
			return this.leadingCarName;
		}
	}
}

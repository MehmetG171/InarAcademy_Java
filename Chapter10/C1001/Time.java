package PackageChapter10;

public class Time {

	private long hour;
	private long minute;
	private long second;
	private long milliseconds;

	Time() {
		milliseconds = System.currentTimeMillis();
	}

	Time(long time) {
		milliseconds = time;
	}

	public Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		hour = (milliseconds / (1000 * 60 * 60)) % 24;
		return hour;
	}

	public long getMinute() {
		minute = (milliseconds / (1000 * 60)) % 60;
		return minute;
	}

	public long getSecond() {
		second = (milliseconds / 1000) % 60;
		return second;
	}

	void setTime(long elapseTime) {
		milliseconds = elapseTime;
	}

}

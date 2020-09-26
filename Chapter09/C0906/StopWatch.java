package PackageChapter09;

class StopWatch {

	private long startTime;
	private long endTime;

	StopWatch() {
		startTime = System.currentTimeMillis();
	}

	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	void start() {
		startTime = System.currentTimeMillis();
	}

	void stop() {
		endTime = System.currentTimeMillis();
	}

	long getElapsedTime() {
		return endTime - startTime;
	}
}
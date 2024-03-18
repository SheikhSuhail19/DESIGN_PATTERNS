
public class ThreadSafeSingletonOptimized {

	private static ThreadSafeSingletonOptimized instance;

	private ThreadSafeSingletonOptimized(){}

	public static ThreadSafeSingletonOptimized getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingletonOptimized.class) {
				if (instance == null) {
					instance = new ThreadSafeSingletonOptimized();
				}
			}
		}
		return instance;
	}

}
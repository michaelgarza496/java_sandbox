package jade;

import static org.lwjgl.glfw.GLFW.GLFW_PRESS;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;

public class MouseListener {
	private static MouseListener instance;
	private double scrollX;
	private double scrollY;
	private double xPos;
	private double yPos;
	private double lastY;
	private double lastX;
	private boolean[] mouseButtonPressed;
	private boolean isDragging;
	
	private MouseListener(double scrollX, double scrollY, double xPos, double yPos, double lastY, double lastX,
			boolean[] mouseButtonPressed, boolean isDragging) {
		super();
		this.scrollX = scrollX;
		this.scrollY = scrollY;
		this.xPos = xPos;
		this.yPos = yPos;
		this.lastY = lastY;
		this.lastX = lastX;
		this.mouseButtonPressed = mouseButtonPressed;
		this.isDragging = isDragging;
	}
	
	public static MouseListener get() {
		if (MouseListener.instance == null)
			MouseListener.instance = new MouseListener(0, 0, 0, 0, 0, 0, new boolean[3], false);
		return MouseListener.instance;
	}
	
	public static void mousePosCallback(long window, double xPos, double yPos) {
		get().lastX = get().xPos;
		get().lastY = get().yPos;
		get().xPos = xPos;
		get().yPos = yPos;
	}
	
	public static void mouseButtonCallback(long window, int button, int action, int mods) {
		if (action == GLFW_PRESS && button < get().mouseButtonPressed.length)
			get().mouseButtonPressed[button] = true;
		else if (action == GLFW_RELEASE && button < get().mouseButtonPressed.length) {
			get().mouseButtonPressed[button] = false;
			get().isDragging = false;
		}
	}
	
	public static void mouseScrollCallback(long window, double xOffset, double yOffset) {
		get().scrollX = xOffset;
		get().scrollY = yOffset;
	}
	
	public static void endFrame() {
		get().scrollX = 0;
		get().scrollY = 0;
		get().lastX = get().xPos;
		get().lastY = get().yPos;
	}
	
	public static float getX() {
		return (float) get().xPos;
	}
	
	public static float getY() {
		return (float) get().yPos;
	}
	
	
}






















package david.exames.exame3;

public class _67 {

	public static void main(String[] args) {
		Triangle.main(args);
	}

}


class Triangle{
    public int base;
    public int height;
    private final double ANGLE;

    public  void setAngle(double a){  ANGLE = a;  }
    
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.setAngle(90);
    }
}
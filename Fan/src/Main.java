public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        if ( fan1.isOn() == true){

            System.out.println("speed : "+fan1.getSpeed()+" color : "+fan1.getColor()+" radius : "+fan1.getRadius()+" fan is on");
        } else {
            System.out.println("fan is off");
        }

    }
}

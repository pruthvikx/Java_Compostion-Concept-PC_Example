public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor("aoc","aoc",27,new Resolution(15,27));
        Case theCase = new Case("dell","dell","240",new Dimensions(12,23,34));
        Motherboard theMotherboard = new Motherboard("TX-1000","Asus",4,6,"v2.01");

        PC thePC = new PC(theMotherboard, monitor , theCase);
        thePC.getTheMonitor().drawPixelAt(1500,1200,"green");
        thePC.getTheMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

    }
}

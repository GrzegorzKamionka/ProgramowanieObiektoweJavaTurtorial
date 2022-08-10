package ProgramowanieObiektowe.USBDevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;

    public static String ANOTHER_NAME = "memory stick Grzegorz";

    public MemoryStick(String name){
        this.name = name;
    }
    @Override
    public boolean connect() {
        System.out.println("Memory stick connect");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected)
        {
            System.out.println("Please eject Memory Stick first");
            return false;
        }
        else{
            System.out.println("Memory Stick disconnected");
            return true;
        }
    }

    public void eject(){
        System.out.println("Memory Stick is ejected" );
        ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}

package pe.edu.upc.first.business;
import pe.edu.upc.first.component.Processor;
import pe.edu.upc.first.component.Ram;
import pe.edu.upc.first.component.Storage;
import pe.edu.upc.first.component.MotherBoard;
import pe.edu.upc.first.component.Case;
import pe.edu.upc.first.component.PowerSupply;
import pe.edu.upc.first.component.GraphicsCard;



public class Computer {
    private Processor processor = new Processor();
    private Ram ram = new Ram();
    private Storage storage = new Storage();
    private MotherBoard motherboard = new MotherBoard();
    private GraphicsCard gpu = new GraphicsCard();
    private Case _case = new Case();
    private PowerSupply powerSupply = new PowerSupply();

    public Computer(){}//constructor


    public void addProcessor(){}
    public void addRam(){}
    public void addStorage(){}
    public void addMotherboard(){}
    public void addGpu(){}
    public void addCase(){}
    public void addPowerSupply(){}
    public void editComponent(){}
    public void deleteComponent(){}
}
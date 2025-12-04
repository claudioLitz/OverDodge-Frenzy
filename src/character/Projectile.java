package character;
import java.util.Arrays;

public class Projectile {
    private int posProjX;
    private int posProjY;
    private int[] origin;
    private int accel;
    private int dmg;
    private String direction;



    //Contructor method
    public Projectile(int posProjX, int posProjY, int[] origin, int accel, int dmg, String direction){
        this.posProjX = posProjX;
        this.posProjY = posProjY;
        this.origin = origin;
        this.accel = accel;
        this.dmg = dmg;
        this.direction = direction;
    }

    //Set methods
    public void SetposProjX(int posProjX){
        this.posProjX = posProjX;
    }
    public void SetposProjY(int posProjY){
        this.posProjY = posProjY;
    }
    public void Setorigin(int[] origin){
        this.origin = origin;
    }
    public void Setaccel(int accel){
        this.accel = accel;
    }
    public void Setdmg(int dmg){
        this.dmg = dmg;
    }
    public void Setdirection(String direction){
        this.direction = direction;
    }



    
    public void ShowStatus(){
        System.out.println("Position x = " + this.posProjX);
        System.out.println("Position y = " + this.posProjY);
        System.out.println("Origin = " + Arrays.toString(this.origin));
        System.out.println("Acceleration = " + this.accel);
        System.out.println("damage = " + this.dmg);
        System.out.println("direction = " + this.direction);
    }



    protected void move(){

    }

    protected void foreshadow(){

    }

    protected void hitboxUPD(){


    }


}

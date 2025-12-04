package character;
import java.util.Arrays;

public class Projectile {
    public int posProjX;
    public int posProjY;
    public int[] origin;
    public int accel;
    public int dmg;
    public String direction;




    public Projectile(int posProjX, int posProjY, int[] origin, int accel, int dmg, String direction){
        this.posProjX = posProjX;
        this.posProjY = posProjY;
        this.origin = origin;
        this.accel = accel;
        this.dmg = dmg;
        this.direction = direction;


    }

    public void GetStatus(){
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

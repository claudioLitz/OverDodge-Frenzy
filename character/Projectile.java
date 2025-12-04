
import java.util.Arrays;

public class Projectile {
    protected int posProjX;
    protected int posProjY;
    protected int[] origin;
    protected int accel;
    protected int dmg;
    protected String direction;







    protected void SetProjectile(int posProjX, int posProjY, int[] origin, int accel, int dmg, String direction){
        this.posProjX = posProjX;
        this.posProjY = posProjY;
        this.origin = origin;
        this.accel = accel;
        this.dmg = dmg;
        this.direction = direction;


    }

    protected void GetStatus(){
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

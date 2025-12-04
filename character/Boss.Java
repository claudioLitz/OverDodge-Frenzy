public class Boss {
    pubic BufferedImage sprite;
    pubic int[] Coords;



    public void SetBoss(int[] Coords){
        this.Coords = Coords;
    }

    public void GetStatus(){
        System.out.println("A posição do boss é " + this.Coords);
    }
    public void Attack(){
        //must return a value to Projectile class, for it to instantiate a new object from the referred class
    }

    public void reSprite(){
        //must import a new image to use as current sprite
    }
}
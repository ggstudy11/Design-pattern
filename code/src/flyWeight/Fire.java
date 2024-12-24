package flyWeight;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 1:56 PM
 * @description：
 * @modified By：
 */
public class Fire implements Particle {
    private int x;
    private int y;
    private SharedParticle sharedParticle;
    public Fire(int x, int y, SharedParticle sharedParticle) {
        this.x = x;
        this.y = y;
        this.sharedParticle = sharedParticle;
    }
    public SharedParticle getSharedParticle() {
        return sharedParticle;
    }
    @Override
    public void draw() {
        System.out.println("Fire" + "X: " + x + "Y: " + y + "sharedParticle: " + sharedParticle);
    }
}

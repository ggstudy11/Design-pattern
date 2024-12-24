package flyWeight;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:05 PM
 * @description：
 * @modified By：
 */
public class client {
    public static void main(String[] args) {
        Fire red = new Fire(1, 0, SharedParticleFactory.getSharedParticle("red"));
        Fire green = new Fire(2, 0, SharedParticleFactory.getSharedParticle("green"));
        Fire red2 = new Fire(3, 0, SharedParticleFactory.getSharedParticle("red"));
        red.draw();
        green.draw();
        System.out.println(red.getSharedParticle() == red2.getSharedParticle());
    }
}

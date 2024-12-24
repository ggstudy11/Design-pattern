package facade;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:13 PM
 * @description：
 * @modified By：
 */
public class Facade {
    private Video video;
    public Facade(Video video) {
        this.video = video;
    }
    public void watchTv() {
        video.on();
        video.soundUp();
        video.display();
    }
}

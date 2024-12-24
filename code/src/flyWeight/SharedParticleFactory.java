package flyWeight;

import java.util.HashMap;

/**
 * @author ：ggstudy11
 * @version :
 * @date ：Created in 12/24/2024 2:01 PM
 * @description：
 * @modified By：
 */
public class SharedParticleFactory {
    private static HashMap<String, SharedParticle> map = new HashMap<>();
    public static SharedParticle getSharedParticle(String color) {
        SharedParticle sp = map.get(color);
        if (sp == null) {
            sp = new SharedParticle(color);
            map.put(color, sp);
        }
        return sp;
    }
}

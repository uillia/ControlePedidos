package util;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/**
 *
 * @author uillia
 */
public class EnvMap {

    public void set(Map<String, String> newenv) throws Exception {
        Class[] classes = Collections.class.getDeclaredClasses();
        Map<String, String> env = System.getenv();
        for (Class cl : classes) {
            if ("java.util.Collections$UnmodifiableMap".equals(cl.getName())) {
                Field field = cl.getDeclaredField("m");
                field.setAccessible(true);
                Object obj = field.get(env);
                Map<String, String> map = (Map<String, String>) obj;
                map.clear();
                map.putAll(newenv);
            }
        }
    }
    @SuppressWarnings({ "unchecked" })
  public void updateEnv(String name, String val) throws ReflectiveOperationException {
    Map<String, String> env = System.getenv();
    Field field = env.getClass().getDeclaredField("m");
    field.setAccessible(true);
    ((Map<String, String>) field.get(env)).put(name, val);
  }
    

}

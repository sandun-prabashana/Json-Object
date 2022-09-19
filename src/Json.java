/**
 * @author Sandun Prabashana <sandunprabashana@gmail.com> (prabashana.tk/)
 * @since 9/19/2022
 */

import org.json.simple.JSONObject;

public class Json {
    public static void main(String args[]) {

        JSONObject file = new JSONObject();

        file.put("data 1", "1111");
        file.put("data 2", "2222");
        file.put("data 3", "3333");

        System.out.print(file);
    }
}

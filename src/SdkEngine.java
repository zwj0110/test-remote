import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SdkEngine {
    //BlockingQueue
    private static Logger logger = Logger.getGlobal();
    private static final String en = "en";//e_cr
    private static final String u_mid = "u_mid";
    private static final String u_oid = "oid";
    private static final String ver = "ver";
    private static final String c_time = "c_time";
    private static final String pl="pl";
    private static final String sdk = "sdk";
    private static Map<String,String> map = new ConcurrentHashMap<String, String>();
    public static boolean chargeSuccess(String oid, String mid,String flag) {
        if (isEmpty(oid) || isEmpty(mid)) {
            logger.log(Level.WARNING, "oid:" + oid + ",mid:" + mid + "is null");
            return false;
        }
        map.put(u_mid,mid);
        map.put(u_oid,oid);
        map.put(ver,"1");
        map.put(c_time,System.currentTimeMillis()+"");
        map.put(pl,"jdk");
        map.put(sdk,"java");
        map.put(en,flag);
        //拼接URL

        //TODO 发送URL请求

        return false;
    }



    public static boolean isEmpty(String input) {
        return input == null || input.trim().equals("") || input.trim().length() == 0 ? true : false;
    }

    public static boolean isNotEmpty(String input) {
        return !isEmpty(input);
    }
}

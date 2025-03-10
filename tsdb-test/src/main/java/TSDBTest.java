import cn.edu.ruc.start.TSBM;

public class TSDBTest {
    private static String dataPath = "";

    public static void main(String[] args) throws Exception {
//        String dataPath = "/Users/fasape/project/tsdb-test/";
//        String className = "cn.edu.ruc.InfluxdbAdapter";
//        String ip = "10.77.110.226";
//        String port = "8086";
//        String userName = "root";
//        String passwd = "root";
//        TSBM.generateData(dataPath);
//        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, false);
//        testTimescaledb();
//        testInfluxdb();
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        dataPath = args[2];
        if ("1".equals(args[0])) {
            if ("1".equals(args[1])) {
                testInfluxdb(true, args[3]);
            }
            if ("2".equals(args[1])) {
                testInfluxdb(false, args[3]);
            }
            if ("0".equals(args[1])) {
                TSBM.generateData(dataPath);
            }
        }
        if ("2".equals(args[0])) {
            if ("0".equals(args[1])) {
                TSBM.generateData(dataPath);
            }
            if ("1".equals(args[1])) {
                testTimescaledb(true, args[3]);
            }
            if ("2".equals(args[1])) {
                testTimescaledb(false, args[3]);
            }
        }
        if ("3".equals(args[0])) {
            if ("0".equals(args[1])) {
                TSBM.generateData(dataPath);
            }
            if ("1".equals(args[1])) {
                testIotdb(true, args[3]);
            }
            if ("2".equals(args[1])) {
                testIotdb(false, args[3]);
            }
        }
        if ("4".equals(args[0])) {
            if ("0".equals(args[1])) {
                TSBM.generateData(dataPath);
            }
            if ("1".equals(args[1])) {
                testOpentsdb(true, args[3]);
            }
            if ("2".equals(args[1])) {
                testOpentsdb(false, args[3]);
            }
        }
        if ("5".equals(args[0])) {
            if ("0".equals(args[1])) {
                TSBM.generateData(dataPath);
            }
            if ("1".equals(args[1])) {
                testDruid(true, args[3]);
            }
            if ("2".equals(args[1])) {
                testDruid(false, args[3]);
            }
        }

    }

    public static void testIotdb(boolean loadParam, String scale) {
//        String dataPath = dataPath;
        String className = "cn.edu.ruc.IotdbAdapter";
        String ip = "127.0.0.1";
        String port = "6667";
        String userName = "root";
        String passwd = "root";
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, loadParam, scale);
    }

    public static void testInfluxdb(boolean loadParam, String scale) {
//        String dataPath = "/Users/fasape/project/tsdb-test/";
        String className = "cn.edu.ruc.InfluxdbAdapter";
        String ip = "127.0.0.1";
        String port = "8086";
        String userName = "root";
        String passwd = "root";
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, loadParam, scale);
    }

    public static void testTimescaledb(boolean loadParam, String scale) {
//        String dataPath = "/Users/fasape/project/tsdb-test/";
        String className = "cn.edu.ruc.TimescaledbAdapter";
        String ip = "127.0.0.1";
        String port = "5432";
        String userName = "postgres";
        String passwd = "postgres";
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, loadParam, scale);
    }

    public static void testOpentsdb(boolean loadParam, String scale) {
        String className = "cn.edu.ruc.OpentsdbAdapter";
        String ip = "127.0.0.1";
        String port = "4242";
        String userName = "root"; //not required
        String passwd = "root"; //not required
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, loadParam, scale);
    }

    public static void testDruid(boolean loadParam, String scale) {
        String className = "cn.edu.ruc.DruidAdapter";
        String ip = "127.0.0.1";
        String port = "";
        String userName = "root"; //not required
        String passwd = "root"; //not required
        TSBM.startPerformTest(dataPath, className, ip, port, userName, passwd, false, loadParam, scale);
    }
}

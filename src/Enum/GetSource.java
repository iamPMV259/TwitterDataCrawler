package Enum;

import java.nio.file.Paths;

public class GetSource {

    public static final String pathOfChromeDriver = getSource("TwitterDataCrawler/resources", "chromedriver.exe");
    public static final String pathOfInfor = getSource("TwitterDataCrawler/resources", "infor.txt");
    public static final String pathOfHashTag = getSource("TwitterDataCrawler/resources", "hashtag.txt");
    public static final String pathOfOutput = getSource("TwitterDataCrawler/Output","data.csv");
    public static final String webChrome = "webdriver.chrome.driver";
    public static final String webLoginTwitter = "https://x.com/login";

    public static final int maxOfFolowers = 50000;
    public static final int MAX_BLOCKS = 50;
    public static final int collectionLimitation = 200;
    public static void main(String[] args) {
        System.out.println(pathOfOutput + "123324");
    }
    private static String getSource(String parent, String path) {
        return Paths.get(parent, path).toAbsolutePath().toString();
    }
}

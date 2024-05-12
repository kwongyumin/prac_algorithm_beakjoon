import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws Exception{

        // 아스키코드를 통해 문자열로부터 정수를 추출하려했으나
        // 필요이상으로 코드의 복잡도가 올라감
        // 정규표현식을 사용하여 코드를 간결하게 만들 수 있음.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("([\\d]+)"); // 문자열로부터 숫자만 추출
        Matcher matcher;

        int N = Integer.parseInt(br.readLine());
        ArrayList<BigDecimal> arr = new ArrayList<>();

        while (N-- > 0) {
            String s = br.readLine();
            matcher = pattern.matcher(s);
            while (matcher.find()) {
                arr.add(new BigDecimal(matcher.group())); // 정규식에서 매칭된 부분만 반환
            }
        }
        
        arr.sort(Comparator.naturalOrder());
        for (BigDecimal bd : arr ) {
            System.out.println(bd);
        }
    }
}

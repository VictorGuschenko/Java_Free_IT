
/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */
public class Task20_PrintLastCharactersOfWords {
    public static void main(String[] args) {
        String text = "Oracle Cloud Infrastructure is an IaaS that delivers on-premises, " +
                "high-performance computing power to run cloud native and enterprise " +
                "company’s IT workloads. OCI provides real-time elasticity for enterprise " +
                "applications by combining Oracle's autonomous services, integrated security, " +
                "and serverless compute. Available for public cloud.";
        String [] wordsArr = text.split("\\W?[ -.]+");
        for (String s : wordsArr) {
            System.out.println(s.charAt(s.length() -1));
        }

    }
}

public class StringExample {
    public static void main(String[] args) {
        char[] c = {'S','A','T','H','W','K'};
        // String name=c.toString(); // Wrapper class
        String name=new String(c);
        System.out.println(name);

        String jumbled="Gowda1Is1From1ISE1B1Section";
        String[] words=jumbled.split("1");
        System.out.println(words[5]);

        for (Object obj : words){
            System.out.print(obj+ " ");
        }
        System.out.println();
        String data="          SNPSU       ISE                      ";
        System.out.println(data.trim());
    }
}
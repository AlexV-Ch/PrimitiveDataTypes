public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания :
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        //char a1 = 'Ё';
        //char a2 = 'ё';
        //int codeA1 = a1;
        //int codeA2 = a2;
        //System.out.println(codeA1);
        //System.out.println(codeA2);
        //System.out.println(alfavit);


        String alfavit = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            if (alfavit.contains(String.valueOf(c))) {
                System.out.println(i + " - " + c);
            }
        }

    }
}

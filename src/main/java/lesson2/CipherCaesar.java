package lesson2;

public class CipherCaesar {

//    public static void main(String[] args) {
//        String mas = "Привет, как дела?";
//        String mas1 = caesar(mas, 2, true);
//        System.out.println(mas1);
//        System.out.println(caesar(mas1, 2, false));
//    }


    public static String caesar(String in, int key, boolean encrypt){ // Шифр Цезаря
        if (in == null || in.isEmpty()) return null;

        char[] out = new char[in.length()];
        for (int i = 0; i < in.length(); i++) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
        }
        return new String(out);
    }
}

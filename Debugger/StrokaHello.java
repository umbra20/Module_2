package Module_2.Debugger;

public class StrokaHello {
    public static void main()
    {
        String str = "Привет, Александр, с праздником, с Новым Годом";
        String t = "";
        System.out.println(str);
        System.out.println();
        for (int x = 0; x < str.length(); x++)
        {
            char c = str.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t + Character.toLowerCase(c);
            else
                t = t + Character.toUpperCase(c);
        }
        System.out.println ("Измененная строка: " + t);
    }

}
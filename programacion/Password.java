// autor Oriana Reina

import java.util.Scanner;

public class Password {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa tu contrasenha y te dire si es segura");
        Scanner userEntry = new Scanner(System.in);
        String pass = userEntry.nextLine();

        if (pass.length() < 10) {
            System.out.println("La contrasenha debe tener al menos 10 caracteres");
        } else {
            validatePass(pass);
        }
        userEntry.close();
    }

    static String validatePass(String pass) {
        if (pass.matches("(?=.*[0-9]).*")
                && pass.matches("(?=.*[a-z]).*")
                && pass.matches("(?=.*[A-Z]).*")
                && pass.matches("(?=.*[$&+,:;=\\\\?@#|/'<>.^*()%!-]).*")) {
            System.out.println("La contrasenha es segura");
        } else {
            System.out.println("La contrasenha no es segura");
            System.out.println(
                    "Recuerda, una contrasenha segura debe contener al menos una mayuscula, una minuscula, un número y un caracter especial");
        }

        return "";
    }
}

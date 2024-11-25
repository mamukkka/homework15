package org.example;

public class While {
    public static void main(String[] args) {
        // მეორე დავალება

        String name = "www.drizzling.cz"; // სტრიქონი რომელსაც ვამოწმებთ
        int i = 3;

        while (i < name.length()) {
            char character = name.charAt(i); // სტრიქონიდან იღებს სიმბოლოს i-თან დაკავშირებით
            System.out.println(character); // დაბეჭდავს მიმდინარე სიმბოლოს
            i = i+ 3; // i-ს მნიშვნელობა იზრდება 3-ით

            if (character == 'z') {  // სიმბოლო 'z'-ზე, ციკლი შეწყდება
                break;


            }
        }
    }

}

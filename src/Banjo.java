public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.substring(0,1).equalsIgnoreCase("r")) { //uso el substring para saber cual es el primer caracter de la palabra y el equalsIgnoreCase es para ignorar si es mayuscula o minuscula, determina las 2
            return name + " plays banjo";

        }else {
            return name + " does not play banjo";
        }

    }
    public static void main(String [] args) {
        String name = "Jose";
        String name1 = "Lucas";
        String name2 = "Asyra";
        String name3 = "Rubius";

        System.out.println(areYouPlayingBanjo(name));
        System.out.println(areYouPlayingBanjo(name1));
        System.out.println(areYouPlayingBanjo(name2));
        System.out.println(areYouPlayingBanjo(name3));

    }
}
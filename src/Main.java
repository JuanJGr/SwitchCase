/*El cambio en el switch de Java es que a partir de Java 12, el switch se puede usar
como una expresión que devuelve un valor, eliminando la necesidad de usar break.
Ahora, cada case se escribe con ->, y se puede devolver un valor directamente
Además, se puede usar yield para devolver valores desde bloques más complejos
dentro de un case. Esto hace el código más limpio y fácil de entender.*/

public class Main {
    public static void main(String[] args) {
        //Switch Case Antigueo
        int grade = 85;
        String performance;

        switch (grade / 50) {
            case 2:
                performance = "Excelente";
                break;
            case 1:
                performance = "Bien";
                break;
            default:
                performance = "Insuficiente";
                break;
        }

        System.out.println(performance);

        // Switch Case Nuevo
        String performanceExpression = switch (grade / 50) {  // Usamos /50 para agrupar en tres categorías
            case 2 -> "Excelente";
            case 1 -> "Bien";
            default -> "Insuficiente";
        };

        System.out.println(performanceExpression);
    }
}

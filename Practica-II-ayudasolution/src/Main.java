import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Objects;



class Main {
    static List<Estudiante> estudiantes;

    public static void main(String[] args) throws IOException {
        cargarArchivo();
        totalMujeres();
        totalHombres();
        estudiantePromedioMasPorDept();
        estudianteMayorPromedio();
        promCarrera();

    }

    static void cargarArchivo() throws IOException {
        String filename = "student-scores.csv";

        try (Stream<String> lines = Files.lines(Path.of(filename))) {
            estudiantes = lines.skip(1).map(line -> {
                try {
                    String[] arr = line.split(",");
                    double[] notas = Arrays.stream(arr).skip(11).mapToDouble(Double::parseDouble).toArray();
                    double promedio = Arrays.stream(notas).average().orElse(0.0); // Handle the case where the average might not be present
                    return new Estudiante(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9], arr[10], arr[11], arr[12], arr[13], arr[14], arr[15], arr[16], promedio);
                } catch (Exception e) {
                    // Handle any exception that occurs during processing of a line
                    System.err.println("Error processing a line: " + e.getMessage());
                    return null; // or handle the error by returning a default value, if appropriate
                }
            }).filter(Objects::nonNull).collect(Collectors.toList());
            estudiantes.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo en la ruta: " + filename);
            e.printStackTrace(); // Print the stack trace for debugging
            // Optionally, rethrow the exception if it's critical or needs to be handled at a higher level:
            // throw e;
        }
    }


    static Predicate<Estudiante> cuatroASeisMil =
            e -> (e.getPromedio() >= 4000 && e.getPromedio() <= 7000);


    static void totalMujeres() {
        System.out.printf("%nTotal de mujeres:%n");
        long totalMujeres = estudiantes.stream()
                .filter(e -> e.getGenero().equals("female"))
                .count();
        System.out.printf("%d%n", totalMujeres);
    }

    static void totalHombres() {
        System.out.printf("%nTotal de hombres:%n");
        long totalHombres = estudiantes.stream()
                .filter(e -> e.getGenero().equals("male"))
                .count();
        System.out.printf("%d%n", totalHombres);
    }


    static void estudiantePromedioMasPorDept() {
        Function<Estudiante, Double> porPromedio = Estudiante::getPromedio;
        Comparator<Estudiante> PromedioDescendete =
                Comparator.comparing(porPromedio);
        System.out.printf("%nEstudiantes por carrera: %n");
        Map<String, List<Estudiante>> agrupadoPorCarrera =
                estudiantes.stream()
                        .collect(Collectors.groupingBy(Estudiante::getCarrera));
        agrupadoPorCarrera.forEach(
                (carrera, estudiantesEnCarrera) ->
                {
                    System.out.print(carrera + ": ");
                    Estudiante estudiante = estudiantesEnCarrera.stream().sorted(PromedioDescendete.reversed())
                            .findFirst()
                            .get();
                    System.out.println(estudiante.getPrimerNombre() + " " + estudiante.getApellidoPaterno() +
                            " ///Cuanto promedio? ==> promedio: " + estudiante.getPromedio());
                }
        );
    }

    static void estudianteMayorPromedio() {
        System.out.printf("%nEstudiante con mayor promedio:%n");
        Estudiante estudianteMayorPromedio = estudiantes.stream()
                .max(Comparator.comparing(Estudiante::getPromedio))
                .get();
        System.out.println(estudianteMayorPromedio);
    }


    static void promCarrera() {
        Map<String, List<Estudiante>> agrupadoPorCarrera =
                estudiantes.stream()
                        .collect(Collectors.groupingBy(Estudiante::getCarrera));
        System.out.println("\nPromedio de salarios de los estudiantes por Depa:");

        agrupadoPorCarrera.forEach((departamento, estudiantesporDepa) -> {
            System.out.print(departamento + ": ");
            System.out.println(estudiantesporDepa
                    .stream()
                    .mapToDouble(Estudiante::getPromedio)
                    .average().orElse(0.0));
        });


    }

}

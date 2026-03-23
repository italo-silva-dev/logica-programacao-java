public class OperadorIncrementoDecremento {
 public static void main(String[] args) {
    int a = 30;
    int b = 30;
    System.out.println(a + " " + (a++) + " " + a);
    // O valor será primeiro apresentado na tela e somente depois será incrementado.

    System.out.println(b + " " + (++b) + " " + b);
    // O valor será primeiro incrementado e depois apresentado na tela.
    }   
}
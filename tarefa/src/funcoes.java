public class funcoes {
    
    public static int f1(int n) {
        int r = 0, op = 0;
        for (int i = 1; i < n; i++) {
            r = r + 1;
            op = op + 1;
        }
        return op;
    }

    public static int f2(int n) {
        int r = 0, op = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                op = op + 1;
                r = r + 2;
            }
        }
        return op;
    }

    public static int f3(int n) {
        int cont = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                // print i*j retirado para não poluir a saída do Excel
                cont++;
            }
        }
        return cont;
    }

    public static int f4(int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < 2 * i; j++) {
                for (int k = i; k < j; k++) {
                    r = r + 1;
                }
            }
        }
        return r;
    }

    public static int f5(int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < i + 3; j++) {
                for (int k = i; k < j; k++) {
                    r = r + 1;
                }
            }
        }
        return r;
    }

    public static long f6(int n) {
        if (n <= 0) return 1;
        // Cuidado: f6 cresce exponencialmente (2^n). 
        // n=100 vai travar seu PC. Usei long, mas limite o N no loop.
        return f6(n - 1) + f6(n - 1);
    }

    public static void main(String[] args) {
        // Cabeçalho para o Excel
        System.out.println("N;f1;f2;f3;f4;f5;f6");

        for (int n = 0; n <= 30; n += 5) { // Reduzi o limite para 30 por causa da f6
            System.out.print(n + ";");
            System.out.print(f1(n) + ";");
            System.out.print(f2(n) + ";");
            System.out.print(f3(n) + ";");
            System.out.print(f4(n) + ";");
            System.out.print(f5(n) + ";");
            System.out.println(f6(n));
        }
    }
}
public class print_number_N_to_1 {
    static void print_n_to_1(int n) {
        if (n < 1)
            return;
        System.out.println(n);
        print_n_to_1(n - 1); // agar n-- likh diya tab infinite loop me chala jaayega

    }

    public static void main(String[] args) {
        print_n_to_1(5);
    }
}

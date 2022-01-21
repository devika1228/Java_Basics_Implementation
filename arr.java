class arr {
    public static void main(String[] args) {
        // devlare an array: datatype[] arr_name;

        // double[] age;

        // allocate memory
        // age=new double[10];

        // double[] data=new double[10];

        // initialize
        int[] age = { 12, 2, 3, 1, 3 };

        // access
        // System.out.println("First Element use index 0: " + age[0]);

        /*
         * for (int i = 0; i < age.length; i++) {
         * System.out.println(age[i]);
         * }
         */

        // for each loop
        for (int a : age) {
            System.out.println(a);
        }

    }
}